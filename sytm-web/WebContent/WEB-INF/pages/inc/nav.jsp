<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="am-u-sm-3">
	<ul class="am-list admin-sidebar-list" id="wm-nav">
	
		<li class="am-panel">
			<a data-am-collapse="{parent: '#wm-nav', target: '#nav-1'}">
				<span class="am-margin-left-sm">收货管理</span>
				<i class="am-icon-angle-right am-fr am-margin-right"></i>
			</a>
			<ul class="am-list am-collapse admin-sidebar-sub" id="nav-1">
				<li id="nav-1-1">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">到货计划</span>
					</a>
				</li>
				<li id="nav-1-2">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">收货单</span>
					</a>
				</li>
			</ul>
		</li>
		
		<li class="am-panel">
			<a data-am-collapse="{parent: '#wm-nav', target: '#nav-2'}">
				<span class="am-margin-left-sm">发货管理</span>
				<i class="am-icon-angle-right am-fr am-margin-right"></i>
			</a>
			<ul class="am-list am-collapse admin-sidebar-sub" id="nav-2">
				<li id="nav-2-1">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">发货订单</span>
					</a>
				</li>
				<li id="nav-2-2">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">出库单</span>
					</a>
				</li>
			</ul>
		</li>
		
		<li id="nav-3">
			<a href="javascript:void(0);" onclick="javascript:void(0);">
				<span class="am-margin-left-sm">退货管理</span>
			</a>
		</li>
		
		<li id="nav-4">
			<a href="javascript:void(0);" onclick="javascript:void(0);">
				<span class="am-margin-left-sm">报损及销毁管理</span>
			</a>
		</li>
		
		<li id="nav-5">
			<a href="javascript:void(0);" onclick="javascript:void(0);">
				<span class="am-margin-left-sm">库存管理</span>
			</a>
		</li>
		
		<li class="am-panel">
			<a data-am-collapse="{parent: '#wm-nav', target: '#nav-6'}">
				<span class="am-margin-left-sm">商品信息管理</span>
				<i class="am-icon-angle-right am-fr am-margin-right"></i>
			</a>
			<ul class="am-list am-collapse admin-sidebar-sub" id="nav-6">
				<li id="nav-6-1">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">分类管理</span>
					</a>
				</li>
				<li id="nav-6-2">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">品牌管理</span>
					</a>
				</li>
				<li id="nav-6-3">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">包装规格管理</span>
					</a>
				</li>
				<li id="nav-6-4">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">基本信息管理</span>
					</a>
				</li>
			</ul>
		</li>
		
		<li class="am-panel">
			<a data-am-collapse="{parent: '#wm-nav', target: '#nav-7'}">
				<span class="am-margin-left-sm">客户信息管理</span>
				<i class="am-icon-angle-right am-fr am-margin-right"></i>
			</a>
			<ul class="am-list am-collapse admin-sidebar-sub" id="nav-7">
				<li id="nav-7-1">
					<a href="javascript:void(0);" onclick="javascript:jumpTo('goods_owner/list');">
						<span class="am-margin-left-lg">货主信息管理</span>
					</a>
				</li>
				<li id="nav-7-2">
					<a href="javascript:void(0);" onclick="javascript:jumpTo('goods_owner_user/list');">
						<span class="am-margin-left-lg">货主系统账号管理</span>
					</a>
				</li>
			</ul>
		</li>
		
		<li class="am-panel">
			<a data-am-collapse="{parent: '#wm-nav', target: '#nav-8'}">
				<span class="am-margin-left-sm">车队管理</span>
				<i class="am-icon-angle-right am-fr am-margin-right"></i>
			</a>
			<ul class="am-list am-collapse admin-sidebar-sub" id="nav-8">
				<li id="nav-8-1">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">司机管理</span>
					</a>
				</li>
				<li id="nav-8-2">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">车辆管理</span>
					</a>
				</li>
			</ul>
		</li>
		
		<li class="am-panel">
			<a data-am-collapse="{parent: '#wm-nav', target: '#nav-9'}">
				<span class="am-margin-left-sm">仓库信息管理</span>
				<i class="am-icon-angle-right am-fr am-margin-right"></i>
			</a>
			<ul class="am-list am-collapse admin-sidebar-sub" id="nav-9">
				<li id="nav-9-1">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">库区管理</span>
					</a>
				</li>
				<li id="nav-9-2">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">货架管理</span>
					</a>
				</li>
				<li id="nav-9-3">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">货位管理</span>
					</a>
				</li>
				<li id="nav-9-4">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">托盘管理</span>
					</a>
				</li>
			</ul>
		</li>
		
		<li class="am-panel">
			<a data-am-collapse="{parent: '#wm-nav', target: '#nav-10'}">
				<span class="am-margin-left-sm">系统信息管理</span>
				<i class="am-icon-angle-right am-fr am-margin-right"></i>
			</a>
			<ul class="am-list am-collapse admin-sidebar-sub" id="nav-10">
				<li id="nav-10-1">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">用户管理</span>
					</a>
				</li>
				<li id="nav-10-2">
					<a href="javascript:void(0);" onclick="javascript:void(0);">
						<span class="am-margin-left-lg">权限管理</span>
					</a>
				</li>
			</ul>
		</li>
		
	</ul>
</div>

<script type="text/javascript" src="${basePath }/js/app/inc/nav.js"></script>
