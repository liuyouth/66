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
				<li><a href="${basePath}/arrival_plan/list/view">到货计划管理</a></li>
				<li class="am-active">新增到货计划</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<!-- 新增面板开始 -->
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">新增到货计划</div>
					<div class="am-panel-bd">
						<form class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									发货时间<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入发货时间" class="wm-Wdate" onFocus="WdatePicker({skin:'whyGreen'})" readonly="readonly">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									预计到货时间<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入预计到货时间" class="wm-Wdate" onFocus="WdatePicker({skin:'whyGreen'})" readonly="readonly">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									送货联系人<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入送货联系人">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									送货联系人电话<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入送货联系人电话">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									直送
								</label>
								<div class="am-u-sm-9">
									<label class="am-checkbox">
										<input type="checkbox" onclick="switchDirectDelivery(this);">
									</label>
								</div>
							</div>
							<div class="am-form-group" style="display: none;" id="directDeliveryExplainContainer">
								<label class="am-u-sm-3 am-form-label">
									直送说明
								</label>
								<div class="am-u-sm-9">
									<textarea placeholder="请输入直送说明"></textarea>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									备注
								</label>
								<div class="am-u-sm-9">
									<textarea placeholder="请输入备注"></textarea>
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">到货计划商品详情信息</label>
									<button title="新增到货计划商品" type="button" class="am-btn am-btn-default" onclick="openCommodityChoosingModal();">
										<span class="am-icon-plus"></span> 新增
									</button>
								</div>
							</div>
						</div>
						<table class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th>自定义编码</th>
									<th>商品名称</th>
									<th>规格型号</th>
									<th>计划到货数量</th>
									<th>包装单位</th>
									<th width="150" class="am-text-center">操作</th>
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
				<!-- 新增面板结束 -->
				
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
											<label>计划到货数量</label>
											<input type="text" class="am-form-field" placeholder="请输入计划到货数量">
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
										计划到货数量
									</label>
									<div class="am-u-sm-9">
										<input type="text" class="am-form-field" placeholder="请输入计划到货数量">
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
	
	<script type="text/javascript" src="${basePath}/js/app/arrival_plan/add.js"></script>
</body>