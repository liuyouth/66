<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="am-u-sm-3">
	<ul class="am-list admin-sidebar-list" id="wm-nav">
	
		<li id="nav-1">
			<a href="javascript:void(0);" onclick="javascript:jumpTo('arrival_plan/list');">
				<span class="am-margin-left-sm">到货计划管理</span>
			</a>
		</li>
		
		<li id="nav-2">
			<a href="javascript:void(0);" onclick="javascript:jumpTo('deliver_order/list');">
				<span class="am-margin-left-sm">发货订单管理</span>
			</a>
		</li>
		
		<li id="nav-3">
			<a href="javascript:void(0);" onclick="javascript:jumpTo('return_goods/list');">
				<span class="am-margin-left-sm">退货管理</span>
			</a>
		</li>
		
		<li id="nav-4">
			<a href="javascript:void(0);" onclick="javascript:jumpTo('damage/list');">
				<span class="am-margin-left-sm">报损管理</span>
			</a>
		</li>
		
		<li id="nav-5">
			<a href="javascript:void(0);" onclick="javascript:jumpTo('destroy/list');">
				<span class="am-margin-left-sm">销毁管理</span>
			</a>
		</li>
		
		<li id="nav-6">
			<a href="javascript:void(0);" onclick="javascript:jumpTo('recipient/list');">
				<span class="am-margin-left-sm">收货人管理</span>
			</a>
		</li>
		
	</ul>
</div>

<script type="text/javascript" src="${basePath }/js/app/inc/nav.js"></script>
