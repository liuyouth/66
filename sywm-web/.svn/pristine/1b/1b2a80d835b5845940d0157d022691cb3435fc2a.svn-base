$(function() {
	// 切换导航状态
	toggleNav(10, 1, 0);
	initValidForm();
	addOption()
});
function read() {
	$.ajax({
		url : basePath + "/userInfo/read/" + userInfoId,
		type : 'post',
		cache : false,
		dataType : 'json',
		success : function(data) {
			$("#typeForm").form('load', data);
			$("#userGroupIdSelect").find("option[value='"+data.userGroup.userGroupId+"']").attr("selected",true)
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}
//初始化表单验证
function initValidForm() {
	$("#typeForm").Validform({
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
		    submitUpdate();
			return false;
		},
		callback : function(data) {
		}
	});
}
function addOption(){
    $.ajax({
	url : basePath + "/userInfo/kv",
	dataType : 'json',
	success : function(data) {
		var $select = $("#userGroupIdSelect");
		$.each(data, function(i, v) {
			var option = document.createElement("option");
			$(option).val(v.value).text(v.text).appendTo($select);
		});
		read()
	},
	error : function() {
		alertWm("系统错误，请稍后再试。");
	}
});
}
//新增提交
function submitUpdate() {
	$.ajax({
		url : basePath + "/userInfo/update",
		data : $('#typeForm').serialize(),
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
function okBack(){
    window.location.href = basePath + "/user_info/list/view";
}