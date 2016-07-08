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
				<li><a href="${basePath}/deliver_order/list/view">发货订单管理</a></li>
				<li><a href="${basePath}/deliver_order/commodity/list/view">发货订单商品</a></li>
				<li class="am-active">批次</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-g">
						<div class="am-u-sm-12" style="text-align: center;">
							<h2>
								JLYDDY 金龙鱼大豆油 10L/桶 * 100
								<br>
								选择批次
							</h2>
						</div>
					</div>
					<hr class="wm-hr">
					<div class="am-btn-group">
						<button title="返回发货订单商品列表" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/deliver_order/commodity/list/view';">
							<i class="am-icon-chevron-left"></i> 返回发货订单商品列表
						</button>
						<button title="选择赠品" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/deliver_order/commodity/gift/list/view';">
							<i class="am-icon-gift"></i> 选择赠品
						</button>
						<button title="重新选择批次" type="button" class="am-btn am-btn-default" onclick="openBatchChoosingModal();">
							<i class="am-icon-pencil-square-o"></i> 重新选择
						</button>
					</div>
				</div>
			</div>
			<!-- tool bar end -->
			<!-- 批次表格开始 -->
			<table id="deliverOrderBatchTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>生产日期</th>
						<th>临期</th>
						<th>保质期</th>
						<th>库存数量</th>
						<th>发货数量</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>2016-01-01</td>
						<td>2016-05-31</td>
						<td>2016-06-30</td>
						<td>100</td>
						<td>60</td>
					</tr>
					<tr>
						<td>2016-03-01</td>
						<td>2016-07-31</td>
						<td>2016-08-31</td>
						<td>100</td>
						<td>40</td>
					</tr>
				</tbody>
			</table>
			<!-- 批次表格结束 -->
			
			<!-- 批次选择窗口开始 -->
			<div id="batchChoosingModal" class="am-modal am-modal-prompt" tabindex="-1">
				<div class="am-modal-dialog" style="width: 1100px;">
					<div class="am-modal-hd">选择批次</div>
					<div class="am-modal-bd am-text-left wm-modal-bd">
						<div class="am-panel am-panel-default">
							<div class="am-panel-bd">
								<label>发货总量：</label><span>100</span>
							</div>
						</div>
						<div class="am-panel am-panel-default">
							<div class="am-panel-bd">
								<table id="batchChoosingTable" class="am-table am-table-striped am-table-hover table-main" style="width: 100%;">
									<thead>
										<tr>			
											<th>生产日期</th>
											<th>临期</th>
											<th>保质期</th>
											<th>库存数量</th>
											<th>发货数量</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>2016-01-01</td>
											<td>2016-05-31</td>
											<td>2016-06-30</td>
											<td>100</td>
											<td><input type="text" value="60"></td>
										</tr>
										<tr>
											<td>2016-02-01</td>
											<td>2016-06-30</td>
											<td>2016-07-31</td>
											<td>100</td>
											<td><input type="text"></td>
										</tr>
										<tr>
											<td>2016-03-01</td>
											<td>2016-07-31</td>
											<td>2016-08-31</td>
											<td>100</td>
											<td><input type="text" value="40"></td>
										</tr>
										<tr>
											<td>2016-04-01</td>
											<td>2016-08-31</td>
											<td>2016-09-30</td>
											<td>100</td>
											<td><input type="text"></td>
										</tr>
										<tr>
											<td>2016-05-01</td>
											<td>2016-09-31</td>
											<td>2016-10-31</td>
											<td>100</td>
											<td><input type="text"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<div class="am-modal-footer">
						<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
						<span class="wm-modal-btn" onclick="location.href='${basePath}/deliver_order/commodity/gift/list/view';">确定并选择赠品</span>
						<span class="wm-modal-btn" data-am-modal-close>确定</span>
					</div>
				</div>
			</div>
			<!-- 批次选择窗口结束 -->
			
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath}/js/app/deliver_order/commodity/batch/list.js"></script>
</body>
</html>