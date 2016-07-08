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
				<li><a href="${basePath}/goods_owner/list/view">货主信息管理</a></li>
				<li class="am-active">账号管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-g">
				<div class="am-u-sm-12" style="text-align: center;">
					<h2>北京XX商贸公司</h2>
				</div>
			</div>
			<hr class="wm-hr">
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="返回货主信息管理" type="button" class="am-btn am-btn-default" onclick="location.href='${basePath}/goods_owner/list/view';">
							<i class="am-icon-chevron-left"></i> 返回
						</button>
						<button title="新增账号信息" type="button" class="am-btn am-btn-default" onclick="javascript:jumpTo('goods_owner/goods_owner_user/add');">
							<span class="am-icon-plus"></span> 新增
						</button>
					</div>
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
			<table id="showListTable" class="am-table am-table-striped am-table-hover table-main">
				<thead>
					<tr>
						<th>账号</th>
						<th>用户姓名</th>
						<th>用户手机</th>
						<th>状态</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-success">启用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-danger">停用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-danger">停用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-success">启用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-danger">停用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-success">启用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-danger">停用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-danger">停用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>bjxx0000001</td>
						<td>张xx</td>
						<td>15800000000</td>
						<td>
							<span class="am-badge am-badge-danger">停用</span>
						</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="编辑账号信息" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('goods_owner/goods_owner_user/edit')">
										<span class="am-icon-pencil-square-o"></span>编辑
									</button>
									<button title="删除账号信息" class="am-btn am-btn-default am-btn-xs am-text-danger">
										<span class="am-icon-trash-o"></span> 删除
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
			<!-- context end -->
		</div>
	</div>
	
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
	<script type="text/javascript" src="${basePath }/js/app/goods_owner/goods_owner_user/list.js"></script>
</body>
</html>