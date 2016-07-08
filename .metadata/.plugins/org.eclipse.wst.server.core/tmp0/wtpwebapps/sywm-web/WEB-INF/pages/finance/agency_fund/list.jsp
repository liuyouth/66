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
				<li class="am-active">代收款管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<!-- search start -->
					<div style="float: right;width: 300px;">
						<div class="am-input-group">
							<input type="text" class="am-form-field" placeholder="请输入关键字">
							<span class="am-input-group-btn">
								<button class="am-btn am-btn-default" type="button"
									style="margin-left: -1px">
									<i class="am-icon-search"></i> 搜索
								</button>
							</span>
						</div>
					</div>
					<!-- search end -->
				</div>
			</div>
			<!-- tool bar end -->
			<!-- table start -->
			<table id="showListTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>运单号</th>
						<th>承运人</th>
						<th>申请人交款人</th>
						<th>应交款(元)</th>
						<th>实收款(元)</th>
						<th>状态</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>YD201606230023</td>
						<td>张三</td>
						<td>张三</td>
						<td>1500</td>
						<td></td>
						<td>已申请</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="收款" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:showReceivablesModal();">
										<span class="am-icon-credit-card-alt"></span> 收款
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>YD201606230023</td>
						<td>张三</td>
						<td>张三</td>
						<td>1500</td>
						<td></td>
						<td>已申请</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="收款" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:showReceivablesModal();">
										<span class="am-icon-credit-card-alt"></span> 收款
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>YD201606230023</td>
						<td>张三</td>
						<td>张三</td>
						<td>1500</td>
						<td></td>
						<td>已申请</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="收款" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:showReceivablesModal();">
										<span class="am-icon-credit-card-alt"></span> 收款
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>YD201606230023</td>
						<td>张三</td>
						<td>张三</td>
						<td>1500</td>
						<td></td>
						<td>已申请</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="收款" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:showReceivablesModal();">
										<span class="am-icon-credit-card-alt"></span> 收款
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>YD201606230023</td>
						<td>张三</td>
						<td>张三</td>
						<td>1500</td>
						<td>1500</td>
						<td>已收款</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="收款" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:showReceivablesModal();">
										<span class="am-icon-credit-card-alt"></span> 收款
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>YD201606230023</td>
						<td>张三</td>
						<td>张三</td>
						<td>1500</td>
						<td></td>
						<td>已申请</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="收款" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:showReceivablesModal();">
										<span class="am-icon-credit-card-alt"></span> 收款
									</button>
								</div>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<!-- 分页开始 -->
			<div class="am-text-center" style="float: right;">
				<ul class="am-pagination">
					<li class="am-disabled"><a href="#">«</a></li>
					<li class="am-active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">»</a></li>
				</ul>
			</div>
			<!-- 分页结束 -->
			<!-- table end -->
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<div class="am-modal am-modal-prompt" tabindex="-1" id="receivablesModal">
		<div class="am-modal-dialog">
			<div class="am-modal-hd">确认收款</div>
			<div class="am-modal-bd wm-modal-bd">
				<form id="receivablesForm" class="am-form am-form-horizontal">
					<div class="am-form-group">
						<label class="am-u-sm-3 am-form-label">
							应收款
						</label>
						<div class="am-u-sm-9">
							<label class="am-form-label">
								1500元
							</label>
						</div>
					</div>
					<div class="am-form-group">
						<label class="am-u-sm-3 am-form-label">
							实收款<span class="am-text-danger">&nbsp;*</span>
						</label>
						<div class="am-u-sm-9">
							<div class="am-input-group">
								<input type="text" class="am-form-field">
								<span class="am-input-group-label">元</span>
							</div>
						</div>
					</div>
				</form>
			</div>
			<div class="am-modal-footer">
				<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
				<span class="wm-modal-btn" onclick="javascript:void(0);">确定</span>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="${basePath }/js/app/finance/agency_fund/list.js"></script>
</body>
</html>