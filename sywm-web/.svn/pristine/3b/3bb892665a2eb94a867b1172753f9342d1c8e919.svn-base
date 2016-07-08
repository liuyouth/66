$(function() {
	initValidForm();
});
// 初始化表单验证
var valid;
function initValidForm() {
	valid = $("#headerEditPasswordForm").Validform({
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
			modifyPwd();
			return false;
		},
		callback : function(data) {
		}
	});
}
function showEditPasswordModal() {
	var $form = $('#headerEditPasswordForm');
	$form.form('clear');

	$form.find(".Validform_checktip").text("");
	$form.find(".Validform_checktip").removeClass(
			"Validform_wrong Validform_right Validform_loading");

	$('#headerEditPasswordModal').modal('open');
	$("#cancelBtn").focus();
}
function modifyPwd() {
	$.ajax({
		url : basePath + "/userInfo/modifyPwd",
		data : $('#headerEditPasswordForm').serialize(),
		dataType : 'json',
		type : 'post',
		success : function(data) {
			if (data.success) {
				$("#headerEditPasswordModal").modal("close");
				alertWm("密码修改成功", okBack);
			} else {
				$("#headerEditPasswordModal").modal("close");
				alertWm(data.msg);
			}
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}
function okBack() {
	window.location.href = basePath + "/index/view";
}
function loginOut() {
	$.ajax({
		url : basePath + "/userInfo/loginOut",
		dataType : 'json',
		success : function(data) {
			window.location.href = basePath + "/login/view"
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
			return false;
		}
	});
}