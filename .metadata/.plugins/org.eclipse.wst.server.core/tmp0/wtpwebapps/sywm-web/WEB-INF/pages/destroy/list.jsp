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
				<li class="am-active">销毁管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="新增销毁信息" type="button" class="am-btn am-btn-default" onclick="javascript:jumpTo('destroy/add')">
							<span class="am-icon-plus"></span> 新增
						</button>
					</div>
					<!-- search start -->
					<div style="float: right; width: 300px;">
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
			<table id="showListTable"
				class="am-table am-table-striped am-table-hover table-main">
				<thead>
					<tr>
						<th>销毁信息编号</th>
						<th>填单时间</th>
						<th>销毁信息状态</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button  title="删除信息详情" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情"
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>SH160622012001</td>
						<td>2016-06-22 08:19:22</td>
						<td>确认</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑销毁信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('destroy/edit')">
										<span class="am-icon-edit"></span>编辑
									</button>
									<button title="销毁信息详情" 
										class="am-btn am-btn-default am-btn-xs am-text-secondary"
										onclick="window.location.href='${basePath}/destroy/detail/view'">
										<span class="am-icon-file-o"></span>详情
									</button>
									<button title="删除信息详情"  class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
			<!-- table end -->
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
			<!-- context end -->
		</div>
	</div>

	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->

	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->

	<script type="text/javascript" src="${basePath }/js/app/destroy/list.js"></script>
</body>
</html>