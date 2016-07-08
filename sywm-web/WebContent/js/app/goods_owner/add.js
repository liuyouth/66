var $valid;

$(function() {
	// 切换导航状态
	toggleNav(7, 0, 0);

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

function submit() {

	confirmWm("确认添加？", function() {

		$.ajax({
			type : "POST",
			url : basePath + "/goods_owner/add",
			data : $('#addForm').serialize(),
			dataType : "json",
			success : function(msg) {
				alertWm("OK",function(){
					
					location.href=basePath+"/goods_owner/list/view";
				});
				
			},
			error : function(){
				alertWm("system mistake!")
			}
		});
	});
}
