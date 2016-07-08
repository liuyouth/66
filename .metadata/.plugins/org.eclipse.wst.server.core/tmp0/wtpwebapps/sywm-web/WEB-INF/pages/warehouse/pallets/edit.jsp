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
				<li><a href="javascript:void(0);">仓库信息管理</a></li>
				<li><a href="${basePath}/warehouse/pallets/list/view">托盘管理</a></li>
				<li class="am-active">编辑托盘信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">编辑托盘信息</div>
					<div class="am-panel-bd">
						<form id="editForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									托盘编号
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">tp00000001234</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">托盘生产商编号</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">zh</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">托盘生产商名称</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">中华</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">托盘种类</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">A类</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">生产年月</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">201601</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">所在货位</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">辽宁-大连</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">当前托盘货物属性</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">无货</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">启停状态<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<div class="am-form-group">
										<label class="am-radio-inline"> <input type="radio"
											value="1" checked="checked" name="is_enable">启用
										</label> <label class="am-radio-inline"> <input type="radio"
											value="0" name="is_enable">停用
										</label>
									</div>
								</div>
							</div>
						</form>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align: right;">
								<button type="button" class="am-btn am-btn-primary">保存</button>
								<button type="button" class="am-btn am-btn-default"
									onclick="javascript:history.back(-1);">返回</button>
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

	<script type="text/javascript"
		src="${basePath }/js/app/warehouse/pallets/edit.js"></script>
</body>
</html>