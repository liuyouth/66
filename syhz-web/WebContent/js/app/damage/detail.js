$(function() {
	// 切换导航状态
	toggleNav(4, 0, 0);
	$("#commodityChoosingTable").DataTable({
		lengthChange : false,
		ordering : false,
		searching : false
	});
});