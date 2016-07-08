$(function() {
	// 切换导航状态
	toggleNav(4, 0, 0);
	$("#commodityChoosingTable").DataTable({
		lengthChange : false,
		ordering : false,
		searching : false
	});
	//searchTableData();
});
function showAddModal() {
	$('#add_destory_goods').form('clear');
	$('#add_destory_goods').modal('open');
}