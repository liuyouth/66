var $valid;
$(function() {
	
	toggleNav(6, 2, 0);
	read();
	$valid = $("#editForm").Validform({
		btnSubmit:"#submitBtn", 
		tiptype:4, 
		ignoreHidden:true,
		dragonfly:false,
		tipSweep:false,
		showAllError:true,
		postonce:true,
		ajaxPost:false,
		datatype:{
			
		},
		usePlugin:{
		},
		beforeCheck:function(curform){
				
		},
		beforeSubmit:function(curform){
				
			upDate();
			return false;
		},
		callback:function(data){
			
		}
	});
});
function read(){
	$.ajax({
		url : basePath + "/brands/read/"+id,
		data : {
			
		},
		dataType : "json",
		type : "post",
		success : function(data) {
			if (data.success) {
				$("#editForm").form('load', data.msg); 
			} else {
				alertWm(data.msg);
			}
		},

		error : function() {
			alertWm("请求失败");
		}
	});
}

function upDate(){
	$.ajax({
		url : basePath + "/brands/updata",
		data : $("#editForm").serialize(),
		dataType : "json",
		type : "post",
		success : function(data) {
			if (data.success) {
				alertWm("保存成功！");
			} else {
				alert(data.msg);
			}
		},
		
		error : function() {
			alertWm("请求失败");
		}
	});
}

