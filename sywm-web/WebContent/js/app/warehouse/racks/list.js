/**
 * 
 */
$(function() {
	// 切换导航状态
	toggleNav(9, 2, 0);

	searchTableData();

	// 加载库区KV
	loadStorageAreasKV();
});

// 加载库区KV
function loadStorageAreasKV() {
	$.ajax({
		url : basePath + '/storageAreas/kv',
		data : {

		},
		dataType : 'json',
		success : function(data) {
			var $select = $("#storageAreasIdSelect");
			$.each(data, function(i, v) {
				var option = document.createElement("option");
				$(option).val(v.value).text(v.text).appendTo($select);
			});
		},
		error : function() {
			alertWm("系统错误，请稍后再试。");
		}
	});
}

function search() {
	table.ajax.url(
			basePath + "/storageRacks/search?searchParam="
					+ $.trim($("#searchParam").val())).load();
}

/**
 * 打开绑定库区窗口
 */
// 以选中的货位id
var selectedRacksIds;
function openAddToAreasModal() {
	selectedRacksIds = "";
	$("input:checkbox[class='ckClassFlg']:checked").each(function() {
		if (selectedRacksIds == "") {
			selectedRacksIds = $(this).val();
		} else {
			selectedRacksIds = selectedRacksIds + "," + $(this).val();
		}
	});
	if (selectedRacksIds == "") {
		alertWm("请选择货位");
	} else {
		$("#addToAreasModal").modal("open");
	}
}

// 绑定库区
function addToAreas() {

	var storageAreasId = $("#storageAreasIdSelect").val();

	$.ajax({
		url : basePath + "/storageRacks/addToAreas",
		type : 'post',
		data : {
			selectedRacksIds : selectedRacksIds,
			storageAreasId : storageAreasId
		},
		dataType : "json",
		success : function(data) {
			alertWm(data.msg);
			window.location.reload();
		},
		error : function() {
			alert("请求失败");
		}

	});
}

function searchTableData() {
	table = $ShowListTable = $('#showListTable')
			.DataTable(
					{
						"pageLength" : 25,
						"lengthChange" : false,
						"searching" : false,
						"ordering" : false,
						"processing" : true,
						"serverSide" : true,
						"ajax" : {
							"url" : basePath + "/storageRacks/search",
							"type" : "POST"
						},
						"columns" : [
								{
									"data" : "storageRacksId",
									"render" : function(data, type, row, meta) {
										return '<input type="checkbox" class="ckClassFlg" value="'
												+ data + '">';
									}
								},
								{
									"data" : "storageRacksCode",
									"render" : function(data, type, row, meta) {
										return '<span>' + data + "</span>";
									}
								},
								{
									"data" : "storageRacksType",
									"render" : function(data, type, row, meta) {
										if (data == 10) {
											return '<span >' + "标准横梁式"
													+ "</span>";
										} else if (data == 11) {
											return '<span >' + "横梁式（被立柱所挡，不可用）"
													+ "</span>";
										} else if (data == 12) {
											return '<span >'
													+ "横梁式（被横梁所挡，上3层不可用）"
													+ "</span>";
										} else if (data == 13) {
											return '<span >' + "横梁式（下层拆零货架）"
													+ "</span>";
										} else if (data == 14) {
											return '<span >' + "横梁式（隧道式，上3层可用）"
													+ "</span>";
										} else if (data == 22) {
											return '<span >' + "标准驶入式（2列）"
													+ "</span>";
										} else if (data == 23) {
											return '<span >' + "标准驶入式（3列）"
													+ "</span>";
										} else if (data == 24) {
											return '<span >' + "标准驶入式（4列）"
													+ "</span>";
										} else {
											return '<span >' + "数据错误 "
													+ "</span>";
										}
									}
								},
								{
									"data" : "storageAreas",
									"render" : function(data, type, row, meta) {
										if (data) {
											return '<span>' + data.areasName
													+ "</span>";
										} else {
											return "<span>未绑定</span>";
										}

									}
								},
								{
									"data" : "goodsLocatorCount",
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
									"data" : "storageRacksId",
									"render" : function(data, type, row, meta) {
										return '<div class="am-u-sm-12" style="text-align: center;">'
												+ '<div class="am-btn-group am-btn-group-xs">'
												+ '<button title="编辑货架" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\''
												+ basePath
												+ '/warehouse/racks/edit/view?storageRacksId='
												+ data
												+ '\'">'
												+ '<span class="am-icon-pencil-square-o"></span>编辑</button>'
												+ '</div></div>';
									}
								} ]
					});
}

function selectAll() {
	if ($("#allCheckbox").is(":checked")) {
		$(".ckClassFlg").prop('checked', true);
	} else {
		$(".ckClassFlg").prop('checked', false);
	}
}
