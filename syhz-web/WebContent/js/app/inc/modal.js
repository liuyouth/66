function alertWm(msg, okfn) {
	$("#wm-alert-modal-show-msg-span").text(msg);
	$('#wm-alert').on('closed.modal.amui', function() {
		if (okfn != undefined) {
			okfn();
		}
	});
	$('#wm-alert').modal('open');
}

function confirmWm(msg, okfn, ngfn) {
	$("#wm-confirm-modal-show-msg-span").text(msg);
	$('#wm-confirm').modal({
		relatedTarget : this,
		onConfirm : function(options) {
			if (okfn != undefined) {
				okfn();
			}
		},
		onCancel : function() {
			if (ngfn != undefined) {
				ngfn();
			}
		}
	});
	$('#wm-confirm').modal('open');
}

function showLoadingWm() {
	$('#wm-modal-loading').modal('open');
}

function hideLoadingWm() {
	$('#wm-modal-loading').modal('close');
}