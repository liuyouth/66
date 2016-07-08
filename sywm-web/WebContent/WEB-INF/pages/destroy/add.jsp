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
				<li><a href="${basePath}/destroy/list/view">销毁管理</a></li>
				<li class="am-active">新增销毁信息</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<div class="am-u-sm-10 am-u-sm-centered">
				<div class="am-panel am-panel-primary wm-panel">
					<div class="am-panel-hd">新增销毁信息</div>
					<div class="am-panel-bd">
						<form id="addForm" class="am-form wm-form am-form-horizontal">
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">销毁信息编号<span
									class="am-text-danger">&nbsp;*</span></label>
								<div class="am-u-sm-9">
									<input type="text" placeholder="请输入破损信息编号 ">
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">销毁说明</label>
								<div class="am-u-sm-9">
									<textarea rows="4" cols="20" placeholder="请输入销毁说明"></textarea>
								</div>
							</div>
							<div class="am-form-group">
								<label class="am-u-sm-3 am-form-label">是否破损</label>
								<div class="am-u-sm-9">
									<select data-am-selected>
										<option>请选择包装单位</option>
										<option value="0">否</option>
										<option value="1">是</option>
									</select>
								</div>
							</div>
							<div class="am-g">
								<div class="am-u-sm-12" style="text-align: left;">
									<div class="wm-inner-table-title">
										<label class="wm-inner-table-title-label">销毁商品信息</label>
										<button title="新增销毁商品" type="button"
											class="am-btn am-btn-default"
											onclick="javascript:showaddModal();">
											<span class="am-icon-plus"></span> 新增
										</button>
									</div>
								</div>
							</div>
						</form>
					</div>
					<footer class="am-panel-footer">
						<div class="am-g">
							<label class="am-u-sm-3 am-form-label"></label>
							<div class="am-u-sm-9" style="text-align: right;">
								<button type="button" class="am-btn am-btn-primary">保存</button>
								<button type="button" class="am-btn am-btn-primary">提交</button>
								<button type="button" class="am-btn am-btn-default"
									onclick="javascript:history.back(-1);">返回</button>
							</div>
						</div>
					</footer>
				</div>
			</div>

			<!-- context end -->
		</div>
	</div>
	<!-- add destory_goods start -->
	<div id="add_destory_goods" class="am-modal"
		tabindex="-1">
		<div class="am-modal-dialog" style="width: 1050px;">
			<div class="am-modal-hd">选择商品</div>
			<div class="am-modal-bd am-text-left wm-modal-bd">
				<div class="am-panel am-panel-default">
					<div class="am-panel-bd">
						<form class="am-form-inline" role="form">
							<div class="am-form-group">
								<label>商品编号</label> <input type="text" class="am-form-field"
									placeholder="请输入商品编号">
							</div>
							<div class="am-form-group">
								<label>商品名称</label> <input type="text" class="am-form-field"
									placeholder="请输入商品名称">
							</div>
							<button title="搜索商品" type="button" class="am-btn am-btn-default">搜索</button>
						</form>
						<hr class="wm-hr" style="margin-top: 15px !important;">
						<table id="commodityChoosingTable"
							class="am-table am-table-striped am-table-hover table-main"
							style="width: 100%;">
							<thead>
								<tr>
									<th>选择</th>
									<th>商品编号</th>
									<th>商品名称</th>
									<th>商品规格</th>
									<th>包装单位</th>
									<th>包装内商品数量</th>
									<th>生产时间</th>
									<th>临期</th>
									<th>有效期</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><label class="am-radio"> <input type="radio"
											name="radio">
									</label></td>
									<td>JLYDDM</td>
									<td>金龙鱼大米</td>
									<td>10kg/袋</td>
									<td>袋</td>
									<td>1</td>
									<td>2016-05-05</td>
									<td>2017-04-04</td>
									<td>2017-06-06</td>
								</tr>
								<tr>
									<td><label class="am-radio"> <input type="radio"
											name="radio">
									</label></td>
									<td>JLYDDM</td>
									<td>金龙鱼大米</td>
									<td>10kg/袋</td>
									<td>袋</td>
									<td>1</td>
									<td>2016-05-05</td>
									<td>2017-05-05</td>
									<td>2017-06-06</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div class="am-panel am-panel-default">
					<div class="am-panel-bd">
						<form class="am-form-inline" role="form">
							<div class="am-form-group">
								<label>退货数量</label> <input type="text" class="am-form-field"
									placeholder="请输入退货数量">
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="am-modal-footer">
				<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
				<span class="wm-modal-btn">确定</span>
			</div>
		</div>
	</div>
	<!-- add destory_goods start -->
	<!-- modal start -->
	<%@ include file="/WEB-INF/pages/inc/modal.jsp"%>
	<!-- modal end -->

	<!-- footer start -->
	<%@ include file="/WEB-INF/pages/inc/footer.jsp"%>
	<!-- footer end -->

	<script type="text/javascript" src="${basePath }/js/app/destroy/add.js"></script>
</body>
</html>