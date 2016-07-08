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
				<li class="am-active">库存管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button type="button" class="am-btn am-btn-default" onclick="window.location.href='${basePath}/stock/addByGoodsOwner/view'">
							<span class="am-icon-plus"></span> 新增(按货主盘货)
						</button>
						<button type="button" class="am-btn am-btn-default" onclick="window.location.href='${basePath}/stock/addByGoods/view'">
							<span class="am-icon-plus"></span> 新增(按商品盘货)
						</button>
						<button type="button" class="am-btn am-btn-default" onclick="window.location.href='${basePath}/stock/addByGoodsLocator/view'">
							<span class="am-icon-plus"></span> 新增(按库区盘货)
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
						<th>盘库单号</th>
						<th>盘库日期</th>
						<th>盘库负责人</th>
						<th>盘库状态</th>
						<th>有无差异</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>未执行</td>
						<td></td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>执行中</td>
						<td></td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>已完成</td>
						<td>无</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>已完成</td>
						<td>无</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>已完成</td>
						<td>无</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>已完成</td>
						<td>无</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>已完成</td>
						<td>无</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>已完成</td>
						<td>无</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>已完成</td>
						<td>无</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>PK001</td>
						<td>2016-01-01</td>
						<td>赵五</td>
						<td>已完成</td>
						<td>无</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="查看盘库结果" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="window.location.href='${basePath}/stock/detail/view'">
										<span class="am-icon-file"></span>查看结果
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

	<script type="text/javascript" src="${basePath }/js/app/stock/list.js"></script>
</body>
</html>