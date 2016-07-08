/**
 * 声明全局变量
 */
// 校验插件变量
var $valid;

$(function() {
	// 切换导航状态
	toggleNav(6, 0, 0);
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
			submit();
			return false;
		},
		callback : function(data) {
		}
	});

});
// 为form表单绑定提交事件
function submit() {
	$("#submitBtn").attr("disabled", "disabled ");
	$.ajax({
		url : basePath + "/recipient/add",
		data : $("#addForm").serialize(),
		dataType : "json",
		type : "post",
		success : function(data) {
			if (data.success) {
				alertWm("操作成功", function() {
					window.location.href = basePath + "/recipient/list/view";
				});
			} else {
				alertWm(data.msg);
			}
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});

};