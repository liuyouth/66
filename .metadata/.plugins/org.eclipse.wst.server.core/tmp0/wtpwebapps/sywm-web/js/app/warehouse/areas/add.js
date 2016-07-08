/**
 * 
 */
$(function() {
	// 切换导航状态
	toggleNav(9, 1, 0);
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
});

// 表单验证
$("#addForm").Validform({
	btnSubmit : "#addBtn",
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

		submitAdd();
		return false;
	},
	callback : function(data) {
	}
});

// 保存
function submitAdd() {
	$.ajax({
		url : basePath + "/storageAreas/add",
		data : $('#addForm').serialize(),
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