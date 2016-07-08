<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
				<li><a href="javascript:void(0);">分拣管理</a></li>
				<li><a href="${basePath}/sorting/sortingList/view">分拣单</a></li>
				<li class="am-active">新增分拣单</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">新增分拣单</div>
					<div class="am-panel-bd">
						<form id="addForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 分拣负责人<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入分拣负责人">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 司机<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入司机姓名">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 车牌号<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入车牌号">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 月台<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入月台编号">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 预计出库时间<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" class="wm-Wdate"
										onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',skin:'whyGreen'})"
										readonly="readonly">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 备注 </label>
								<div class="am-u-sm-9 am-input-group">
									<textarea rows="6" cols="20"></textarea>
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">分拣单详情信息</label>
									<button title="添加订单" type="button"
										class="am-btn am-btn-default" onclick="javascript:void(0)">
										<span class="am-icon-plus"></span> 添加订单
									</button>
								</div>
							</div>
						</div>
						<div class="am-panel-bd">
							<div class="am-panel am-panel-default">
								<div class="am-panel-hd">
									订单号：<span>DD001</span>
								</div>
								<div class="am-panel-bd">
									<table id="showListTable"
										class="am-table am-table-striped am-table-hover table-main">
										<thead>
											<tr>
												<th>商品名称</th>
												<th>数量</th>
												<th>批次</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>大豆油</td>
												<td>10</td>
												<td>1</td>
												<td>
													<button type="button" class="am-btn am-btn-default"
														onclick="javascript:void(0);">编辑</button>
												</td>
											</tr>
											<tr>
												<td>大豆油</td>
												<td>10</td>
												<td>1</td>
												<td>
													<button type="button" class="am-btn am-btn-default"
														onclick="javascript:void(0);">编辑</button>
												</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align: right;">
								<button type="button" class="am-btn am-btn-primary">保存</button>
								<button type="button" class="am-btn am-btn-primary">分拣</button>
								<button type="button" class="am-btn am-btn-default"
									onclick="javascript:history.back(-1);">返回</button>
							</div>
						</div>
					</footer>
				</div>
			</div>
		</div>
		<!-- context end -->
	</div>

	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->

	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->

	<script type="text/javascript"
		src="${basePath }/js/app/sorting/sortingAdd.js"></script>
</body>
</html>