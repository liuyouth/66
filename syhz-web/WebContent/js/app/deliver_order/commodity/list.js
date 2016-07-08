$(function() {
	// 切换导航状态
	toggleNav(2, 0, 0);
	$("#deliverOrderCommodityTable").DataTable({
		lengthChange : false,
		ordering : false,
		searching : false
	});
});

/**
 * 打开商品选择窗口
 */
function openCommodityChoosingModal() {
	$("#commodityChoosingModal").modal("open");
}

/**
 * 打开商品编辑窗口
 */
function openCommodityEditingModal() {
	$("#commodityEditingModal").modal("open");
}