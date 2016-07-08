<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

<script type="text/javascript"
	src="${basePath }/js/lib/jquery-simple-color-1.2.1/jquery.simple-color.js"></script>

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
				<li><a href="${basePath}/warehouse/locator/list/view">货位管理</a></li>
				<li class="am-active">编辑货位信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<form id="editForm" class="am-form wm-form am-form-horizontal"
					method="post">
					<div class="am-panel am-panel-primary wm-panel">
						<div class="am-panel-hd">编辑货架</div>
						<div class="am-panel-bd">
							<input type="hidden" name="goodsLocatorId">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货位编码: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="locatorCode"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货位类别: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="locatorType"
										id="locatorType"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 最大承重: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="maxStorageWeight"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 最大存放数量: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="maxStorageQuantity"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货位长度: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="locatorLength"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货位宽度: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="locatorwidth"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 货位高度: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label" data-name-wm="locatorheight"></label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 含托盘个数: </label>
								<div class="am-u-sm-9 am-input-group">
									<input type="text" name="palletsContainingCount">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 当前存放数量: </label>
								<div class="am-u-sm-9">
									<label class="am-form-label"
										data-name-wm="currentStorageQuantity"></label>
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
		src="${basePath }/js/app/warehouse/locator/edit.js"></script>
	<script type="text/javascript">
	var basePath = "${basePath}";
	var goodsLocatorId = "${param.goodsLocatorId}";
    </script>

</body>
</html>