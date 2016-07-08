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
				<li><a href="${basePath}/return_goods/list/view">退货管理</a></li>
				<li class="am-active">新增退货单</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<!-- 编辑面板开始 -->
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">新增退货单</div>
					<div class="am-panel-bd">
						<form class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货方名称<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<div class="am-input-group">
										<input type="text" readonly="readonly">
										<span class="am-input-group-btn">
											<button class="am-btn am-btn-default" type="button" onclick="javascript:openRecipientChoosingModal();">使用已有收货人</button>
										</span>
									</div>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货地址
								</label>
								<div class="am-u-sm-9">
									<input type="text" readonly="readonly">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货方联系人
								</label>
								<div class="am-u-sm-9">
									<input type="text" readonly="readonly">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货方联系电话
								</label>
								<div class="am-u-sm-9">
									<input type="text" readonly="readonly">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货时间
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入收货时间" class="wm-Wdate" onFocus="WdatePicker({skin:'whyGreen'})" readonly="readonly">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收退货备注
								</label>
								<div class="am-u-sm-9">
									<textarea placeholder="请输入收退货备注"></textarea>
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">退货单商品详情信息</label>
									<button title="新增退货商品" type="button" class="am-btn am-btn-default" onclick="openCommodityChoosingModal();">
										<span class="am-icon-plus"></span> 新增
									</button>
								</div>
							</div>
						</div>
						<table class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th>自定义编码</th>
									<th>商品条码</th>
									<th>商品名称</th>
									<th>规格型号</th>
									<th>包装单位</th>
									<th>退货数量</th>
									<th style="text-align: center;">操作</th>
								</tr>
							</thead>
						</table>
					</div>
					<footer class="am-panel-footer">
						<div class="am-text-right">
							<button type="button" class="am-btn am-btn-primary">提交</button>
							<button type="button" class="am-btn am-btn-primary">保存</button>
							<button type="button" class="am-btn am-btn-default" onclick="history.back();">返回</button>
						</div>
					</footer>
				</div>
				<!-- 编辑面板结束 -->
				
				<!-- 商品选择窗口开始 -->
				<div id="commodityChoosingModal" class="am-modal am-modal-prompt" tabindex="-1">
					<div class="am-modal-dialog" style="width: 750px;">
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
												<th>商品条码</th>
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
												<td>9601963521427</td>
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
												<td>9601963521427</td>
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
											<label>退货数量</label>
											<input type="text" class="am-form-field" placeholder="请输入退货数量">
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="am-modal-footer">
							<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
							<span class="wm-modal-btn">确定</span>
						</div>
					</div>
				</div>
				<!-- 商品选择窗口结束 -->
				
				<!-- 商品编辑窗口开始 -->
				<div id="commodityEditingModal" class="am-modal am-modal-prompt" tabindex="-1">
					<div class="am-modal-dialog" style="width: 600px;">
						<div class="am-modal-hd">编辑商品</div>
						<div class="am-modal-bd am-text-left wm-modal-bd">
							<form class="am-form wm-form am-form-horizontal">
								<div class="am-form-group">
									<label class="am-u-sm-3 am-form-label">
										退货数量
									</label>
									<div class="am-u-sm-9">
										<input type="text" class="am-form-field" placeholder="请输入退货数量">
									</div>
								</div>
							</form>
						</div>
						<div class="am-modal-footer">
							<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
							<span class="wm-modal-btn">确定</span>
						</div>
					</div>
				</div>
				<!-- 商品编辑窗口结束 -->
				
			</div>
			<!-- context end -->
		</div>
	</div>
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath}/js/app/return_goods/edit.js"></script>
</body>