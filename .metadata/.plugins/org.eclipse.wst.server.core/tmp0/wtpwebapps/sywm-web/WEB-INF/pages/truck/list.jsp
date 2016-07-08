<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

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
				<li><a href="javascript:void(0);">车队管理</a></li>
				<li class="am-active">车辆管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="新增车辆信息" type="button" class="am-btn am-btn-default" onclick="javascript:jumpTo('truck/add')">
							<span class="am-icon-plus"></span> 新增
						</button>
					</div>
					<!-- search start -->
					<div style="float: right;width: 300px;">
						<div class="am-input-group">
							<input type="text" id="searchCode" class="am-form-field" placeholder="货车牌号">
							<span class="am-input-group-btn">
								<button class="am-btn am-btn-default" type="button" onclick="javascript:search()"
									style="margin-left: -1px">
									<i class="am-icon-search"></i> 搜索
								</button>
							</span>
						</div>
					</div>
					<!-- search end -->
				</div>
			</div>
			<!-- tool bar end -->
			<!-- table start -->
			<table id="showListTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>货车牌号</th>
						<th>类型</th>
						<th>载重(吨)</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
			</table>
			<!-- table end -->
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath }/js/app/truck/list.js"></script>
</body>
</html>