$(function() {
	// 切换导航状态
	toggleNav(10, 1, 0);

	searchTableData();
});
var table;
function searchTableData() {
	table = $('#showListTable')
			.DataTable(
					{
						"pageLength" : 10,
						"lengthChange" : false,
						"pagingType" : "full_numbers",
						"searching" : false,
						"ordering" : false,
						"processing" : true,
						"serverSide" : true,
						"ajax" : {
							"url" : basePath + "/userInfo/search",
							"type" : "POST"
						},
						"columns" : [
								{
									"data" : "loginName",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},

								{
									"data" : "userName",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "userMobile",
									"render" : function(data, type, row, meta) {
										if (data != null) {
											return '<span>' + data + "</span>";
										} else {
											return '<span></span>';
										}
									}
								},
								{
									"data" : "userGroup.userGroupName",
									"render" : function(data, type, row, meta) {
										if (data != null) {
											return '<span>' + data + "</span>";
										} else {
											return '<span></span>';
										}
									}
								},
								{
									"data" : "userInfoId",
									"render" : function(data, type, row, meta) {
										return '<div class="am-u-sm-12" style="text-align: center;">'
												+ '<div class="am-btn-group am-btn-group-xs">'
												+ '<button title="编辑用户信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
												+ basePath
												+ '/user_info/edit/view?userInfoId='
												+ data
												+ '\'">'
												+ '<span class="am-icon-edit"></span>编辑</button>'
												+ '<button title="删除用户信息"  class="am-btn am-btn-default am-btn-xs am-text-danger" onclick="javascript:del('
												+ data
												+ ');">'
												+ '<span class="am-icon-trash-o"></span>删除</button>'
												+ '</div></div>';
									}
								} ]
					});
}
var delId;
function del(userInfoId) {
	delId = userInfoId;
	confirmWm("确定要删除吗？", function() {
		$.ajax({
			url : basePath + "/userInfo/del/" + userInfoId,
			type : 'post',
			success : function(data) {
				alertWm("操作成功", okBack);
			},
			error : function() {
				alertWm("系统错误，请稍后再试。");
			}
		});
	});

}
function okBack() {
	// window.location.href = basePath + "/user_info/list/view";
	table.ajax.reload();
}
function searchData() {
	table.ajax.url(
			basePath + "/userInfo/search?searchParam="
					+ $.trim($("#searchParam").val()) + "").load();
}
