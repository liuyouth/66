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
				<li><a href="${basePath}/goods_owner/list/view">货主信息管理</a></li>
				<li class="am-active">新增货主信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<form id="addForm" class="am-form wm-form am-form-horizontal">
					<div class="am-panel am-panel-primary wm-panel">
						<div class="am-panel-hd">新增货主信息</div>
						<div class="am-panel-bd">

							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货主公司名称<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input name="goodsOwnerName" datatype="*" type="text" ajaxurl="${basePath}/goods_owner/unique" placeholder="请输入货主公司名称">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">联系地址</label>
								<div class="am-u-sm-9">
									<input name="goodsOwnerAddress" ignore="ignore" datatype="*" type="text"
										placeholder="请输入联系地址">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">联系电话</label>
								<div class="am-u-sm-9">
									<input name="goodsOwnerTel" ignore="ignore" datatype="*" type="text" placeholder="请输入联系电话">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">联系人</label>
								<div class="am-u-sm-9">
									<input name="goodsOwnerContact" ignore="ignore" datatype="*" type="text"
										placeholder="请输入联系人">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">联系人手机</label>
								<div class="am-u-sm-9">
									<input name="goodsOwnerContactMobile" ignore="ignore" datatype="m" type="text"
										placeholder="请输入联系人手机">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">启停状态</label>
								<div class="am-u-sm-9">
									<div class="am-form-group">
										<label class="am-radio-inline"> <input type="radio"
											value="1" name="isEnable" checked="checked">启用
										</label> <label class="am-radio-inline"> <input type="radio"
											value="0" name="isEnable">停用
										</label>
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

	<script type="text/javascript"
		src="${basePath }/js/app/goods_owner/add.js"></script>
</body>
</html>