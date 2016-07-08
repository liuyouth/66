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
				<li><a href="javascript:void(0);">系统管理</a></li>
				<li><a href="${basePath}/user_auth/userGroupList/view">权限管理</a></li>
				<li class="am-active">编辑用户组</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
			<form id="typeForm" class="am-form wm-form am-form-horizontal">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">编辑用户组</div>
						<div class="am-panel-bd">
							
								<div class="am-form-group">
									<label class="am-u-sm-3 am-form-label">用户组名</label>
									<div class="am-u-sm-9">
										<input type="hidden" name="userGroupId" >
										<label class="am-form-label" data-name-wm="userGroupName"></label>
										
									</div>
								</div>
								<div class="am-form-group">
									<label class="am-u-sm-3 am-form-label">备注</label>
									<div class="am-u-sm-9">
										<textarea rows="6" cols="20" name="userGroupRemark"></textarea>
									</div>
								</div>								
							</form>
						</div>
						<footer class="am-panel-footer">
							<div class="am-g">
								<label class="am-u-sm-3 am-form-label"></label>
								<div class="am-u-sm-9" style="text-align:right;">
									<button type="button" id="submitBtn" class="am-btn am-btn-primary">保存</button>
									<button type="button" class="am-btn am-btn-default" onclick="javascript:history.back(-1);">返回</button>
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
	
	<script type="text/javascript" src="${basePath }/js/app/user_auth/editUserGroup.js">
	</script>
	<script type="text/javascript">
	var userGroupId = "${param.userGroupId}";
    </script>
</body>
</html>