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
				<li><a href="${basePath}/goods_owner/list/view">货主信息管理</a></li>
				<li><a href="${basePath}/goods_owner/goods_owner_user/list/view">账号管理</a></li>
				<li class="am-active">编辑账号</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">编辑账号</div>
					<div class="am-panel-bd">
						<form id="editForm" class="am-form wm-form am-form-horizontal">
							<fieldset style="text-align: center;">
								<legend>北京XX商贸公司</legend>
							</fieldset>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">账号</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">bjxx0000001</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">用户姓名</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入货主用户姓名" value="张xx">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">用户手机</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入货主用户手机" value="15800000000">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">启停状态</label>
								<div class="am-u-sm-9">
									<div class="am-form-group">
										<label class="am-radio-inline">
											<input type="radio" value="1" name="is_enable" checked="checked">启用
										</label>
										<label class="am-radio-inline">
											<input type="radio" value="0" name="is_enable">停用
										</label>
									</div>
								</div>
							</div>
						</form>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align:right;">
								<button type="button" class="am-btn am-btn-primary">保存</button>
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
	
	<script type="text/javascript" src="${basePath }/js/app/goods_owner/goods_owner_user/edit.js"></script>
</body>
</html>