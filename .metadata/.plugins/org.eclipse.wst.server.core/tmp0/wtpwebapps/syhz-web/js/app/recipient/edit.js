$(function() {
	// 切换导航状态
	toggleNav(6, 0, 0);
	read();
	// 初始化验证插件
	$valid = $("#addForm").Validform({
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
			upDate();
			return false;
		},
		callback : function(data) {
		}
	});
});
function read() {
	$.ajax({
		url : basePath + "/recipient/read/" + id,
		data : {},
		dataType : "json",
		type : "post",
		success : function(data) {
			if (data.success) {
				$("#addForm").form('load', data.msg);
			} else {
				alertWm(data.msg);
			}
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}
function upDate() {
	$.ajax({
		url : basePath + "/recipient/update",
		data : $("#addForm").serialize(),
		dataType : "json",
		type : "post",
		success : function(data) {
			if (data.success) {
				alertWm("操作成功");
			} else {
				alertWm(data.msg);
			}
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}