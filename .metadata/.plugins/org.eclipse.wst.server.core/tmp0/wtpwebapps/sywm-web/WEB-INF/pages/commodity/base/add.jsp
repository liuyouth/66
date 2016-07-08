<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/pages/inc/common.jspf"%>

<link rel="stylesheet"
	href="${basePath }/js/lib/zTree_v3-master/css/zTreeStyle/zTreeStyle.css">

<script type="text/javascript"
	src="${basePath }/js/lib/zTree_v3-master/js/jquery.ztree.core.min.js"></script>

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
				<li><a href="${basePath}/commodity/base/list/view">基础信息管理</a></li>
				<li class="am-active">新增商品信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<form id="addForm" class="am-form wm-form am-form-horizontal">
					<div class="am-panel am-panel-primary wm-panel">
						<div class="am-panel-hd">新增商品信息</div>

						<div class="am-panel-bd">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 商品名称<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" name="commodityName" maxlength="50"
										datatype="*" placeholder="请输入商品名称">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 商品分类<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<div class="am-input-group">
										<input type="hidden" name="commodityType.commodityTypeId" >
										<input type="hidden" name="commodityTypeCode" >
										<input type="text" class="am-form-field" id="commoditytypeName" name="commodityTypeName" datatype="*" placeholder="请选择商品分类"
											readonly="readonly"> <span class="am-input-group-btn">
											<button class="am-btn am-btn-default" type="button"
												onclick="javascript:showTypeModal();">
												<i class="am-icon-list-alt"></i>
											</button>
										</span>
									</div>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 商品品牌<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<select data-am-selected id="brandsIdSelect" datatype="*"
										name="brands.brandsId">
										<!-- <option  value="-1" >请选择商品品牌</option> -->
									</select>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 单品重量
								</label>
								<div class="am-u-sm-9">
									<div class="am-input-group">
										<input type="text" name="commoditySingleWeight" ignore="ignore" maxlength="14"
										datatype="/^([1-9]\d{0,9}|0)(\.\d{1,3})?$/"
										class="am-form-field" placeholder="请输入单品重量"> <span
										class="am-input-group-label">kg</span>
									</div>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 商品条码<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" name="commodityBarcode" maxlength="20"
										datatype="*" ajaxurl="${basePath}/commodityBase/unique" placeholder="请输入商品条码">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 商品规格型号<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<input type="text" name="commodityStandard" maxlength="50"
										datatype="*" placeholder="请输入商品规格型号">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 产地 </label>
								<div class="am-u-sm-9">
									<input type="text" name="commodityOrigin" maxlength="20"
										placeholder="请输入产地">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 有效期<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<div class="am-input-group">
										<input type="text" name="commodityValidityPeriod" datatype="n"
											maxlength="10" class="am-form-field" placeholder="请输入有效期">
										<span class="am-input-group-label">天</span>
									</div>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 包装单位<span
									class="am-text-danger">&nbsp;*</span>
								</label>
								<div class="am-u-sm-9">
									<select data-am-selected datatype="*" name="commoditySinglePackingUnit" >
										<option value="1">瓶</option>
										<option value="2">袋</option>
										<option value="3">盒</option>
										<option value="4">包</option>
										<option value="5">桶</option>
									</select>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 存放库区 </label>
								<div class="am-u-sm-9">
									<select data-am-selected id="storageAreasIdSelect"
										name="storageAreas.storageAreasId">
									</select>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label"> 启停状态 </label>
								<div class="am-u-sm-9">
									<div class="am-form-group">
										<label class="am-radio-inline"> <input type="radio"
											value="0" name="isDelete" checked="checked">启用
										</label> <label class="am-radio-inline"> <input type="radio"
											value="1" name="isDelete">停用
										</label>
									</div>
								</div>
							</div>

						</div>
						<footer class="am-panel-footer">
							<div class="am-g">
								<label class="am-u-sm-3 am-form-label"></label>
								<div class="am-u-sm-9" style="text-align: right;">
									<button type="button" id="submitBtn"
										class="am-btn am-btn-primary">保存</button>
									<button type="button" class="am-btn am-btn-default"
										onclick="javascript:history.back(-1);">返回</button>
								</div>
							</div>
						</footer>
					</div>
				</form>
			</div>
		</div>
		<!-- context end -->
	</div>

	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->

	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->

	<!-- type modal start -->
	<div class="am-modal am-modal-prompt" tabindex="-1"
		id="typeSelectModal">
		<div class="am-modal-dialog">
			<div class="am-modal-hd">选择商品分类</div>
			<div class="am-modal-bd wm-modal-bd">
				<div class="am-g" style="border-bottom: 1px solid #ddd;">
					<div class="am-u-sm-12" style="height: 300px; overflow-y: auto;">
						<ul id="tree" class="ztree wm-ztree"></ul>
					</div>
				</div>
				<div class="am-g" style="margin-top: 10px;">
					<div class="am-u-sm-12" style="text-align: left;">
						<label class="am-form-label">已选商品分类：<span id="showType"></span><span id="showError" style=" color: #FB4444;"></span></label>
					</div>
				</div>
			</div>
			<div class="am-modal-footer">
				<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
				<span class="wm-modal-btn" onclick="javascript:selectedType();">确定</span>
			</div>
		</div>
	</div>
	<!-- type modal end -->

	<script type="text/javascript"
		src="${basePath }/js/app/commodity/base/add.js"></script>
</body>
</html>