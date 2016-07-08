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
				<li><a href="javascript:void(0);">财务管理</a></li>
				<li><a href="${basePath}/finance/payment/list/view">交款管理</a></li>
				<li class="am-active">编辑交款信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">编辑交款信息</div>
					<div class="am-panel-bd">
						<form id="editForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									收据编号<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入收据编号">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									货主<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<select data-am-selected>
										<option></option>
										<option>李货主</option>
										<option>王货主</option>
										<option>刘货主</option>
										<option>马货主</option>
										<option>张货主</option>
									</select>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									货主收款人<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入货主收款人">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									交款金额<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<div class="am-input-group">
										<input type="text" placeholder="请输入交款金额">
				  						<span class="am-input-group-label">元</span>
									</div>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									交款人<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入交款人">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">
									交款时间<span class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" class="am-form-field wm-Wdate" onFocus="WdatePicker({maxDate:'#F{\'%y-%M-%d\'}',dateFmt:'yyyy-MM-dd',skin:'whyGreen'})" readonly="readonly" placeholder="请选择交款时间">
								</div>
							</div>
						</form>
						<div class="am-g">
							<div class="am-u-sm-12" style="text-align: left;">
								<div class="wm-inner-table-title">
									<label class="wm-inner-table-title-label">交款订单详情信息</label>
									<button title="新增交款订单" type="button" class="am-btn am-btn-default" onclick="openCommodityChoosingModal();">
										<span class="am-icon-plus"></span> 新增
									</button>
								</div>
							</div>
						</div>
						<table class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th>订单编号</th>
									<th>签收人</th>
									<th>签收时间</th>
									<th>代收款金额</th>
									<th style="text-align: center;">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>DD20160606001</td>
									<td>张三</td>
									<td>2016-06-20</td>
									<td>1500</td>
									<td>
										<div class="am-u-sm-12" style="text-align: center;">
											<div class="am-btn-group am-btn-group-xs">
												<button title="删除交款订单" class="am-btn am-btn-default am-btn-xs am-text-danger">
													<span class="am-icon-trash-o"></span> 删除
												</button>
											</div>
										</div>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align:right;">
								<button type="button" class="am-btn am-btn-primary">保存</button>
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
	
	<script type="text/javascript" src="${basePath }/js/app/finance/payment/edit.js"></script>
</body>
</html>