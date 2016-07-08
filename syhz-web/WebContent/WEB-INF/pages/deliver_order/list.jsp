<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

<style type="text/css">
.am-selected-btn {
	border-color: #ccc;
	height: 38px;
}
</style>

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
				<li class="am-active">发货订单管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="新增发货订单" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/deliver_order/add/view';">
							<i class="am-icon-plus"></i> 新增
						</button>
					</div>
					<!-- search start -->
					<div style="float: right; width: 300px;">
						<div class="am-input-group">
							<input type="text" class="am-form-field" placeholder="请输入关键字">
							<span class="am-input-group-btn">
								<button title="搜索发货订单" class="am-btn am-btn-default" type="button" style="margin-left: -1px">
									<i class="am-icon-search"></i> 搜索
								</button>
							</span>
						</div>
					</div>
					<div class="am-fr" style="margin-right: 8px; width: 180px;">
						<div class="am-input-group">
							<span class="am-input-group-label">订单状态</span>
							<select class="am-btn am-btn-default" data-am-selected="{btnWidth: 80}">
								<option>全部</option>
								<option>未提交</option>
								<option>未分拣</option>
								<option>分拣中</option>
								<option>已出库</option>
								<option>已签收</option>
							</select>
						</div>
					</div>
					<!-- search end -->
				</div>
			</div>
			<!-- tool bar end -->
			<!-- 发货订单表格开始 -->
			<table id="deliverOrderTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>订单编号</th>
						<th>收货方</th>
						<th>货物金额</th>
						<th>二次包装</th>
						<th>订单状态</th>
						<th>委托收款</th>
						<th style="text-align: center; width: 220px;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>FH160621123001</td>
						<td>北京百姓便利店</td>
						<td>1000.00</td>
						<td>是</td>
						<td>未提交</td>
						<td>&nbsp;</td>
						<td class="am-text-center">
							<div class="am-btn-group am-btn-group-xs">
								<button title="编辑发货订单" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/edit/view';">
									编辑
								</button>
								<button title="发货订单商品" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/commodity/list/view';">
									商品
								</button>
								<button title="提交发货订单" class="am-btn am-btn-default am-btn-xs am-text-secondary">
									提交
								</button>
								<button title="删除发货订单" class="am-btn am-btn-default am-btn-xs am-text-danger">
									删除
								</button>
							</div>
						</td>
					</tr>
					<tr>
						<td>FH160621123002</td>
						<td>李四</td>
						<td>2000.00</td>
						<td>&nbsp;</td>
						<td>未分拣</td>
						<td>&nbsp;</td>
						<td class="am-text-center">
							<div class="am-btn-group am-btn-group-xs">
								<button title="发货订单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/detail/view';">
									详情
								</button>
							</div>
						</td>
					</tr>
					<tr>
						<td>FH160621123003</td>
						<td>张三</td>
						<td>1500.00</td>
						<td>&nbsp;</td>
						<td>分拣中</td>
						<td>&nbsp;</td>
						<td class="am-text-center">
							<div class="am-btn-group am-btn-group-xs">
								<button title="发货订单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/detail/view';">
									详情
								</button>
							</div>
						</td>
					</tr>
					<tr>
						<td>FH160621123004</td>
						<td>张三</td>
						<td>800.00</td>
						<td>&nbsp;</td>
						<td>已出库</td>
						<td>&nbsp;</td>
						<td class="am-text-center">
							<div class="am-btn-group am-btn-group-xs">
								<button title="发货订单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/detail/view';">
									详情
								</button>
							</div>
						</td>
					</tr>
					<tr>
						<td>FH160621123005</td>
						<td>王五</td>
						<td>500.00</td>
						<td>&nbsp;</td>
						<td>已签收</td>
						<td>客户未付</td>
						<td class="am-text-center">
							<div class="am-btn-group am-btn-group-xs">
								<button title="发货订单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/detail/view';">
									详情
								</button>
							</div>
						</td>
					</tr>
					<tr>
						<td>FH160621123006</td>
						<td>王五</td>
						<td>500.00</td>
						<td>&nbsp;</td>
						<td>已签收</td>
						<td>代收未缴</td>
						<td class="am-text-center">
							<div class="am-btn-group am-btn-group-xs">
								<button title="发货订单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/detail/view';">
									详情
								</button>
							</div>
						</td>
					</tr>
					<tr>
						<td>FH160621123007</td>
						<td>王五</td>
						<td>500.00</td>
						<td>&nbsp;</td>
						<td>已签收</td>
						<td>已缴清</td>
						<td class="am-text-center">
							<div class="am-btn-group am-btn-group-xs">
								<button title="发货订单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/detail/view';">
									详情
								</button>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<!-- 发货订单表格结束 -->
			
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath}/js/app/deliver_order/list.js"></script>
</body>
</html>