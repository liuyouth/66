/**
 * 
 */
$(function() {
    // 切换导航状态
    toggleNav(9, 3, 0);

    searchTableData();
});

function search() {
    table.ajax.url(
	    basePath + "/goodsLocator/search?searchParam="
		    + $.trim($("#searchParam").val())).load();
}

function searchTableData() {
    table = $ShowListTable = $('#showListTable')
	    .DataTable(
		    {
			"pageLength" : 10,
			"lengthChange" : false,
			"searching" : false,
			"ordering" : false,
			"processing" : true,
			"serverSide" : true,
			"ajax" : {
			    "url" : basePath + "/goodsLocator/search",
			    "type" : "POST"
			},
			"columns" : [
				{
				    "data" : "locatorCode",
				    "render" : function(data, type, row, meta) {
					return '<span>' + data + "</span>";
				    }
				},
				{
				    "data" : "locatorType",
				    "render" : function(data, type, row, meta) {
					if (data == 1) {
					    return '<span >' + "立体货架"
						    + "</span>";
					} else if (data == 2) {
					    return '<span >' + "堆放" + "</span>";
					} else if (data == 3) {
					    return '<span >' + "月台" + "</span>";
					} else {
					    return '<span >' + "数据错误 "
						    + "</span>";
					}
				    }
				},
				{
				    "data" : "maxStorageWeight",
				    "render" : function(data, type, row, meta) {
					return '<span>' + data + "</span>";
				    }
				},
				{
				    "data" : "palletsContainingCount",
				    "render" : function(data, type, row, meta) {
					return '<span>' + data + "</span>";
				    }
				},
				{
				    "data" : "isEnable",
				    "render" : function(data, type, row, meta) {
					if (data) {
					    return '<span class="am-badge am-badge-success">启用</span>';
					} else {
					    return '<span class="am-badge am-badge-danger">停用</span>';
					}
				    }
				},
				{
				    "data" : "goodsLocatorId",
				    "render" : function(data, type, row, meta) {
					return '<div class="am-u-sm-12" style="text-align: center;">'
						+ '<div class="am-btn-group am-btn-group-xs">'
						+ '<button title="编辑货位" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
						+ basePath
						+ '/warehouse/locator/edit/view?goodsLocatorId='
						+ data
						+ '\'">'
						+ '<span class="am-icon-pencil-square-o"></span>编辑</button>'
						+ '</div></div>';
				    }
				} ]
		    });
}
