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
				<li><a href="${basePath}/warehouse/areas/list/view">库区管理</a></li>
				<li class="am-active">新增库区</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<form id="addForm" class="am-form wm-form am-form-horizontal"
					method="post">
					<div class="am-panel am-panel-primary wm-panel">
						<div class="am-panel-hd">新增库区</div>
						<div class="am-panel-bd">
							<input type="hidden" name="warehouse.warehouseId" value="1">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 库区名称<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" id="areasName"
										name="areasName" placeholder="请输入库区名称" datatype="*1-50" ajaxurl="${basePath }/storageAreas/unique">
								</div>
							</div>
							<!-- <div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 收费金额 </label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入收费金额" name="chargeAmount"
										datatype="/^(([1-9]\d{0,9})|0)(\.\d{1,2})?$/">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 计费单位 </label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入计费单位" name="billingUnit"
										datatype="n0-1">
								</div>
							</div> -->
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 面积<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<div class="am-input-group">
									<input type="text" placeholder="请输入所占面积" name="areasArea"
										datatype="/^([1-9]\d{0,10}|0)(\.\d{1,3})?$/"> <span
										class="am-input-group-label">㎡</span>
									</div>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 库区标示色<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" class="simple_color_kitchen_sink"
										name="areasColor" id="areasColor" value="#993300">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">启停状态</label>
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
									<button type="button" class="am-btn am-btn-primary" id="addBtn">保存</button>
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
		src="${basePath }/js/app/warehouse/areas/add.js"></script>
</body>
</html>