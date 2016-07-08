$(function() {
	// 切换导航状态
	toggleNav(2, 0, 0);
	$("#deliverOrderTable").DataTable({
		autoWidth : false,
		lengthChange : false,
		ordering : false,
		searching : false
	});
});