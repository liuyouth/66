/**
 * 
 */

$(function() {
    $("div.wm-grid").click(function() {
	var racksId = $(this).attr("id");
	var type = $(this).attr("data-rackstype-wm");
	var racksCode = $(this).text();
	putlocatorCode(type, racksCode);
	$('#modal_type' + type).modal('open');
    });

    // 加载库区数据
    $.ajax({
	url : basePath + "/storageAreas/selectAllAreas",
	data : {},
	dataType : 'json',
	success : function(data) {
	    for (var i = 0; i < data.msg.length; i++) {
		var span = document.createElement("span");
		$(span).attr("class", "am-badge am-text-default");
		$(span).text(data.msg[i].areasName);
		$(span).attr("style",
			"background-color:" + data.msg[i].areasColor);
		$("#allAreas").append("\r\n").append(span);
	    }
	},
	error : function() {
	    alertWm("系统错误，请稍后再试。");
	}
    });

    // 给分区货架绑定库区颜色
    $.ajax({
	url : basePath + "/storageRacks/selectAllRacks",
	data : {},
	dataType : 'json',
	success : function(data) {
	    for (var j = 0; j < data.msg.length; j++) {
		$("#" + data.msg[j].storageRacksId).attr("data-racksType-wm",
			data.msg[j].storageRacksType);
		if (data.msg[j].storageAreas) {
		    $("#" + data.msg[j].storageRacksId).attr(
			    "style",
			    "color:#fff;background-color:"
				    + data.msg[j].storageAreas.areasColor);
		}
	    }
	},
	error : function() {
	    alertWm("系统错误，请稍后再试。");
	}
    });

});

function putlocatorCode(type, racksCode) {
    if (type == 10) {
	$("div[data-name='type10-5']").text(racksCode + "-05-01");
	$("div[data-name='type10-4']").text(racksCode + "-04-01");
	$("div[data-name='type10-3']").text(racksCode + "-03-01");
	$("div[data-name='type10-2']").text(racksCode + "-02-01");
	$("div[data-name='type10-1']").text(racksCode + "-01-01");
    } else if (type == 11) {
	$("div[data-name='type11-5']").text(racksCode + "-05-01");
	$("div[data-name='type11-4']").text(racksCode + "-04-01");
	$("div[data-name='type11-3']").text(racksCode + "-03-01");
	$("div[data-name='type11-2']").text(racksCode + "-02-01");
	$("div[data-name='type11-1']").text(racksCode + "-01-01");
    } else if (type == 12) {
	$("div[data-name='type12-5']").text(racksCode + "-05-01");
	$("div[data-name='type12-4']").text(racksCode + "-04-01");
	$("div[data-name='type12-3']").text(racksCode + "-03-01");
	$("div[data-name='type12-2']").text(racksCode + "-02-01");
	$("div[data-name='type12-1']").text(racksCode + "-01-01");
    } else if (type == 13) {
	$("div[data-name='type13-5']").text(racksCode + "-05-01");
	$("div[data-name='type13-4']").text(racksCode + "-04-01");
	$("div[data-name='type13-3']").text(racksCode + "-03-01");
	$("div[data-name='type13-2']").text(racksCode + "-02-01");
	$("div[data-name='type13-1-2']").text(racksCode + "-01-02");
	$("div[data-name='type13-1-1']").text(racksCode + "-01-01");
    } else if (type == 14) {
	$("div[data-name='type14-5']").text(racksCode + "-05-01");
	$("div[data-name='type14-4']").text(racksCode + "-04-01");
	$("div[data-name='type14-3']").text(racksCode + "-03-01");
	$("div[data-name='type14-2']").text(racksCode + "-02-01");
	$("div[data-name='type14-1']").text(racksCode + "-01-01");
    } else if (type == 22) {
	$("div[data-name='type22']").text(racksCode);
    } else if (type == 23) {
	$("div[data-name='type23']").text(racksCode);
    } else if (type == 24) {
	$("div[data-name='type24']").text(racksCode);
    }
}