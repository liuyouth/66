$(function() {
	toggleNav(6, 2, 0);

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
							url : basePath + "/brands/search",
							type : "POST",
							data : {},

						},
						"columns" : [
								{
									"data" : "brandsName",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "brandsCode",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "brandsId",
									"render" : function(data, type, row, meta) {
										return '<div class="am-u-sm-12" style="text-align: center;">'
												+ '<div class="am-btn-group am-btn-group-xs">'
												+ '<button class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
												+ basePath
												+ '/commodity/brands/edit/view?id='
												+ data
												+ '\'"><span class="am-icon-edit"></span>'
												+ "编辑"
												+ '</button>'
												+ '<button class="am-btn am-btn-default am-btn-xs am-text-danger" onclick="del('
												+ data
												+ ')"><span class="am-icon-trash-o"></span>'
												+ "删除"
												+ '</button>'
												+ '</div></div>';
									}
								} ]
					});
}
var delId;
function del(id) {
	delId = id;
	confirmWm("确认删除？", function() {
		$.ajax({
			url : basePath + "/brands/del/" + delId,
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
			basePath + "/brands/search?searchCode="
					+ $.trim($("#searchCode").val())).load();
}