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
				<li><a href="javascript:void(0);">分拣管理</a></li>
				<li class="am-active">发货订单</li>
			</ol>
			<hr class="wm-hr">
			<!-- context start -->
			<!-- tool bar start -->
			<div class="am-g">
				<div class="am-u-sm-12">
					<div class="am-btn-group">
						<button title="生成分拣单" type="button" class="am-btn am-btn-default" onclick="javascript:jumpTo('sorting/sortingAdd')">
							<span class="am-icon-random"></span> 生成分拣单
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
			<table id="showListTable" class="am-table am-table-striped am-table-hover table-main" >
				<thead>
					<tr>
						<th>
							<input id="allCheckbox" type="checkbox" onclick="javascript:selectAll();" />
						</th>
						<th>订单编号</th>
						<th>收货方名称</th>
						<th>收货地址</th>
						<th>要求到货日期</th>
						<th>配送方式</th>
						<th>二次包装</th>
						<th>商品总金额</th>
						<th style="text-align: center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>自提</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>自提</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>配送</td>
						<td>是</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>配送</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>配送</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>配送</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>配送</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>配送</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>配送</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
									</button>
								</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" class="ckClassFlg">
						</td>
						<td>DD001</td>
						<td>XX超市</td>
						<td>XX市XX区XX路XX号</td>
						<td>2016/01/01</td>
						<td>配送</td>
						<td>否</td>
						<td>5000</td>
						<td>
							<div class="am-u-sm-12" style="text-align: center;">
								<div class="am-btn-group am-btn-group-xs">
									<button title="订单详情" class="am-btn am-btn-default am-btn-xs am-text-secondary" onclick="javascript:jumpTo('sorting/orderDetial')">
										<span class="am-icon-file-o"></span>详情
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
	
	<script type="text/javascript" src="${basePath }/js/app/sorting/orderList.js"></script>
</body>
</html>