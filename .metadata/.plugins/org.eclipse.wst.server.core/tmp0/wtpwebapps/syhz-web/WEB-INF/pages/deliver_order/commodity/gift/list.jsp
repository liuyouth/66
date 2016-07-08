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
				<li class="am-active">赠品</li>
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
								选择赠品
							</h2>
						</div>
					</div>
					<hr class="wm-hr">
					<div class="am-btn-group">
						<button title="返回选择批次" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/deliver_order/commodity/batch/list/view';">
							<i class="am-icon-chevron-left"></i> 返回选择批次
						</button>
						<button title="返回发货订单商品列表" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/deliver_order/commodity/list/view';">
							<i class="am-icon-chevron-left"></i> 返回发货订单商品列表
						</button>
						<button title="新增赠品" type="button" class="am-btn am-btn-default" onclick="openGiftChoosingModal();">
							<i class="am-icon-plus"></i> 新增
						</button>
					</div>
				</div>
			</div>
			<!-- tool bar end -->
			<!-- 赠品表格开始 -->
			<table id="deliverOrderCommodityGiftTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>自定义编码</th>
						<th>商品名称</th>
						<th>规格型号</th>
						<th>包装单位</th>
						<th>生产日期</th>
						<th>临期</th>
						<th>是否破损</th>
						<th>数量</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>JLYDDY</td>
						<td>金龙鱼大豆油</td>
						<td>10L/桶</td>
						<td>箱</td>
						<td>2016-01-01</td>
						<td>2016-05-31</td>
						<td>是</td>
						<td>1</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑赠品数量" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="openGiftEditingModal();">
										编辑
									</button>
									<button title="删除赠品" class="am-btn am-btn-default am-btn-xs am-text-danger">
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
						<td>2016-01-01</td>
						<td>2016-05-31</td>
						<td>&nbsp;</td>
						<td>1</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑赠品数量" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="openGiftEditingModal();">
										编辑
									</button>
									<button title="删除赠品" class="am-btn am-btn-default am-btn-xs am-text-danger">
										删除
									</button>
								</div>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<!-- 赠品表格结束 -->
			
			<!-- 赠品选择窗口开始 -->
			<div id="giftChoosingModal" class="am-modal am-modal-prompt" tabindex="-1">
				<div class="am-modal-dialog" style="width: 1100px;">
					<div class="am-modal-hd">选择赠品</div>
					<div class="am-modal-bd am-text-left wm-modal-bd">
						<div class="am-panel am-panel-default">
							<div class="am-panel-bd">
								<form class="am-form am-form-horizontal am-g am-text-right" role="form">
									<div class="am-form-group am-u-sm-6">
										<label class="am-u-sm-3">自定义编码</label>
										<div class="am-u-sm-9">
											<input type="text" placeholder="请输入自定义编码">
										</div>
									</div>
									<div class="am-form-group am-u-sm-6">
										<label class="am-u-sm-3">商品名称</label>
										<div class="am-u-sm-9">
											<input type="text" placeholder="请输入商品名称">
										</div>
									</div>
									<div class="am-form-group am-u-sm-6">
										<label class="am-u-sm-3">生产日期</label>
										<div class="am-input-group am-u-sm-9">
											<input type="text" class="am-form-field wm-Wdate" onfocus="WdatePicker({skin:'whyGreen'})">
											<span class="am-input-group-label" style="border-style: solid none;">~</span>
											<input type="text" class="am-form-field wm-Wdate" onfocus="WdatePicker({skin:'whyGreen'})">
										</div>
									</div>
									<div class="am-form-group am-u-sm-6">
										<label class="am-u-sm-3">临期</label>
										<div class="am-input-group am-u-sm-9">
											<input type="text" class="am-form-field wm-Wdate" onfocus="WdatePicker({skin:'whyGreen'})">
											<span class="am-input-group-label" style="border-style: solid none;">~</span>
											<input type="text" class="am-form-field wm-Wdate" onfocus="WdatePicker({skin:'whyGreen'})">
										</div>
									</div>
									<div class="am-form-group am-u-sm-6">
										<label class="am-u-sm-3">是否破损</label>
										<div class="am-u-sm-9">
											<div class="am-text-left">
												<label>
													<input type="checkbox"> 破损
												</label>
											</div>
										</div>
									</div>
									<div class="am-form-group am-u-sm-6">
										<div class="am-u-sm-12">
											<button title="搜索商品" type="button" class="am-btn am-btn-default">
												<i class="am-icon-search"></i> 搜索
											</button>
										</div>
									</div>
								</form>
								<hr class="wm-hr">
								<table id="giftChoosingTable" class="am-table am-table-striped am-table-hover table-main" style="width: 100%;">
									<thead>
										<tr>
											<th>选择</th>
											<th>自定义编码</th>
											<th>商品名称</th>
											<th>规格型号</th>
											<th>包装单位</th>
											<th>生产日期</th>
											<th>临期</th>
											<th>是否破损</th>
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
											<td>2016-01-01</td>
											<td>2016-05-31</td>
											<td>是</td>
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
											<td>2016-01-01</td>
											<td>2016-05-31</td>
											<td>&nbsp;</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="am-panel am-panel-default">
							<div class="am-panel-bd">
								<form class="am-form-inline" role="form">
									<div class="am-form-group">
										<label>赠品数量</label>
										<input type="text" class="am-form-field" placeholder="请输入赠品数量">
									</div>
								</form>
							</div>
						</div>
					</div>
					<div class="am-modal-footer">
						<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
						<span class="wm-modal-btn" data-am-modal-close>确定</span>
					</div>
				</div>
			</div>
			<!-- 赠品选择窗口结束 -->
			
			<!-- 赠品编辑窗口开始 -->
			<div id="giftEditingModal" class="am-modal am-modal-prompt" tabindex="-1">
				<div class="am-modal-dialog">
					<div class="am-modal-hd">编辑赠品</div>
					<div class="am-modal-bd am-text-left wm-modal-bd">
						<form class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									赠品数量
								</label>
								<div class="am-u-sm-9">
									<input type="text" class="am-form-field" placeholder="请输入赠品数量" value="1">
								</div>
							</div>
						</form>
					</div>
					<div class="am-modal-footer">
						<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
						<span class="wm-modal-btn" data-am-modal-close>确定</span>
					</div>
				</div>
			</div>
			<!-- 赠品编辑窗口结束 -->
				
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath}/js/app/deliver_order/commodity/gift/list.js"></script>
</body>
</html>