/**
 * 
 */
$(function() {
	// 切换导航状态
	toggleNav(9, 3, 0);

	// 加载数据
	$.ajax({
		url : basePath + "/goodsLocator/edit",
		data : {
			goodsLocatorId : goodsLocatorId
		},
		dataType : 'json',
		success : function(data) {
			$("#editForm").form('load', data.msg);
			if (data.msg.locatorType == 1) {
				$("#locatorType").text("立体货架");
			} else if (data.msg.locatorType == 2) {
				$("#locatorType").text("堆放");
			} else if (data.msg.locatorType == 3) {
				$("#locatorType").text("月台");
			} else {
				$("#locatorType").text("数据错误 ");
			}
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
		url : basePath + "/goodsLocator/update",
		data : $('#editForm').serialize(),
		dataType : 'json',
		type : 'post',
		success : function(data) {
			alertWm(data.msg, function() {
				location.href = basePath + '/warehouse/locator/list/view';
			});
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}