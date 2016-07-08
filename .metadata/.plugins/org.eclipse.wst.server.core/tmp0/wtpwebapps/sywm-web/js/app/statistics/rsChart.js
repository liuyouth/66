$(function() {
	// 切换导航状态
	toggleNav(11, 0, 0);

	var myChart = echarts.init(document.getElementById('wmChart'));
	option = {
		tooltip : {
			trigger : 'axis'
		},
		legend : {
			data : [ '入库', '出库' ],
			x : 'center',
			y : 'bottom'
		},
		toolbox : {
			show : true,
			x : 'right',
			y : 'bottom',
			feature : {
				saveAsImage : {
					show : true
				}
			}
		},
		calculable : false,
		xAxis : [ {
			type : 'category',
			boundaryGap : false,
			data : [ '周一', '周二', '周三', '周四', '周五', '周六', '周日' ]
		} ],
		yAxis : [ {
			type : 'value'
		} ],
		series : [ {
			name : '入库',
			type : 'line',
			stack : '总量',
			data : [ 120, 132, 101, 134, 90, 230, 210 ]
		}, {
			name : '出库',
			type : 'line',
			stack : '总量',
			data : [ 220, 182, 191, 234, 290, 330, 310 ]
		} ]
	};
	myChart.setOption(option);
});