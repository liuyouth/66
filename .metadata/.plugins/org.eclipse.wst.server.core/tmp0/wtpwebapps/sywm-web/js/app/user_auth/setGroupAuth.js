$(function() {
	// 切换导航状态
	toggleNav(10, 2, 0);
	readAuth();

});
function readAuth() {
	$.ajax({
		url : basePath + "/systemFunction/authList",
		data : {},
		dataType : 'json',
		type : 'post',
		success : function(data) {
			addAuth(data);
			read()
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});

}
function read() {
	$.ajax({
		url : basePath + "/systemFunction/readAuth/" + userGroupId + "",
		data : {},
		dataType : 'json',
		type : 'post',
		success : function(data) {
			toAuth(data)
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}
function toAuth(data) {
	if (data.length > 0) {
		for (var i = 0; i < data.length; i++) {
			var systemFunctionId = data[i].systemFunction.systemFunctionId;
			if (data[i].userAuth > 0) {
				$(
						"input:checkbox[class='writeFlg'][id='"
								+ systemFunctionId + "']")
						.prop('checked', true)

			} else {
				$(
						"input:checkbox[class='readFlg'][id='"
								+ systemFunctionId + "']")
						.prop('checked', true)
			}
		}
	}
}
function addAuth(data) {
	var dataListStr = "";
	var list = data.children;

	for (var i = 0; i < list.length; i++) {
		var lc = list[i].children;
		dataListStr = "";
		dataListStr += '<div class="am-g"><label  class="am-u-sm-3 am-form-label">'
				+ list[i].systemFunctionName + ' </label>';

		if (lc.length == 0) {
			dataListStr += '<div class="am-u-sm-9" style="padding-left: 30%"><label class="am-checkbox-inline">'
					+ '<input type="checkbox"  value="0" id='
					+ list[i].systemFunctionId
					+ ' class="readFlg" data-id='
					+ list[i].systemFunctionId
					+ '>读'
					+ '</label>'
					+ '<label class="am-checkbox-inline"><input type="checkbox"  value="1" id='
					+ list[i].systemFunctionId
					+ ' data-id='
					+ list[i].systemFunctionId
					+ ' class="writeFlg">写'
					+ '</label> </div>'
			dataListStr += '</div>';
			$("#dataListInfo").append(dataListStr);
		} else {
			dataListStr += '</div>';
			$("#dataListInfo").append(dataListStr);
			for (var j = 0; j < lc.length; j++) {
				dataListStr = "";
				dataListStr += '<div class="am-g"><div class="am-u-sm-3" style="padding-left:10%">'
						+ lc[j].systemFunctionName + ' </div>'
				dataListStr += '<div class="am-u-sm-9" style="padding-left: 30%"><label class="am-checkbox-inline">'
						+ '<input type="checkbox"  value="0" id='
						+ lc[j].systemFunctionId
						+ ' data-id='
						+ lc[j].systemFunctionId
						+ ' class="readFlg">读'
						+ '</label>'
						+ '<label class="am-checkbox-inline"><input type="checkbox"  value="1" id='
						+ lc[j].systemFunctionId
						+ ' data-id='
						+ lc[j].systemFunctionId
						+ ' class="writeFlg">写'
						+ '</label></div></div>'
				$("#dataListInfo").append(dataListStr);
			}
		}
	}
	$("#dataListInfo").append(dataListStr);

}
function saveAuth() {
	var read = [];
	var write = [];
	$("input:checkbox[class='writeFlg']:checked").each(function() {
		var id = $(this).attr("data-id");
		var value = $(this).val();
		write.push(id);
	});

	$("input:checkbox[class='readFlg']:checked").each(function() {
		var id = $(this).attr("data-id");
		var value = $(this).val();
		if (write.indexOf(id) == -1) {
			read.push(id);
		}

	});

	$.ajax({
		url : basePath + "/systemFunction/add",
		type : "post",

		data : {
			read : read.toString(),
			write : write.toString(),
			userGroupId : userGroupId

		},
		dataType : "json",
		success : function(data) {
			alertWm("操作成功", okBack);

		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});

}
// 新增后点击确定的回调
function okBack() {
	window.location.href = basePath + "/user_auth/userGroupList/view";
}