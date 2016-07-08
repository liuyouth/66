<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

</head>
<body class="am-container wm-container">
	
	<!-- header start -->
	<%@ include file="/WEB-INF/pages/inc/header.jsp"%>
	<!-- header end -->
		
	<div class="am-g" style="margin-top: 150px;">
		<div class="am-u-sm-10 am-u-sm-centered">
			<!-- context start -->
			<div class="am-g">
				<div class="am-u-sm-9 am-u-sm-centered">
					<div class="am-input-group">
						<span class="am-input-group-label">运单号</span>
						<input id="searchInput" type="text" class="am-form-field">
						<span class="am-input-group-btn">
							<button class="am-btn am-btn-default" type="button" onclick="javascript:$('#dataPanel').show();">
								<span class="am-icon-search"></span>搜索
							</button>
						</span>
					</div>
				</div>
			</div>
			<hr class="wm-hr" style="margin: 30px 0 !important;">
			<div class="am-g">
				<div class="am-u-sm-12">
					<div id="dataPanel" class="am-panel am-panel-default" style="display: none;">
						<div class="am-panel-hd">
							<div class="am-g">
								<div class="am-u-sm-12">
									运单号：<span>DD10000001</span>
									<span class="am-badge am-badge-danger">已出库</span>
									<span class="am-badge am-badge-danger">代收未缴</span>
									<span style="float: right;">
										总金额：￥
										<span class="am-text-danger">16000.00</span>
										<span class="am-badge am-badge-danger">委托收款</span>
									</span>
								</div>
							</div>
							<hr class="wm-hr">
							<div class="am-g">
								<div class="am-u-sm-12">
									收货人：北京xx贸易公司  北京市丰台区总部基地 赵六 13800138000
								</div>
							</div>
						</div>
						<div class="am-panel-bd">
							<table class="am-table wm-table am-table-bordered">
								<thead>
									<tr>
										<th>商品</th>
										<th>规格</th>
										<th>单价</th>
										<th>数量</th>
										<th>合计</th>
										<th>退货数量</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td style="width: 30%;">
											金龙鱼花生油
										</td>
										<td style="width: 15%;">5L/瓶</td>
										<td style="width: 10%;">80</td>
										<td style="width: 15%;">100瓶</td>
										<td style="width: 20%;">8000</td>
										<td style="width: 10%;">
											<input type="text">
										</td>
									</tr>
									<tr>
										<td style="width: 35%;">
											金龙鱼大豆油
										</td>
										<td style="width: 15%;">5L/瓶</td>
										<td style="width: 10%;">80</td>
										<td style="width: 15%;">100瓶</td>
										<td style="width: 20%;">8000</td>
										<td style="width: 10%;">
											<input type="text">
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<footer class="am-panel-footer">
							<div class="am-g">
								<div class="am-u-sm-12" style="text-align:right;">
									<button type="button" class="am-btn am-btn-primary">签收</button>
									<button type="button" class="am-btn am-btn-primary">申请交款</button>
									<button type="button" class="am-btn am-btn-primary">退货</button>
								</div>
							</div>
						</footer>
					</div>
				</div>
			</div>
			<!-- context end -->
		</div>
	</div>
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath }/js/app/index.js"></script>
</body>
</html>