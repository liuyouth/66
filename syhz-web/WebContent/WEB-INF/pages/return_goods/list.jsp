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
				<li class="am-active">退货管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="新增退货单" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/return_goods/add/view'">
							<span class="am-icon-plus"></span> 新增
						</button>
					</div>
					<!-- search start -->
					<div style="float: right; width: 300px;">
						<div class="am-input-group">
							<input type="text" class="am-form-field" placeholder="请输入关键字">
							<span class="am-input-group-btn">
								<button title="搜索退货单" class="am-btn am-btn-default" type="button" style="margin-left: -1px">
									<i class="am-icon-search"></i> 搜索
								</button>
							</span>
						</div>
					</div>
					<!-- search end -->
				</div>
			</div>
			<!-- tool bar end -->
			<!-- 退货表格开始 -->
			<table id="returnGoodsTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>退货单编号</th>
						<th>收货地址</th>
						<th>收货联系人</th>
						<th>填单时间</th>
						<th>退货类型</th>
						<th>退货状态</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>TH160621123001</td>
						<td>北京市海淀区学院路</td>
						<td>赵五</td>
						<td>2016-06-24</td>
						<td>货主发起</td>
						<td>未提交</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑退货单" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/return_goods/edit/view'">
										<span class="am-icon-pencil-square-o"></span> 编辑
									</button>
									<button title="删除退货单" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>TH160621123002</td>
						<td>北京市海淀区学院路</td>
						<td>赵五</td>
						<td>2016-06-24</td>
						<td>货主发起</td>
						<td>未收货</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="退货单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/return_goods/detail/view'">
										<span class="am-icon-file-o"></span> 详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>TH160621123001</td>
						<td>北京市海淀区学院路</td>
						<td>赵五</td>
						<td>2016-06-24</td>
						<td>货主发起</td>
						<td>已收货</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="退货单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/return_goods/detail/view'">
										<span class="am-icon-file-o"></span> 详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>TH160621123001</td>
						<td>北京市海淀区学院路</td>
						<td>赵五</td>
						<td>2016-06-24</td>
						<td>配送后退货</td>
						<td>已入库</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="退货单详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/return_goods/detail/view'">
										<span class="am-icon-file-o"></span> 详情
									</button>
								</div>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<!-- 退货表格结束 -->
			
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath}/js/app/return_goods/list.js"></script>
</body>
</html>