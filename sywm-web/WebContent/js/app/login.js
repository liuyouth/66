$(function() {
	initValidForm();
});
// 初始化表单验证
function initValidForm() {
	$("#addForm").Validform({
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
			doLogin();
			return false;
		},
		callback : function(data) {
		}
	});
}
function doLogin() {
	showLoadingWm();
	$.ajax({
		url : basePath + "/userInfo/loginIn",
		data : $('#addForm').serialize(),
		dataType : 'json',
		type : 'post',
		success : function(data) {
			hideLoadingWm();
			if (data.success) {
				window.location.href = basePath + "/index/view";
			} else {
				alertWm(data.msg);
			}
		},
		error : function() {
			hideLoadingWm();
			alertWm("系统错误，请稍后再试。");
		}
	});
}
