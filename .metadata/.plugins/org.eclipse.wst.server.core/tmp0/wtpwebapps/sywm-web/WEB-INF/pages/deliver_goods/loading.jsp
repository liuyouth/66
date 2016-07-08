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
				<li><a href="javascript:void(0);">发货管理</a></li>
			</ol>
			<hr class="wm-hr">  
			<div class="am-btn-group" style="margin-bottom: 5px;">
				<button title="打印装车单" type="button" class="am-btn am-btn-default" onclick="javascript:void(0);">
					<span class="am-icon-print"></span> 打印装车单
				</button>
				<button title="打印所有运单" type="button" class="am-btn am-btn-default" onclick="javascript:void(0);">
					<span class="am-icon-print"></span> 打印运单
				</button>
			</div>
			<!-- context start -->
			<div class="am-panel am-panel-default">
				<div class="am-panel-hd">
					<div class="am-g">
						<div class="am-u-sm-3">
							装车单号：<span>ZC10000001</span>
						</div>
						<div class="am-u-sm-3">
							状态：<span>待出发</span>
						</div>
						<div class="am-u-sm-6">
						</div>
					</div>
					<hr class="wm-hr">
					<div class="am-g">
						<div class="am-u-sm-3">
							承运人：<span>张三</span>
						</div>
						<div class="am-u-sm-3">
							车牌号：<span>京P 12025</span>
						</div>
						<div class="am-u-sm-6">
						</div>
					</div>
				</div>
				<div class="am-panel-bd">
					<div class="am-panel am-panel-default">
						<div class="am-panel-hd">
							 运单号：<span>YD10000001</span>
						</div>
						<div class="am-panel-bd">
							<table class="am-table wm-table am-table-bordered">
								<tr>
									<td style="width: 35%;">
										商品1
										<br>
										100*100ml&nbsp;&nbsp;500瓶&nbsp;&nbsp;￥5000.00
									</td>
									<td style="width: 15%;" rowspan="2">收货人1</td>
									<td style="width: 10%;" rowspan="2">13800138000</td>
									<td style="width: 20%;" rowspan="2">北京市丰台区总部基地</td>
									<td style="width: 20%;" rowspan="2">金额1</td>
								</tr>
								<tr>
									<td style="width: 35%;">商品2</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="am-panel am-panel-default">
						<div class="am-panel-hd">
							运单号：<span>YD10000002</span>
						</div>
						<div class="am-panel-bd">
							<table class="am-table wm-table am-table-bordered">
								<tr>
									<td style="width: 35%;">商品1</td>
									<td style="width: 15%;" rowspan="2">收货人2</td>
									<td style="width: 10%;" rowspan="2">13800138000</td>
									<td style="width: 20%;" rowspan="2">北京市丰台区总部基地</td>
									<td style="width: 20%;" rowspan="2">金额1</td>
								</tr>
								<tr>
									<td style="width: 35%;">商品2</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="am-panel am-panel-default">
						<div class="am-panel-hd">
							运单号：<span>YD10000003</span>
						</div>
						<div class="am-panel-bd">
							<table class="am-table wm-table am-table-bordered">
								<tr>
									<td style="width: 35%;">商品1</td>
									<td style="width: 15%;" rowspan="2">收货人2</td>
									<td style="width: 10%;" rowspan="2">13800138000</td>
									<td style="width: 20%;" rowspan="2">北京市丰台区总部基地</td>
									<td style="width: 20%;" rowspan="2">金额1</td>
								</tr>
								<tr>
									<td style="width: 35%;">商品2</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="am-panel am-panel-default">
						<div class="am-panel-hd">
							运单号：<span>YD10000004</span>
						</div>
						<div class="am-panel-bd">
							<table class="am-table wm-table am-table-bordered">
								<tr>
									<td style="width: 35%;">商品1</td>
									<td style="width: 15%;" rowspan="2">收货人2</td>
									<td style="width: 10%;" rowspan="2">13800138000</td>
									<td style="width: 20%;" rowspan="2">北京市丰台区总部基地</td>
									<td style="width: 20%;" rowspan="2">金额1</td>
								</tr>
								<tr>
									<td style="width: 35%;">商品2</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="am-panel am-panel-default">
					<div class="am-panel-hd">
						运单号：<span>YD10000005</span>
					</div>
					<div class="am-panel-bd">
						<table class="am-table wm-table am-table-bordered">
							<tr>
								<td style="width: 35%;">商品1</td>
								<td style="width: 15%;" rowspan="2">收货人2</td>
								<td style="width: 10%;" rowspan="2">13800138000</td>
								<td style="width: 20%;" rowspan="2">北京市丰台区总部基地</td>
								<td style="width: 20%;" rowspan="2">金额1</td>
							</tr>
							<tr>
								<td style="width: 35%;">商品2</td>
							</tr>
						</table>
					</div>
				</div>
				</div>
				<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align:right;">
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
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->

<script type="text/javascript" src="${basePath }/js/app/deliver_goods/loading.js"></script>	
</body>
</html>