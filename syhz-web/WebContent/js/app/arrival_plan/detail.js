$(function() {
	// 切换导航状态
	toggleNav(1, 0, 0);
});
// 打印直送订单
var LODOP;
function createPrintPage() {
	LODOP = getLodop(document.getElementById('LODOP_OB'), document
			.getElementById('LODOP_EM'));

	LODOP.PRINT_INIT("投递单");

	LODOP.SET_PRINT_PAGESIZE(1, 0, 0, "A4"); //A4纸张横向打印
	// LODOP.SET_PRINT_PAGESIZE(2, "209mm", "279.4mm", ""); // A4纸张横向打印

	var strBodyStyle = "<style>table { border: 1 solid #000000;border-collapse:collapse }</style>";
	var strFormHtml = strBodyStyle + "<body>"
	// + document.getElementById("displayStatementWin").innerHTML
	+ "</body>";
	
	LODOP.SET_PRINT_STYLE("FontSize", 18);
	LODOP.SET_PRINT_STYLE("Bold", 1);
	// LODOP.ADD_PRINT_TEXT(10, 510, 90, 39, "投递单");

	//LODOP.ADD_PRINT_TABLE(10, 0, "100%", "85%", strFormHtml);//打印table
	
	LODOP.ADD_PRINT_BARCODE(10+50*5,100,200,50,"EAN13","6923450657636");//打印条形码
	
	LODOP.SET_SHOW_MODE("LANDSCAPE_DEFROTATED", 1);

	/*
	 * LODOP.ADD_PRINT_TEXT("195mm", "140mm", 200, 5, "#/&");
	 * LODOP.SET_PRINT_STYLEA(2, "ItemType", 2); LODOP.SET_PRINT_STYLEA(2,
	 * "HOrient", 1);
	 */

	LODOP.PREVIEW();
}