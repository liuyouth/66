<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

<style type="text/css">
.am-ucheck-icons {
	font-size: 24px;
}
</style>

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
				<li><a href="${basePath}/deliver_order/list/view">发货订单管理</a></li>
				<li class="am-active">编辑发货订单</li>
			</ol>
			<hr class="wm-hr">
			<!-- 编辑面板开始 -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">编辑发货订单</div>
					<div class="am-panel-bd">
						<form class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									订单编号
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										FH20160101001001
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货方名称<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<div class="am-input-group">
										<input type="text" readonly="readonly" value="大众粮油店">
										<span class="am-input-group-btn">
											<button class="am-btn am-btn-default" type="button" onclick="javascript:openRecipientChoosingModal();">使用已有收货人</button>
											<button class="am-btn am-btn-default" type="button" onclick="javascript:window.location.href='${basePath}/recipient/add/view'">添加新的收货人</button>
										</span>
									</div>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货地址
								</label>
								<div class="am-u-sm-9">
									<input type="text" readonly="readonly" value="北京市丰台区">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货方联系人
								</label>
								<div class="am-u-sm-9">
									<input type="text" readonly="readonly" value="王五">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收货方联系电话
								</label>
								<div class="am-u-sm-9">
									<input type="text" readonly="readonly" value="13800138000">
								</div>
							</div>
					 		<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									发货方式<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<label class="am-radio-inline">
										<input type="radio" name="deliverMode" checked="checked"> 配送
									</label>
									<label class="am-radio-inline">
										<input type="radio" name="deliverMode"> 自提
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收款方式<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<label class="am-radio-inline">
										<input type="radio" name="payment" checked="checked"> 委托收款
									</label>
									<label class="am-radio-inline">
										<input type="radio" name="payment"> 签单收货
									</label>
									<label class="am-radio-inline">
										<input type="radio" name="payment"> 欠款
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									订单类型<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<label class="am-radio-inline">
										<input type="radio" name="orderType" checked="checked"> 正常
									</label>
									<label class="am-radio-inline">
										<input type="radio" name="orderType"> 紧急
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									预计到达日期<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入预计到达日期" class="wm-Wdate" onFocus="WdatePicker({skin:'whyGreen'})" readonly="readonly" value="2016-06-21">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									要求到货日期<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入要求到货日期" class="wm-Wdate" onFocus="WdatePicker({skin:'whyGreen'})" readonly="readonly" value="2016-06-21">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									业务员姓名<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入业务员姓名" value="赵六">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									业务员联系电话<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="业务员联系电话" value="13800138000">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									二次包装
								</label>
								<div class="am-u-sm-9">
									<label class="am-checkbox">
										<input type="checkbox" onclick="switchRepacking(this);" checked="checked">
									</label>
								</div>
							</div>
							<div class="am-form-group" id="repackingExplainContainer">
								<label class="am-u-sm-3 am-form-label">
									二次包装说明
								</label>
								<div class="am-u-sm-9">
									<textarea placeholder="请输入二次包装说明">分装成小箱</textarea>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									备注
								</label>
								<div class="am-u-sm-9">
									<textarea placeholder="请输入备注"></textarea>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									填单时间
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										2016-06-21
									</label>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									订单状态
								</label>
								<div class="am-u-sm-9">
									<label class="am-form-label">
										未提交
									</label>
								</div>
							</div>
						</form>
					</div>
					<footer class="am-panel-footer">
						<div class="am-text-right">
							<button type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/deliver_order/list/view';">返回</button>
							<button type="button" class="am-btn am-btn-primary" onclick="save();">保存</button>
							<button type="button" class="am-btn am-btn-primary" onclick="gotoCommodity();">查看订单商品</button>
						</div>
					</footer>
				</div>
			</div>
			<!-- 编辑面板结束 -->
		</div>
	</div>
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp" %>
	<!-- modal end -->
	
	<script type="text/javascript" src="${basePath}/js/app/deliver_order/edit.js"></script>
</body>