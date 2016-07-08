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
				<li><a href="${basePath}/damage/list/view">报损管理</a></li>
				<li class="am-active">编辑报损信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">编辑报损信息</div>
					<div class="am-panel-bd">
						<form id="addForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">破损信息编号</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">BS160621012001</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">填单时间</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">2016-06-21 08:19:22</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">破损环节 </label>
								<div class="am-u-sm-9">
									<select data-am-selected>
										<option>请选择破损环节</option>
										<option value="0" selected="selected">收货</option>
										<option value="1">退货</option>
										<option value="2">其他</option>
									</select>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">报损说明</label>
								<div class="am-u-sm-9">
									<textarea rows="4" cols="10" placeholder="请输入破损说明">货物在运送过程中大量破损</textarea>
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">报损商品信息</label>
								</div>
							</div>
						</div>
						<table id="damageListTable"
							class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th>商品编号</th>
									<th>商品名称</th>
									<th>商品规格型号</th>
									<th>商品数量</th>
									<th>包装单位</th>
									<th>包装内商品数量</th>
									<th>生产日期</th>
									<th>临期</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>food_5</td>
									<td>粮油</td>
									<td>10L/桶</td>
									<td>12</td>
									<td>箱</td>
									<td>4</td>
									<td>2015-06-06</td>
									<td>2015-07-07</td>
								</tr>

							</tbody>
						</table>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align: right;">
								<button type="button" class="am-btn am-btn-primary">保存</button>
								<button type="button" class="am-btn am-btn-primary">提交</button>
								<button type="button" class="am-btn am-btn-default"
									onclick="javascript:history.back(-1);">返回</button>
							</div>
						</div>
					</footer>
				</div>
				<!-- context end -->
			</div>
		</div>
	</div>
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->

	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->

	<script type="text/javascript" src="${basePath }/js/app/damage/edit.js"></script>
</body>
</html>