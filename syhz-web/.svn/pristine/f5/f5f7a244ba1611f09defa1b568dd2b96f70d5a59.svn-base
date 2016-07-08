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
				<li class="am-active">发货订单商品</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="返回发货订单管理" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/deliver_order/list/view';">
							<i class="am-icon-chevron-left"></i> 返回发货订单管理
						</button>
						<button title="新增发货订单商品" type="button" class="am-btn am-btn-default" onclick="openCommodityChoosingModal();">
							<i class="am-icon-plus"></i> 新增
						</button>
					</div>
					<!-- search start -->
					<!-- search end -->
				</div>
			</div>
			<!-- tool bar end -->
			<!-- 发货订单商品表格开始 -->
			<table id="deliverOrderCommodityTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>自定义编码</th>
						<th>商品名称</th>
						<th>规格型号</th>
						<th>包装单位</th>
						<th>发货数量</th>
						<th>商品单价</th>
						<th>商品金额</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>JLYDDY</td>
						<td>金龙鱼大豆油</td>
						<td>10L/桶</td>
						<td>箱</td>
						<td>100</td>
						<td>50.00</td>
						<td>5000.00</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑发货订单商品" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="openCommodityEditingModal();">
										编辑
									</button>
									<button title="查看批次" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/commodity/batch/list/view';">
										批次
									</button>
									<button title="查看赠品" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/deliver_order/commodity/gift/list/view';">
										赠品
									</button>
									<button title="删除发货订单商品" class="am-btn am-btn-default am-btn-xs am-text-danger">
										删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>金龙鱼大豆油</td>
						<td>10L/桶</td>
						<td>箱</td>
						<td>100</td>
						<td>50.00</td>
						<td>5000.00</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑发货订单商品" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="openCommodityEditingModal();">
										编辑
									</button>
									<button title="查看批次" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/commodity/batch/list/view';">
										批次
									</button>
									<button title="查看赠品" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/commodity/gift/list/view';">
										赠品
									</button>
									<button title="删除发货订单商品" class="am-btn am-btn-default am-btn-xs am-text-danger">
										删除
									</button>
								</div>
							</div>
						</td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<th colspan="7">合计</th>
						<th colspan="2">10000.00</th>
					</tr>
				</tfoot>
			</table>
			<!-- 发货订单商品表格结束 -->
			
			<!-- 商品选择窗口开始 -->
			<div id="commodityChoosingModal" class="am-modal am-modal-prompt" tabindex="-1">
				<div class="am-modal-dialog" style="width: 950px;">
					<div class="am-modal-hd">选择商品</div>
					<div class="am-modal-bd am-text-left wm-modal-bd">
						<div class="am-panel am-panel-default">
							<div class="am-panel-bd">
								<form class="am-form-inline" role="form">
									<div class="am-form-group">
										<label>自定义编码</label>
										<input type="text" class="am-form-field" placeholder="请输入自定义编码">
									</div>
									<div class="am-form-group">
										<label>商品名称</label>
										<input type="text" class="am-form-field" placeholder="请输入商品名称">
									</div>
									<button title="搜索商品" type="button" class="am-btn am-btn-default">搜索</button>
								</form>
								<hr class="wm-hr" style="margin-top: 15px!important;">
								<table id="commodityChoosingTable" class="am-table am-table-striped am-table-hover table-main" style="width: 100%;">
									<thead>
										<tr>
											<th>选择</th>
											<th>自定义编码</th>
											<th>商品名称</th>
											<th>规格型号</th>
											<th>包装单位</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>
												<label class="am-radio">
													<input type="radio" name="radio">
												</label>
											</td>
											<td>JLYDDY</td>
											<td>金龙鱼大豆油</td>
											<td>10L/桶</td>
											<td>箱</td>
										</tr>
										<tr>
											<td>
												<label class="am-radio">
													<input type="radio" name="radio">
												</label>
											</td>
											<td>&nbsp;</td>
											<td>金龙鱼大豆油</td>
											<td>10L/桶</td>
											<td>箱</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="am-panel am-panel-default">
							<div class="am-panel-bd">
								<form class="am-form-inline" role="form">
									<div class="am-form-group">
										<label>发货数量</label>
										<input type="text" class="am-form-field" placeholder="请输入发货数量">
									</div>
									<div class="am-form-group">
										<label>商品单价</label>
										<input type="text" class="am-form-field" placeholder="请输入商品单价">
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="am-modal-footer">
						<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
						<span class="wm-modal-btn" onclick="location.href='${basePath}/deliver_order/commodity/batch/list/view';">确定并选择批次</span>
						<span class="wm-modal-btn" data-am-modal-close>确定</span>
					</div>
				</div>
			</div>
			<!-- 商品选择窗口结束 -->
			
			<!-- 商品编辑窗口开始 -->
			<div id="commodityEditingModal" class="am-modal am-modal-prompt" tabindex="-1">
				<div class="am-modal-dialog">
					<div class="am-modal-hd">编辑商品</div>
					<div class="am-modal-bd am-text-left wm-modal-bd">
						<form class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									发货数量
								</label>
								<div class="am-u-sm-9">
									<input type="text" class="am-form-field" placeholder="请输入发货数量" value="100">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									商品单价
								</label>
								<div class="am-u-sm-9">
									<input type="text" class="am-form-field" placeholder="请输入商品单价" value="50">
								</div>
							</div>
						</form>
					</div>
					<div class="am-modal-footer">
						<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
						<span class="wm-modal-btn" onclick="location.href='${basePath}/deliver_order/commodity/batch/list/view';">确定并选择批次</span>
						<span class="wm-modal-btn" data-am-modal-close>确定</span>
					</div>
				</div>
			</div>
			<!-- 商品编辑窗口结束 -->
			
			<!-- context start -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath}/js/app/deliver_order/commodity/list.js"></script>
</body>
</html>