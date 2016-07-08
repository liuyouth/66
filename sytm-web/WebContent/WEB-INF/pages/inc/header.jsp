<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<header id="hearderAnchor" class="am-topbar am-topbar-inverse">
	<h1 class="am-topbar-brand" style="color: #fff;">
		<strong style="cursor: pointer;font-size: 28px;text-shadow: 1px 1px 1px #000;">仓储管理系统</strong>
	</h1>
	<div class="am-fr" style="margin-right: 10px;">
		<div class="am-btn-group">
			<div class="am-dropdown" data-am-dropdown>
				<button class="am-btn am-btn-primary am-topbar-btn am-btn-sm am-dropdown-toggle" data-am-dropdown-toggle>
					<span class="am-icon-user"></span> 天津XX经贸公司
				</button>
				<ul class="am-dropdown-content">
					<li>
						<a href="javascript:showEditPasswordModal();">修改密码</a>
					</li>
					<li class="am-divider"></li>
					<li>
						<a href="${basePath}/login/view" >
							<span class="am-icon-power-off"></span> 退出
						</a>
					</li>
				</ul>
			</div>
		</div>
	</div>
</header>

<!-- edit password modal start -->
<div class="am-modal am-modal-prompt" tabindex="-1" id="headerEditPasswordModal">
	<div class="am-modal-dialog">
		<div class="am-modal-hd">修改密码</div>
		<div class="am-modal-bd wm-modal-bd">
			<form id="headerEditPasswordForm" class="am-form am-form-horizontal">
				<div class="am-form-group">
					<label class="am-u-sm-3 am-form-label">
						旧密码<span class="am-text-danger">&nbsp;*</span>
					</label>
					<div class="am-u-sm-9">
						<input type="text" placeholder="请输入旧密码">
					</div>
				</div>
				<div class="am-form-group">
					<label class="am-u-sm-3 am-form-label">
						新密码<span class="am-text-danger">&nbsp;*</span>
					</label>
					<div class="am-u-sm-9">
						<input type="text" placeholder="请输入新密码">
					</div>
				</div>
				<div class="am-form-group">
					<label class="am-u-sm-3 am-form-label">
						密码确认<span class="am-text-danger">&nbsp;*</span>
					</label>
					<div class="am-u-sm-9">
						<input type="text" placeholder="请再次输入新密码">
					</div>
				</div>
			</form>
		</div>
		<div class="am-modal-footer">
			<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
			<span class="wm-modal-btn" onclick="javascript:void(0);">确定</span>
		</div>
	</div>
</div>
<!-- edit password modal end -->

<script type="text/javascript" src="${basePath }/js/app/inc/header.js"></script>
