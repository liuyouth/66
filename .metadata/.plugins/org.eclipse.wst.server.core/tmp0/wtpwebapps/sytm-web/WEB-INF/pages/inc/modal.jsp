<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="am-modal am-modal-alert" tabindex="-1" id="wm-alert">
	<div class="am-modal-dialog">
		<div class="am-modal-hd">
			系统消息
		</div>
		<div class="am-modal-bd">
			<span id="wm-alert-modal-show-msg-span"></span>
		</div>
		<div class="am-modal-footer">
			<span class="am-modal-btn">确定</span>
		</div>
	</div>
</div>

<div class="am-modal am-modal-confirm" tabindex="-1" id="wm-confirm">
	<div class="am-modal-dialog">
		<div class="am-modal-hd">
			系统消息
		</div>
		<div class="am-modal-bd">
			<span id="wm-confirm-modal-show-msg-span"></span>
		</div>
		<div class="am-modal-footer">
			<span class="am-modal-btn wm-modal-cancel-btn" data-am-modal-cancel>取消</span>
			<span class="am-modal-btn" data-am-modal-confirm>确定</span>
		</div>
	</div>
</div>

<div class="am-modal am-modal-loading am-modal-no-btn" tabindex="-1" id="wm-modal-loading">
	<div class="am-modal-dialog">
		<div class="am-modal-hd">处理中，请稍后...</div>
		<div class="am-modal-bd">
			<span class="am-icon-spinner am-icon-spin"></span>
		</div>
	</div>
</div>

<script type="text/javascript" src="${basePath }/js/app/inc/modal.js"></script>
