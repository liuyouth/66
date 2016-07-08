$(function() {
	// 切换导航状态
	toggleNav(2, 0, 0);
	/*$("#deliverOrderBatchTable").DataTable({
		lengthChange : false,
		ordering : false,
		searching : false
	});
	$("#batchChoosingTable").DataTable({
		lengthChange : false,
		ordering : false,
		searching : false
	});*/
});

/**
 * 打开批次选择窗口
 */
function openBatchChoosingModal() {
	$("#batchChoosingModal").modal("open");
}