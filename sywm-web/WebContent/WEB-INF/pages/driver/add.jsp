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
				<li><a href="${basePath}/driver/list/view">司机管理</a></li>
				<li class="am-active">新增司机信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<form id="addForm" class="am-form wm-form am-form-horizontal" method="post">
					<div class="am-panel am-panel-primary wm-panel">
						<div class="am-panel-hd">新增司机信息</div>
						<div class="am-panel-bd">

							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">登录名<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input name="loginName" type="text" datatype="/^[a-zA-Z]{1}([a-zA-Z0-9]){5,19}$/" ajaxurl="${basePath}/driver/unique"
									 maxlength="50" placeholder="请输入登录名">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">姓名<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input name="driverName" type="text" datatype="*" placeholder="请输入司机姓名">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">手机</label>
								<div class="am-u-sm-9">
									<input name="driverMobile" ignore="ignore" datatype="m" type="text" placeholder="请输入司机手机">
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

	<script type="text/javascript" src="${basePath }/js/app/driver/add.js"></script>
</body>
</html>