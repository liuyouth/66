$(function() {
	// 切换导航状态
	toggleNav(2, 0, 0);
});

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
	confirmWm("保存成功！即将离开当前页面，确定离开吗？", function() {
		location.href = basePath + "/deliver_order/list/view";
	});
}

/**
 * 查看订单商品
 */
function gotoCommodity() {
	confirmWm("即将离开当前页面，未保存的信息会丢失，确定离开吗？", function() {
		location.href = basePath + "/deliver_order/commodity/list/view";
	}, function() {
	});
}