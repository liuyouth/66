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
				<li><a href="${basePath}/goods_receipt/arrivalGoodsList/view">收货单</a></li>
				<li class="am-active">查看收货单详细信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">收货单详细信息</div>
					<div class="am-panel-bd">
						<form id="editForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									收货单编号 ：
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										SH001
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									货主姓名 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										李四
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									发货时间 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										2016-01-01
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									预计到货时间 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										2016-01-31
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									送货联系人： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										赵五
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									送货联系人电话： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										13800138000
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									直送： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										否
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									直送说明： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										收货后直接发货到XX处
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									到货计划备注： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										轻拿轻放,禁止堆放
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									货主用户姓名： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										李四
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									填单时间 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										2016-01-01
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label" >
									到货状态 ： 
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label" >
										已收货
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
									<th>名称</th>
									<th>商品编码</th>
									<th>计划到货数量</th>
									<th>实际收货数量</th>
									<th>批次</th>
									<th>差异说明</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>金龙鱼大豆油</td>
									<td>100001</td>
									<td>10</td>
									<td>8</td>
									<td>1</td>
									<td><input type="text"><td>
								</tr>
								<tr>
									<td>金龙鱼大豆油</td>
									<td>100001</td>
									<td>10</td>
									<td>10</td>
									<td>1</td>
									<td><input type="text"><td>
								</tr>
							</tbody>
						</table>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align:right;">
								<button type="button" class="am-btn am-btn-primary">保存</button>
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
	
	<script type="text/javascript" src="${basePath }/js/app/goods_receipt/arrivalGoodsEdit.js"></script>
</body>
</html>