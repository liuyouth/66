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
				<li><a href="${basePath}/warehouse/racks/list/view">货架管理</a></li>
				<li class="am-active">货架详细信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<form id="editForm" class="am-form wm-form am-form-horizontal"
					method="post">
					<div class="am-panel am-panel-primary wm-panel">
						<div class="am-panel-hd">编辑货架</div>
						<div class="am-panel-bd">
							<input type="hidden" name="storageRacksId">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货架编码: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="storageRacksCode"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货架类型: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="storageRacksType"
										id="storageRacksType"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 包含货位数量: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="goodsLocatorCount"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货架长度: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="storageRacksLength"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货架宽度: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="storageRackswidth"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货架高度: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="storageRacksheight"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 所占面积: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="storageRacksArea"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">启用标示</label>
								<div class="am-u-sm-9">
									<div class="am-form-group">
										<label class="am-radio-inline"> <input type="radio"
											value="true" name="isEnable" checked="checked">启用
										</label> <label class="am-radio-inline"> <input type="radio"
											value="false" name="isEnable">停用
										</label>
									</div>
								</div>
							</div>
						</div>
						<footer class="am-panel-footer">
							<div class="am-g">
								<label class="am-u-sm-3 am-form-label"></label>
								<div class="am-u-sm-9" style="text-align: right;">
									<button type="button" class="am-btn am-btn-primary"
										id="updateBtn">保存</button>
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
		src="${basePath }/js/app/warehouse/racks/edit.js"></script>
	<script type="text/javascript">
	var basePath = "${basePath}";
	var storageRacksId = "${param.storageRacksId}";
    </script>
</body>
</html>