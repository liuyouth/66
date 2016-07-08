<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

<script type="text/javascript" src="${basePath }/js/lib/eChart/echarts-all.js"></script>

</head>
<body class="am-container wm-container">
	
	<!-- header start -->
	<%@ include file="/WEB-INF/pages/inc/header.jsp"%>
	<!-- header end -->
		
	<div class="am-g">
	
		<!-- nav start -->
		<%@ include file="/WEB-INF/pages/inc/nav.jsp"%>
		<!-- nav end -->
		
		<div class="am-u-sm-9">
			<ol class="am-breadcrumb wm-breadcrumb">
				<li><a href="${basePath}/index/view">首页</a></li>
				<li class="am-active">统计查询</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<!-- search start -->
					<form class="am-form-inline">
						<div class="am-form-group">
							<div class="am-input-group">
								<span class="am-input-group-label">货主</span>
								<select data-am-selected>
									<option></option>
									<option>李货主</option>
									<option>王货主</option>
									<option>刘货主</option>
									<option>马货主</option>
									<option>张货主</option>
								</select>
							</div>
						</div>
						<div class="am-form-group">
							<input id="start" name="start" type="text" class="am-form-field wm-Wdate" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'end\')||\'%y-%M-%d\'}',dateFmt:'yyyy-MM-dd',skin:'whyGreen'})" readonly="readonly" placeholder="开始日期">
							<span>&nbsp;~&nbsp;</span>
							<input id="end" name="end" type="text" class="am-form-field wm-Wdate" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'start\')}',maxDate:'%y-%M-%d',dateFmt:'yyyy-MM-dd',skin:'whyGreen'})" readonly="readonly" placeholder="截止日期">
						</div>
						<div class="am-form-group">
							<button class="am-btn am-btn-default" type="button" style="margin-left: -1px">
								<i class="am-icon-search"></i> 搜索
							</button>
						</div>
					</form>
					<!-- search end -->
				</div>
			</div>
			<!-- tool bar end -->
			<!-- chart start -->
			<div class="am-g">
				<div class="am-u-sm-11 am-u-sm-centered">
					<div id="wmChart" style="width: 100%;height: 500px;"></div>
				</div>
			</div>
			<!-- chart end -->
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath }/js/app/statistics/rsChart.js"></script>
</body>
</html>