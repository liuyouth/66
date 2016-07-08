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
				<li><a href="${basePath}/sorting/orderList/view">发货订单</a></li>
				<li class="am-active">查看发货订单详细信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">发货订单详细信息</div>
					<div class="am-panel-bd">
						<form id="editForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									订单编号 ：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										DD001
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									收货方名称 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										XX超市
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									收货地址 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										XX市XX区XX路XX号
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									收货方联系电话 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										13800138000
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									发货方式： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										直送
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									收款方式： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										货到付款
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									订单类型： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										紧急
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									商品总金额： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										5000
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									预计到达日期： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										2016-01-01
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									要求到货日期： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										2016-01-01
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									订单状态： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										已下单
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									是否二次包装 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										否
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									二次包装说明 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										无
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									业务员姓名： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										赵五
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									业务员联系电话 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										13800138000
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									填单时间： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										2016-01-01
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									备注 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										无
									</label>
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">收货单商品详情信息</label>
								</div>
							</div>
						</div>
						<table id="showListTable" class="am-table am-table-striped am-table-hover table-main" >
							<thead>
								<tr>
									<th>商品名称</th>
									<th>货主自定义商品编码</th>
									<th>商品条码</th>
									<th>商品规格型号</th>
									<th>包装单位</th>
									<th>包装内商品数量</th>
									<th>发货数量</th>
									<th>商品单价</th>
									<th>商品金额</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>大豆油</td>
									<td>100001</td>
									<td>100001</td>
									<td>10L/桶</td>
									<td>箱</td>
									<td>12桶</td>
									<td>10箱</td>
									<td>500</td>
									<td>5000</td>
								</tr>
								<tr>
									<td>大豆油</td>
									<td>100001</td>
									<td>100001</td>
									<td>10L/桶</td>
									<td>箱</td>
									<td>12桶</td>
									<td>10箱</td>
									<td>500</td>
									<td>5000</td>
								</tr>
							</tbody>
						</table>
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
	
	<script type="text/javascript" src="${basePath }/js/app/sorting/orderDetail.js"></script>
</body>
</html>