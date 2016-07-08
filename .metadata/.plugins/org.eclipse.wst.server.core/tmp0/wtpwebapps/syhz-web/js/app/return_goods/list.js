$(function() {
	// 切换导航状态
	toggleNav(3, 0, 0);
	$("#returnGoodsTable").DataTable({
		lengthChange : false,
		ordering : false,
		searching : false
	});
});