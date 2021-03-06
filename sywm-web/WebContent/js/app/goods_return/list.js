$(function() {
	// 切换导航状态
	toggleNav(3, 0, 0);

	//searchTableData();
});
function searchTableData(){
	 $ShowListTable = $('#showListTable').DataTable({
       "pageLength": 10,
       "lengthChange": false,
       "pagingType": "full_numbers",
       "searching": false,
       "ordering":  false,
       "processing": true,
       "serverSide": true,
       "ajax": {
           url: "${basePath}/getData",
           type: "POST",
           data:{},

       },
       "columns": [
	            {	
	                "data": "a",
	                width:"5%",
	                "render":function ( data, type, row, meta ) {
	                    return '<input type="checkbox" class="ckClassFlg" name="aIdChk" value="'+data+'"/>';
	                }
	            },
           {
               "data": "b",
               "render":function ( data, type, row, meta ) {
               	return '<span>' + data + "</span>";
               }
           },
           {
               "data": "c",
              	"render":function ( data, type, row, meta ) {
              		return '<span >' + data + "</span>";
               }
           },
           {
               "data": "d",
              	"render":function ( data, type, row, meta ) {
              		return '<span>' + data + "</span></td>";
               }
           },
           {
               "data": "e",
              	"render":function ( data, type, row, meta ) {
              		return '<span>' + data + "</span>";
               }
           },
           {
               "data": "f",
              	"render":function ( data, type, row, meta ) {
              		return '<span>' + data + "</span>";
               }
           },
           {
               "data": "g",
              	"render":function ( data, type, row, meta ) {
              		return '<span>' + data + "</span>";
               }
           },
           {
               "data": "h",
              	"render":function ( data, type, row, meta ) {
              		return '<span>' + data + "</span>";
               }
           },
           {
               "data": "i",
              	"render":function ( data, type, row, meta ) {
              		return '<span>' + data + "</span>";
               }
           },
           {
           	"data": "a",
               "width":"12%",
              	"render":function ( data, type, row, meta ) {
              		return '<div class="am-btn-toolbar">'
              		+'<div class="am-btn-group am-btn-group-xs">'
              		+'<button class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href=\'${basePath}/enterprise/goods_record_edit/view?goodsId='+data+'\'">'
              		+'<span class="am-icon-pencil-square-o"></span></button>'
              		+'<button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only" onclick="del('+data+')">'
              		+'<span class="am-icon-trash-o"></span></button>'
              		+'</div></div>';
               }
           }
       ]
   });
}
