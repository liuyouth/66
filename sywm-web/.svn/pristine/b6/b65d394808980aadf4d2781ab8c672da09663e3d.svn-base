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
				<li><a href="${basePath}/stock/list/view">库存管理</a></li>
				<li class="am-active">查看盘库结果</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-g">
				<div class="am-u-sm-12" style="margin-bottom: 5px;">
					<div class="am-btn-group">
						<button type="button" class="am-btn am-btn-default" onclick="javascript:findDifference();">查看差异数据</button>
						<button type="button" class="am-btn am-btn-default" onclick="javascript:findAll();">查看全部数据</button>
					</div>
				</div>
			</div>
			<div class="am-panel am-panel-default">
				<div class="am-panel-hd">
					<div class="am-g">
						<div class="am-u-sm-3">
							盘库单号：<span>PK001</span>
						</div>
						<div class="am-u-sm-3">
							盘库负责人：<span>赵五</span>
						</div>
						<div class="am-u-sm-6">
						</div>
					</div>
					<hr class="wm-hr">
					<div class="am-g">
						<div class="am-u-sm-3">
							盘库日期：<span>2016-01-01</span>
						</div>
						<div class="am-u-sm-3">
							状态：<span>已完成</span>
						</div>
						<div class="am-u-sm-6">
						</div>
					</div>
				</div>
				<div class="am-panel-bd">
					<div class="am-panel am-panel-default" id="difference">
						<div class="am-panel-hd">
							 货位编号：<span>HW001</span>
						</div>
						<div class="am-panel-bd">
							<table id="showListTable" class="am-table am-table-striped am-table-hover table-main" >
							<thead>
								<tr>
									<th>商品名称</th>
									<th>库存数量</th>
									<th>实际数量</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>金龙鱼大豆油</td>
									<td>10</td>
									<td>10</td>
								</tr>
								<tr>
									<td>金龙鱼大豆油</td>
									<td>10</td>
									<td>10</td>
								</tr>
							</tbody>
						</table>
						</div>
					</div>
					<div class="am-panel am-panel-default">
						<div class="am-panel-hd">
							 货位编号：<span>HW002</span>
						</div>
						<div class="am-panel-bd">
							<table id="showListTable" class="am-table am-table-striped am-table-hover table-main" >
							<thead>
								<tr>
									<th>商品名称</th>
									<th>库存数量</th>
									<th>实际数量</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>金龙鱼大豆油</td>
									<td>10</td>
									<td>8</td>
								</tr>
								<tr>
									<td>金龙鱼大豆油</td>
									<td>10</td>
									<td>8</td>
								</tr>
							</tbody>
						</table>
						</div>
					</div>
					<div class="am-panel am-panel-default">
						<div class="am-panel-hd">
							 货位编号：<span>HW003</span>
						</div>
						<div class="am-panel-bd">
							<table id="showListTable" class="am-table am-table-striped am-table-hover table-main" >
							<thead>
								<tr>
									<th>商品名称</th>
									<th>库存数量</th>
									<th>实际数量</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>金龙鱼大豆油</td>
									<td>10</td>
									<td>8</td>
								</tr>
								<tr>
									<td>金龙鱼大豆油</td>
									<td>10</td>
									<td>8</td>
								</tr>
							</tbody>
						</table>
						</div>
					</div>
				</div>
				<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align:right;">
								<button type="button" class="am-btn am-btn-default" onclick="javascript:void(0);">调整库存</button>
								<button type="button" class="am-btn am-btn-default" onclick="javascript:history.back(-1);">返回</button>
							</div>
						</div>
					</footer>
			</div>
			<!-- context end -->
		</div>
	</div>
	<div class="wm-toTop">
		<a title="返回顶部" href="#hearderAnchor">
			<i class="am-icon-arrow-up"></i>
		</a>
	</div>
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath }/js/app/stock/detail.js"></script>
</body>
</html>