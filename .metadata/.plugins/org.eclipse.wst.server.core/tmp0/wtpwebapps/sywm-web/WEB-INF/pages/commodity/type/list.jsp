<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

<link rel="stylesheet" href="${basePath }/js/lib/zTree_v3-master/css/zTreeStyle/zTreeStyle.css">

<script type="text/javascript" src="${basePath }/js/lib/zTree_v3-master/js/jquery.ztree.core.min.js"></script>

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
				<li><a href="javascript:void(0);">商品信息管理</a></li>
				<li class="am-active">分类管理</li>
			</ol>
			<hr class="wm-hr">
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<!-- search start -->
					<div style="float: right;width: 380px;">
						<div class="am-input-group">
							<input type="text" id="searchKeywords" class="am-form-field" placeholder="分类名称/分类编号">
							<span class="am-input-group-btn">
								<button class="am-btn am-btn-default" type="button" style="margin-left: -1px" onclick="javascript:search();">
									<i class="am-icon-search"></i> 搜索
								</button>
								<button class="am-btn am-btn-default" type="button" style="margin-left: -1px" onclick="javascript:searchNext();">
									<i class="am-icon-chevron-down"></i>下一条
								</button>
							</span>
						</div>
					</div>
					<!-- search end -->
				</div>
			</div>
			<!-- tool bar end -->
			<!-- context start -->
			<div class="am-g" style="margin-top: 5px;">
				<div class="am-u-sm-5">
					<div class="am-panel am-panel-primary">
						<div class="am-panel-hd">商品分类</div>
						<div class="am-panel-bd" style="height: 550px;overflow-y: auto;">
							<ul id="tree" class="ztree wm-ztree"></ul>
						</div>
					</div>
				</div>
				<div class="am-u-sm-7">
					<form id="typeForm" method="post" class="am-form wm-form am-form-horizontal" style="padding: 0;">
						<div class="am-panel am-panel-primary">
							<div class="am-panel-hd">商品分类管理</div>
							<div class="am-panel-bd">
								<div class="am-form-group">
									<div class="am-u-sm-3">
										<div class="am-btn-group">
											<button title="为当前分类新增子分类信息" type="button" class="am-btn am-btn-default" onclick="javascript:addType();">
												<span class="am-icon-plus"></span> 新增子分类
											</button>
										</div>
									</div>
								</div>
								<div class="am-form-group">
									<label class="am-u-sm-3 am-form-label">
										上级分类
									</label>
									<div class="am-u-sm-9">
										<label class="am-form-label" id="showParentNameLbl"></label>
										<input type="hidden" id="operate" value="add">
										<input type="hidden" id="commodityTypeIdHide" name="commodityTypeId">
										<input type="hidden" id="commodityTypeParentIdHide" name="commodityTypeParentId">
									</div>
								</div>
								<div class="am-form-group">
									<label class="am-u-sm-3 am-form-label">
										分类名称<span class="am-text-danger">&nbsp;*</span>
									</label>
									<div class="am-u-sm-9">
										<input type="text" id="commodityTypeName" name="commodityTypeName" placeholder="请输入分类名称" maxlength="20" datatype="*" ajaxurl="${basePath }/commodityType/unique/commodityTypeName">
									</div>
								</div>
								<div class="am-form-group">
									<label class="am-u-sm-3 am-form-label">
										分类编号<span class="am-text-danger">&nbsp;*</span>
									</label>
									<div class="am-u-sm-9">
										<input type="text" id="commodityTypeCode" name="commodityTypeCode" placeholder="请输入分类编号" maxlength="20" datatype="*" ajaxurl="${basePath }/commodityType/unique/commodityTypeCode">
									</div>
								</div>
								<div class="am-form-group">
									<label class="am-u-sm-3 am-form-label">
										库区
									</label>
									<div class="am-u-sm-9">
										<select data-am-selected id="storageAreasIdSelect" name="storageAreas.storageAreasId">
											<option value="-1">请选择库区</option>
										</select>
									</div>
								</div>
							</div>
							<footer class="am-panel-footer">
								<div class="am-g">
									<label class="am-u-sm-3 am-form-label"></label>
									<div class="am-u-sm-9" style="text-align:right;">
										<button id="submitBtn" type="button" class="am-btn am-btn-primary">保存</button>
										<button id="deleteBtn" type="button" class="am-btn am-btn-default" onclick="javascript:submitDelete();">删除</button>
									</div>
								</div>
							</footer>
						</div>
					</form>
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
	
	<script type="text/javascript" src="${basePath }/js/app/commodity/type/list.js"></script>
</body>
</html>