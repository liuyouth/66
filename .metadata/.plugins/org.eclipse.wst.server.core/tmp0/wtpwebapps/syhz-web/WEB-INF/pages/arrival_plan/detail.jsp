<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

<script type="text/javascript" src="${basePath}/js/lib/LodopFuncs.js" data="${basePath}" id="basePathID"></script>

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
				<li><a href="${basePath}/arrival_plan/list/view">到货计划</a></li>
				<li class="am-active">到货计划详细信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">到货计划详细信息</div>
					<div class="am-panel-bd">
						<form class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									到货计划编号：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										DH20160101001001
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									发货时间：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										2016-01-01
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									预计到货时间：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										2016-01-31
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									送货联系人：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										赵五
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									送货联系人电话：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										13800138000
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									直送：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										是
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									直送说明：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										收货后直接发货到XX处
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									到货计划备注：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										轻拿轻放,禁止堆放
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									填单时间：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										2016-01-01
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									到货状态：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										已收货
									</label>
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">到货计划商品详情信息</label>
								</div>
							</div>
						</div>
						<table class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th>自定义编码</th>
									<th>名称</th>
									<th>规格型号</th>
									<th>数量</th>
									<th>包装</th>
									<th>包装内商品数量</th>
									<th>累积收货数量</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>JLYDDY</td>
									<td>金龙鱼大豆油</td>
									<td>10L/桶</td>
									<td>100</td>
									<td>箱</td>
									<td>12桶</td>
									<td>100</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>金龙鱼大豆油</td>
									<td>10L/桶</td>
									<td>100</td>
									<td>箱</td>
									<td>12桶</td>
									<td>100</td>
								</tr>
							</tbody>
						</table>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align: right;">
								<button title="打印直送订单" type="button" class="am-btn am-btn-default" onclick="javascript:createPrintPage();">
									<span class="am-icon-print"></span> 打印直送订单
								</button>
								<button type="button" class="am-btn am-btn-default" onclick="javascript:history.back();">返回</button>
							</div>
						</div>
					</footer>
				</div>
			</div>
			<!-- context end -->
		</div>
	</div>
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<!-- Lodop start -->
	<object id="LODOP_OB" classid="clsid:2105C259-1E0C-4534-8141-A753534CB4CA" width="0px" height="0px">
		<embed id="LODOP_EM" type="application/x-print-lodop" width="0" height="0px"></embed>
	</object>
	<!-- Lodop end -->
	
	<script type="text/javascript" src="${basePath}/js/app/arrival_plan/detail.js"></script>
</body>
</html>