<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

<style type="text/css">
.wm-list{
	margin: 0;
}
.wm-list-item{
	border: none !important;
	padding: 0 0.2rem !important;
}
.wm-list-title{
	font-size: 2rem;
}
.wm-list-num{
	position: absolute;
	top: 24px;
	right: 38px;
	z-index: 9;
}
.wm-list-soon{
	position: absolute;
	top: 51px;
	right: 38px;
	z-index: 9;
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
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-g">
				<div class="am-u-sm-4">
					<div class="am-panel am-panel-default">
						<div class="am-panel-bd">
							<ul class="am-list wm-list am-list-static">
								<li class="wm-list-item wm-list-title">
									金龙鱼大米
								</li>
								<li class="wm-list-item">JLY10023</li>
								<li class="wm-list-item">PH20160622001</li>
								<li class="wm-list-item">50kg/袋</li>
							</ul>
						</div>
						<div class="am-badge am-badge-primary wm-list-num">
							100袋
						</div>
						<div class="am-badge am-badge-danger wm-list-soon">
							2016-09-01临期
						</div>
					</div>					
				</div>
				<div class="am-u-sm-4">
					<div class="am-panel am-panel-default">
						<div class="am-panel-bd">
							<ul class="am-list wm-list am-list-static">
								<li class="wm-list-item wm-list-title">
									金龙鱼大米
								</li>
								<li class="wm-list-item">JLY10023</li>
								<li class="wm-list-item">PH20160622001</li>
								<li class="wm-list-item">50kg/袋</li>
							</ul>
						</div>
						<div class="am-badge am-badge-primary wm-list-num">
							100袋
						</div>
						<div class="am-badge am-badge-danger wm-list-soon">
							2016-09-01临期
						</div>
					</div>					
				</div>
				<div class="am-u-sm-4">
					<div class="am-panel am-panel-default">
						<div class="am-panel-bd">
							<ul class="am-list wm-list am-list-static">
								<li class="wm-list-item wm-list-title">
									金龙鱼大米
								</li>
								<li class="wm-list-item">JLY10023</li>
								<li class="wm-list-item">PH20160622001</li>
								<li class="wm-list-item">50kg/袋</li>
							</ul>
						</div>
						<div class="am-badge am-badge-primary wm-list-num">
							100袋
						</div>
						<div class="am-badge am-badge-danger wm-list-soon">
							2016-09-01临期
						</div>
					</div>					
				</div>
				<div class="am-u-sm-4">
					<div class="am-panel am-panel-default">
						<div class="am-panel-bd">
							<ul class="am-list wm-list am-list-static">
								<li class="wm-list-item wm-list-title">
									金龙鱼大米
								</li>
								<li class="wm-list-item">JLY10023</li>
								<li class="wm-list-item">PH20160622001</li>
								<li class="wm-list-item">50kg/袋</li>
							</ul>
						</div>
						<div class="am-badge am-badge-primary wm-list-num">
							10000袋
						</div>
						<div class="am-badge am-badge-danger wm-list-soon">
							2016-09-01临期
						</div>
					</div>					
				</div>
				<div class="am-u-sm-4 am-u-end">
					<div class="am-panel am-panel-default">
						<div class="am-panel-bd">
							<ul class="am-list wm-list am-list-static">
								<li class="wm-list-item wm-list-title">
									金龙鱼大米
								</li>
								<li class="wm-list-item">JLY10023</li>
								<li class="wm-list-item">PH20160622001</li>
								<li class="wm-list-item">50kg/袋</li>
							</ul>
						</div>
						<div class="am-badge am-badge-primary wm-list-num">
							100袋
						</div>
						<div class="am-badge am-badge-danger wm-list-soon">
							2016-09-01临期
						</div>
					</div>					
				</div>
			</div>
			<!-- context end -->
		</div>
	</div>
	
	<div class="wm-toTop">
		<a title="返回顶部" href="#hearderAnchor">
			<i class="am-icon-arrow-up"></i>
		</a>
	</div>
	
	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->
	
</body>
</html>