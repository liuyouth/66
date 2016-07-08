$(function() {
	// 切换导航状态
	toggleNav(8, 1, 0);

	searchTableData();
});
var $ShowListTable;
function searchTableData() {
	$ShowListTable = $('#showListTable')
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
							url : basePath + "/driver/search",
							type : "POST",
							data : {},

						},
						"columns" : [
								{
									"data" : "loginName",	
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "driverName",									
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "driverMobile",									
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "driverId",									
									"render" : function(data, type, row, meta) {
										return '<div class="am-u-sm-12" style="text-align: center;">'
												+ '<div class="am-btn-group am-btn-group-xs">'
												+ '<button class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
												+ basePath
												+ '/driver/edit/view?id='
												+ data
												+ '\'"><span class="am-icon-edit"></span>'
												+ "编辑"
												+ '</button>'
												+ '<button class="am-btn am-btn-default am-btn-xs am-text-danger" onclick="del('
												+ data
												+ ')"><span class="am-icon-trash-o"></span>'
												+ "删除"
												+ '</button>' + '</div></div>';
									}
								} ]
					});
}
var delId;
function del(id) {
	delId = id;
	confirmWm("确认删除？", function() {
		$.ajax({
			url : basePath + "/driver/del/" + delId,
			dataType : "json",
			type : "post",
			success : function(data) {
				if (data.success) {
					alertWm("OK");
					$ShowListTable.ajax.reload();
				} else {
					alertWm(data.msg);
				}
			},
			error : function() {
				alertWm("请求失败");
			}
		});
	})
}
function search() {
	$ShowListTable.ajax.url(
			basePath + "/driver/search?searchCode="
					+ $.trim($("#searchCode").val())).load();
}
