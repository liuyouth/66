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
				<li><a href="${basePath}/goods_return/edit/view">退货管理</a></li>
				<li class="am-active">编辑退货单</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">编辑退货单</div>
					<div class="am-panel-bd">
						<form id="addForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">退货单号</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">TH160622012001</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">原出货单号<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input id="time" type="text" placeholder="请输入原出货单号" value="TH160622012001">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">退货日期<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input id="time" type="text" placeholder="请输入退货日期" value="2016-06-22" disabled="disabled">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">业务员<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input id="time" type="text" placeholder="请输入业务员姓名" value="张xx">
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">退货商品信息</label>
									<button title="添加退货商品" type="button"
										class="am-btn am-btn-default" onclick="javascript:void(0)">
										<span class="am-icon-plus"></span> 添加退货商品
									</button>
								</div>
							</div>
						</div>
						<table id="showListTable"
							class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th><input id="allCheckbox" type="checkbox"
										onclick="javascript:selectAll();" /></th>
									<th>商品编号</th>
									<th>商品名称</th>
									<th>商品规格型号</th>
									<th>包装单位</th>
									<th>包装商品数量</th>
									<th style="text-align: center;">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><input class="ckClassFlg" type="checkbox"></td>
									<td>food05</td>
									<td>玉米油</td>
									<td>10L/桶</td>
									<td>箱</td>
									<td>40</td>
									<td>
										<div class="am-u-sm-12" style="text-align: center;">
											<div class="am-btn-group am-btn-group-xs">
												<button title="编辑退货单"
													class="am-btn am-btn-default am-btn-xs am-text-secondary"
													onclick="javascript:jumpTo('goods_return/edit')">
													<span class="am-icon-edit"></span>编辑
												</button>
												<button
													class="am-btn am-btn-default am-btn-xs am-text-danger">
													<span class="am-icon-trash-o"></span> 删除
												</button>
											</div>
										</div>
									</td>
								</tr>
								<tr>
									<td><input class="ckClassFlg" type="checkbox"></td>
									<td>food05</td>
									<td>玉米油</td>
									<td>10L/桶</td>
									<td>箱</td>
									<td>40</td>
									<td>
										<div class="am-u-sm-12" style="text-align: center;">
											<div class="am-btn-group am-btn-group-xs">
												<button title="编辑退货单"
													class="am-btn am-btn-default am-btn-xs am-text-secondary"
													onclick="javascript:jumpTo('goods_return/edit')">
													<span class="am-icon-edit"></span>编辑
												</button>
												<button
													class="am-btn am-btn-default am-btn-xs am-text-danger">
													<span class="am-icon-trash-o"></span> 删除
												</button>
											</div>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align: right;">
								<button type="button" class="am-btn am-btn-primary">提交</button>
								<button type="button" class="am-btn am-btn-default"
									onclick="javascript:history.back(-1);">返回</button>
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

	<script type="text/javascript"
		src="${basePath }/js/app/goods_return/edit.js"></script>
</body>
</html>