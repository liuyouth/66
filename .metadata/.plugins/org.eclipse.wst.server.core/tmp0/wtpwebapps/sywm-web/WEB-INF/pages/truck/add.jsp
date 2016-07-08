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
				<li><a href="javascript:void(0);">车队管理</a></li>
				<li><a href="${basePath}/goods_owner/list/view">车辆管理</a></li>
				<li class="am-active">新增车辆信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<form id="addForm" class="am-form wm-form am-form-horizontal">
					<div class="am-panel am-panel-primary wm-panel">
						<div class="am-panel-hd">新增车辆信息</div>
						<div class="am-panel-bd">

							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">货车牌号<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input type="text" name="truckNumber" datatype="*"
										ajaxurl="${basePath}/truck/unique" placeholder="请输入货车牌号">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">货车类型<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<select data-am-selected name="truckType">
										<option value="-1">请选择货车类型</option>
										<option value="1">厢式货车</option>
										<option value="2">面包车</option>
									</select>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">载重<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<div class="am-input-group">
										<input type="text" name="truckLoad" datatype="*"
											class="am-form-field" placeholder="请输入货车载重"> <span
											class="am-input-group-label">吨</span>
									</div>
								</div>
							</div>

						</div>
						<footer class="am-panel-footer">
							<div class="am-g">
								<label class="am-u-sm-3 am-form-label"></label>
								<div class="am-u-sm-9" style="text-align: right;">
									<button id="submitBtn" type="button" class="am-btn am-btn-primary">保存</button>
									<button type="button" class="am-btn am-btn-default"
										onclick="javascript:history.back(-1);">返回</button>
								</div>
							</div>
						</footer>
					</div>
				</form>
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

	<script type="text/javascript" src="${basePath }/js/app/truck/add.js"></script>
</body>
</html>