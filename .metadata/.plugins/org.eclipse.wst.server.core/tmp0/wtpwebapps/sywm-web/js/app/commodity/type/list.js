$(function() {
	// 切换导航状态
	toggleNav(6, 1, 0);
	// 加载库区KV
	loadStorageAreasKV();
	// 加载商品分类树
	initZTree();
	// 初始化表单验证
	initValidForm();
});
// 加载库区KV
function loadStorageAreasKV() {
	$.ajax({
		url : basePath + '/storageAreas/kv',
		data : {

		},
		dataType : 'json',
		success : function(data) {
			var $select = $("#storageAreasIdSelect");
			$.each(data, function(i, v) {
				var option = document.createElement("option");
				$(option).val(v.value).text(v.text).appendTo($select);
			});
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}
// zTree
var zTreeObj;
// zTree setting
var setting = {
	view : {
		showLine : false,
		showIcon : false
	},
	callback : {
		onClick : function(event, treeId, treeNode, clickFlag) {
			// 加载商品分类详情
			loadCommodityType(treeNode.pId, treeNode.id, treeNode.parentTId);
		}
	}
};
// 加载商品分类树
function initZTree() {
	$.ajax({
		url : basePath + '/commodityType/queryTree',
		data : {

		},
		dataType : 'json',
		success : function(data) {
			// 初始化zTree
			zTreeObj = $.fn.zTree.init($("#tree"), setting, data);
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}
var i = 0;
var max = 0;
var searchNodes;
function search() {
	searchNodes = zTreeObj.getNodesByParamFuzzy("name", $("#searchKeywords")
			.val(), null);
	max = searchNodes.length;
	searchNext();
}
function searchNext() {
	if (max == 0) {
		return;
	}
	zTreeObj.cancelSelectedNode();
	if (i < max) {
		zTreeObj.selectNode(searchNodes[i], true, false);
		i++;
	} else {
		i = 0
		zTreeObj.selectNode(searchNodes[i], true, false);
		i++;
	}
}
// 新增商品分类
function addType() {
	if ($("#commodityTypeParentIdHide").val() == "") {
		alertWm("请为新增的商品分类指定上级分类");
		return;
	}
	$("#operate").val('add');
	$("#showParentNameLbl")
			.text(
					$("#commodityTypeCode").val() + " "
							+ $("#commodityTypeName").val());

	$("#commodityTypeName").removeAttr("disabled").attr("ajaxurl",
			basePath + "/commodityType/unique/commodityTypeName").attr(
			"datatype", "*");
	$("#commodityTypeCode").removeAttr("disabled").attr("ajaxurl",
			basePath + "/commodityType/unique/commodityTypeCode").attr(
			"datatype", "*");
	$("#commodityTypeParentIdHide").val($("#commodityTypeIdHide").val());
	$("#commodityTypeIdHide").val("");
	$("#commodityTypeName").val("");
	$("#commodityTypeCode").val("");
	$('#storageAreasIdSelect').find('option').eq(0).attr('selected', true);

	$("#submitBtn").removeAttr("disabled");
	$("#deleteBtn").removeAttr("disabled");
}
// 加载商品分类详情
function loadCommodityType(pId, id, parentTId) {
	$.ajax({
		url : basePath + '/commodityType/read/' + id,
		data : {

		},
		dataType : 'json',
		success : function(data) {
			$("#typeForm").form('load', data);
			$("#operate").val('update');
			if (data.storageAreas != null) {
				$('#storageAreasIdSelect').find(
						'option[value=' + data.storageAreas.storageAreasId
								+ ']').attr('selected', true);
			} else {
				$('#storageAreasIdSelect').find('option').eq(0).attr(
						'selected', true);
			}

			if (data.commodityTypeId == 1) {
				$("#showParentNameLbl").text("");
				$("#submitBtn").attr("disabled", "disabled");
				$("#deleteBtn").attr("disabled", "disabled");
			} else {
				var parentNode = zTreeObj.getNodeByTId(parentTId);
				$("#showParentNameLbl").text(parentNode.name);
				$("#submitBtn").removeAttr("disabled");
				$("#deleteBtn").removeAttr("disabled");
			}

			$("#commodityTypeName").attr("disabled", "disabled").removeAttr(
					"ajaxurl").removeAttr("datatype");
			$("#commodityTypeCode").attr("disabled", "disabled").removeAttr(
					"ajaxurl").removeAttr("datatype");
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}
var valid;
// 初始化表单验证
function initValidForm() {
	valid = $("#typeForm").Validform({
		btnSubmit : "#submitBtn",
		tiptype : 4,
		ignoreHidden : true,
		dragonfly : false,
		tipSweep : false,
		showAllError : true,
		postonce : true,
		ajaxPost : false,
		datatype : {

		},
		usePlugin : {},
		beforeCheck : function(curform) {
		},
		beforeSubmit : function(curform) {
			if ($("#operate").val() == "add") {
				submitAdd();
			} else if ($("#operate").val() == "update") {
				submitUpdate();
			}
			return false;
		},
		callback : function(data) {
		}
	});
}
// 新增提交
function submitAdd() {
	if ($("#commodityTypeParentIdHide").val() == "") {
		alertWm("请为新增的商品分类指定上级分类");
		return;
	}
	$.ajax({
		url : basePath + "/commodityType/add",
		data : $('#typeForm').serialize(),
		dataType : 'json',
		type : 'post',
		success : function(data) {
			alertWm(data.msg);
			initZTree();
			// $("#submitBtn").attr("disabled", "disabled");
			valid.resetForm();
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
};
// 编辑提交
function submitUpdate() {
	$.ajax({
		url : basePath + "/commodityType/update",
		data : $('#typeForm').serialize(),
		dataType : 'json',
		type : 'post',
		success : function(data) {
			alertWm(data.msg);
			initZTree();
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
};
// 删除提交
function submitDelete() {
	if ($("#commodityTypeIdHide").val() == "") {
		alertWm("请选择需要删除的商品分类");
		return;
	}
	confirmWm("确认删除该数据？", function() {
		$.ajax({
			url : basePath + "/commodityType/delete/"
					+ $("#commodityTypeIdHide").val(),
			data : {},
			dataType : 'json',
			type : 'post',
			success : function(data) {
				alertWm(data.msg);
				initZTree();
			},
			error : function() {
				alertWm("系统错误，请稍后再试。");
			}
		});
	});
}
