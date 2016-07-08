/**
 * 
 */
var storageAreasNameOld;
$(function() {
	// 切换导航状态
	toggleNav(9, 1, 0);
	// 加载数据
	$.ajax({
		url : basePath + "/storageAreas/edit",
		data : {
			storageAreasId : storageAreasId
		},
		dataType : 'json',
		success : function(data) {
			$("#editForm").form('load', data.msg);
			$("#warehouseId").val(data.msg.warehouse.warehouseId);
			storageAreasNameOld = $("#areasName").val();
			// 颜色
			$('.simple_color_kitchen_sink').simpleColor({
				boxHeight : 40,
				cellWidth : 20,
				cellHeight : 20,
				chooserCSS : {
					'border' : '1px solid #660033',
					'z-index' : '999'
				},
				displayCSS : {
					'border' : '1px solid red'
				},
				displayColorCode : true,
				livePreview : true,
				onSelect : function(hex, element) {
				},
				onCellEnter : function(hex, element) {
				},
				onClose : function(element) {
				}
			});
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
});
// 表单验证
$("#editForm").Validform({
	btnSubmit : "#updateBtn",
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
		submitupdate();
		return false;
	},
	callback : function(data) {
	}
});

// 保存
function submitupdate() {
	$.ajax({
		url : basePath + "/storageAreas/update",
		data : $('#editForm').serialize(),
		dataType : 'json',
		type : 'post',
		success : function(data) {
			alertWm(data.msg, function() {
				location.href = basePath + '/warehouse/areas/list/view';
			});
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}