$(function() {
	// 切换导航状态
	toggleNav(8, 2, 0);

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
							url : basePath + "/truck/search",
							type : "POST",
							data : {},

						},
						"columns" : [
								{
									"data" : "truckNumber",	
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "truckType",									
									"render" : function(data, type, row, meta) {
										if(data==0){
											return '<span>' + "未选择" + "</span>";
										} else if(data==1){
											return '<span>' + "厢式货车" + "</span>";
										} else if(data==2){
											return '<span>' + "面包车" + "</span>";
										}else{
											alertWm("系统错误！");
										}
									}
								},
								{
									"data" : "truckLoad",									
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "truckId",									
									"render" : function(data, type, row, meta) {
										return '<div class="am-u-sm-12" style="text-align: center;">'
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
			url : basePath + "/truck/del/" + delId,
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
			basePath + "/truck/search?searchCode="
					+ $.trim($("#searchCode").val())).load();
}
