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
				<li><a href="${basePath}/goods_return/list/view">退货管理</a></li>
				<li class="am-active">新增退货单</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">新增退货单</div>
					<div class="am-panel-bd">
						<form id="addForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">退货单号<span class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入退货单号 ">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">原出货单号<span class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input id="time" type="text" placeholder="请输入原出货单号">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">退货日期<span class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input type="text" class="wm-Wdate" onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',skin:'whyGreen'})">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">业务员<span class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input id="time" type="text" placeholder="请输入业务员姓名">
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">退货商品信息</label>
									<button title="新建退货包装信息" type="button" class="am-btn am-btn-default" onclick="javascript:void(0)">
										<span class="am-icon-plus"></span> 添加退货商品信息
									</button>
								</div>
							</div>
						</div>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align: right;">
								<button type="button" class="am-btn am-btn-primary">提交</button>
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

	<script type="text/javascript"
		src="${basePath }/js/app/goods_return/add.js"></script>
</body>
</html>