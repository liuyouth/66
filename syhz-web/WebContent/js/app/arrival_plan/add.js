$(function() {
	// 切换导航状态
	toggleNav(1, 0, 0);
	$("#commodityChoosingTable").DataTable({
		lengthChange : false,
		ordering : false,
		searching : false
	});
});

/**
 * 切换直送状态
 */
function switchDirectDelivery(checkbox) {
	var $Checkbox = $(checkbox);
	var $Container = $("#directDeliveryExplainContainer");
	if ($Checkbox.is(":checked")) {
		$Container.show();
	} else {
		$Container.hide();
	}
}

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