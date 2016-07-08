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
				<li class="am-active">到货计划管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="新增到货计划" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/arrival_plan/add/view'">
							<span class="am-icon-plus"></span> 新增
						</button>
					</div>
					<!-- search start -->
					<div style="float: right; width: 300px;">
						<div class="am-input-group">
							<input type="text" class="am-form-field" placeholder="请输入关键字">
							<span class="am-input-group-btn">
								<button title="搜索到货计划" class="am-btn am-btn-default" type="button" style="margin-left: -1px">
									<i class="am-icon-search"></i> 搜索
								</button>
							</span>
						</div>
					</div>
					<!-- search end -->
				</div>
			</div>
			<!-- tool bar end -->
			<!-- 到货计划表格开始 -->
			<table id="arrivalPlanTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>到货计划编号</th>
						<th>发货时间</th>
						<th>预计到货时间</th>
						<th>直送</th>
						<th>填单时间</th>
						<th>到货状态</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>DH160621123001</td>
						<td>2016-06-21</td>
						<td>2016-06-21</td>
						<td>是</td>
						<td>2016-06-21</td>
						<td>未提交</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑到货计划" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/arrival_plan/edit/view'">
										<span class="am-icon-pencil-square-o"></span> 编辑
									</button>
									<button title="删除到货计划" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>DH160621123002</td>
						<td>2016-06-21</td>
						<td>2016-06-21</td>
						<td>&nbsp;</td>
						<td>2016-06-21</td>
						<td>未收货</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="到货计划详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/arrival_plan/detail/view'">
										<span class="am-icon-file-o"></span> 详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>DH160621123003</td>
						<td>2016-06-21</td>
						<td>2016-06-21</td>
						<td>&nbsp;</td>
						<td>2016-06-21</td>
						<td>已收货</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="到货计划详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/arrival_plan/detail/view'">
										<span class="am-icon-file-o"></span> 详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>DH160621123004</td>
						<td>2016-06-21</td>
						<td>2016-06-21</td>
						<td>&nbsp;</td>
						<td>2016-06-21</td>
						<td>已入库</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="到货计划详情信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="location.href='${basePath}/arrival_plan/detail/view'">
										<span class="am-icon-file-o"></span> 详情
									</button>
								</div>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<!-- 到货计划表格结束 -->
			
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath}/js/app/arrival_plan/list.js"></script>
</body>
</html>