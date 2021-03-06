var $ShowListTable;
$(function() {
	// 切换导航状态
	toggleNav(6, 0, 0);
	searchTableData();
});
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
							url : basePath + "/recipient/search",
							type : "POST",
							data : {},

						},
						"columns" : [
								{
									"data" : "recipientName",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "recipientCode",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "recipientAddress",
									"render" : function(data, type, row, meta) {
										return '<span >' + data + "</span>";
									}
								},
								{
									"data" : "recipientContact",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span></td>";
									}
								},
								{
									"data" : "recipientContactPhone",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},

								{
									"data" : "recipientId",
									"render" : function(data, type, row, meta) {
										return '<div class="am-u-sm-12" style="text-align: center;">'
												+ '<div class="am-btn-group am-btn-group-xs">'
												+ '<button title="编辑收货人信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
												+ basePath
												+ '/recipient/edit/view?id='
												+ data
												+ '\'">'
												+ '<span class="am-icon-pencil-square-o"></span>编辑</button>'

												+ '</div></div>';
									}
								} ]
					});
}
function del(id) {
	confirmWm("确认删除该数据？", function() {
	$.ajax({
		url : basePath + "/recipient/delete/" + id,
		data : {},
		dataType : "json",
		type : "post",
		success : function(data) {
			alertWm(data.msg);
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
	});
}
function search() {
	// 重新加载URL
	$ShowListTable.ajax.url(
			basePath + "/recipient/search?searchKey="
					+ $.trim($("#searchKey").val())).load();
}