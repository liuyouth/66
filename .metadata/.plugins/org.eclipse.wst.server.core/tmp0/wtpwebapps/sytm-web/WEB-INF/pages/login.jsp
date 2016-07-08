<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

</head>
<body class="am-container wm-container">
	<div class="am-g" style="margin-top: 180px;">
		<div class="am-u-sm-6 am-u-sm-centered" style="text-align:center;">
			<h1>仓储管理系统-司机端</h1>
			<h2>系统登录</h2>
			<hr>
		</div>
	</div>
	<div class="am-g">
		<div class="am-u-sm-6 am-u-sm-centered">
			<form class="am-form">
				<fieldset>
					<div class="am-form-group">
						<div class="am-input-group">
							<span class="am-input-group-label">
								<i class="am-icon-user am-icon-fw"></i>
							</span>
							<input type="text" class="am-form-field" placeholder="请输入账号">
						</div>
					</div>
					<div class="am-form-group">
						<div class="am-input-group">
							<span class="am-input-group-label">
								<i class="am-icon-lock am-icon-fw"></i>
							</span>
							<input type="text" class="am-form-field" placeholder="请输入密码">
						</div>
					</div>
					<div class="am-checkbox">
						<label>
							<input type="checkbox">记住密码
						</label>
					</div>
					<div class="am-form-group">
						<button type="button" class="am-btn am-btn-primary am-btn-block" onclick="javascript:doLogin();">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<script type="text/javascript" src="${basePath }/js/app/login.js"></script>
</body>
</html>