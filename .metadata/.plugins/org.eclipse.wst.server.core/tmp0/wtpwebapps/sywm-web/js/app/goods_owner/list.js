$(function() {
	// 切换导航状态
	toggleNav(7, 0, 0);

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
							url : basePath + "/goods_owner/search",
							type : "POST",
							data : {},

						},
						"columns" : [
								{
									"data" : "goodsOwnerName",	
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "goodsOwnerAddress",									
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "goodsOwnerTel",									
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "goodsOwnerContact",									
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "goodsOwnerContactMobile",									
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "isEnable",									
									"render" : function(data, type, row, meta) {
										if(data){
											return '<span class="am-badge am-badge-success">' + "启用" + "</span>";
										}else{
											return '<span class="am-badge am-badge-danger">' + "停用" + "</span>";
										}
										
									}
								},
								{
									"data" : "goodsOwnerId",									
									"render" : function(data, type, row, meta) {
										return '<div class="am-u-sm-12" style="text-align: center;">'
												+ '<div class="am-btn-group am-btn-group-xs">'
												+ '<button class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
												+ basePath
												+ '/goods_owner/goods_owner_user/list/view\'"><span class="am-icon-cog"></span>'
												+ "管理"
												+ '</button>'
												+ '<div class="am-btn-group am-btn-group-xs">'
												+ '<button class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
												+ basePath
												+ '/goods_owner/edit/view?id='
												+ data
												+ '\'"><span class="am-icon-edit"></span>'
												+ "编辑"
												+ '</button>' + '</div></div>';
									}
								} ]
					});
}
function search() {
	$ShowListTable.ajax.url(
			basePath + "/goods_owner/search?searchCode="
					+ $.trim($("#searchCode").val())).load();
}
