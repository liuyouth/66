$(function() {
	// 切换导航状态
	toggleNav(2, 0, 0);
});

function openRecipientChoosingModal(){
	$("#recipientChoosingModal").modal("open");
}

/**
 * 切换二次包装状态
 */
function switchRepacking(checkbox) {
	var $Checkbox = $(checkbox);
	var $Container = $("#repackingExplainContainer");
	if ($Checkbox.is(":checked")) {
		$Container.show();
	} else {
		$Container.hide();
	}
}

/**
 * 保存
 */
function save() {
	// 使用异步方式保存数据。如果保存成功，无需提示成功消息，直接跳转；如果保存失败，提示失败消息，不再跳转
	location.href = basePath + "/deliver_order/commodity/list/view";
}