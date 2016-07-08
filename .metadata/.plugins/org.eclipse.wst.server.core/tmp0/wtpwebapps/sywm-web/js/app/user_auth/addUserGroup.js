$(function() {
	// 切换导航状态
	toggleNav(10, 2, 0);
	// 初始化表单验证
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
			submitAdd();
			return false;
		},
		callback : function(data) {
		}
	});
}
// 新增提交
function submitAdd() {
	$.ajax({
		url : basePath + "/userGroup/add",
		data : $('#addForm').serialize(),
		dataType : 'json',
		type : 'post',
		success : function(data) {
			if (data.success) {
				alertWm(data.msg, okBack);
			} else {
				alertWm(data.msg);
			}
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
};
// 新增后点击确定的回调
function okBack() {
	window.location.href = basePath + "/user_auth/userGroupList/view";
}