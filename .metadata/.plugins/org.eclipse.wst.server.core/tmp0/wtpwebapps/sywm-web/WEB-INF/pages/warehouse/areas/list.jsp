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
				<li><a href="javascript:void(0);">仓库信息管理</a></li>
				<li class="am-active">库区管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="新增库区" type="button" class="am-btn am-btn-default" onclick="window.location.href='${basePath}/warehouse/areas/add/view'">
							<span class="am-icon-plus"></span> 新增
						</button>
						<button title="切换到仓库顶视图" type="button" class="am-btn am-btn-default" onclick="window.location.href='${basePath}/warehouse/topView/view'">
							<span class="am-icon-home"></span> 仓库顶视图
						</button>
					</div>
					<!-- search start -->
					<div style="float: right;width: 300px;">
						<div class="am-input-group">
							<input id="searchParam" type="text" class="am-form-field" placeholder="库区名称">
							<span class="am-input-group-btn">
								<button class="am-btn am-btn-default" type="button"
									style="margin-left: -1px" onclick="javascript:search();">
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
						<th>库区名称</th>
						<th>面积(㎡)</th>
						<th>标示色</th>
						<th>状态</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody id="dataList">
				</tbody>
			</table>
			<!-- 分页开始 -->
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
	
	<script type="text/javascript" src="${basePath}/js/app/warehouse/areas/list.js"></script>
	<script type="text/javascript">
		var basePath = "${basePath}";
	</script>
</body>
</html>