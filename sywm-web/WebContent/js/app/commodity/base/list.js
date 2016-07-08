var listData = [ "", "瓶", "袋", "盒", "包", "桶" ];
var $ShowListTable ;
$(function() {
	// 切换导航状态
	toggleNav(6, 3, 0);

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
							url : basePath + "/commodityBase/search",
							type : "POST",
							data : {},

						},
						"columns" : [
								/*  {	
								      "data": "a",
								      width:"5%",
								      "render":function ( data, type, row, meta ) {
								          return '<input type="checkbox" class="ckClassFlg" name="aIdChk" value="'+data+'"/>';
								      }
								  },*/
								{
									"data" : "commodityName",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "commodityBarcode",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "commodityTypeName",
									"render" : function(data, type, row, meta) {
										return '<span >' + data + "</span>";
									}
								},
								{
									"data" : "brandsName",
									"render" : function(data, type, row, meta) {
										return '<span >' + data + "</span>";
									}
								},
								{
									"data" : "commodityOrigin",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span></td>";
									}
								},
								{
									"data" : "commodityStandard",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span></td>";
									}
								},

								{
									"data" : "commodityBaseId",
									"width" : "12%",
									"render" : function(data, type, row, meta) {
										return '<div class="am-btn-toolbar">'
												+ '<div class="am-btn-group am-btn-group-xs">'
												+ '<button class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
												+ basePath
												+ '/commodity/base/edit/view?id='
												+ data
												+ '\'">'
												+ '<span class="am-icon-pencil-square-o"></span>编辑</button>'
												+ '<button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only" onclick="del('
												+ data
												+ ')">'
												+ '<span class="am-icon-trash-o"></span>删除</button>'
												+ '</div></div>';
									}
								} ]
					});
}
function del(delId) {
	confirmWm("确认删除该数据？", function() {
	$.ajax({
		url : basePath + "/commodityBase/delete/" + delId,
		data : {},
		dataType : "json",
		type : "post",
		success : function(data) {
			if (data.success) {
				alertWm("操作成功");
				search();
			} else {
				alertWm(data.msg);
			}
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
			basePath + "/commodityBase/search?searchKey="
					+ $.trim($("#searchKey").val())).load();
}