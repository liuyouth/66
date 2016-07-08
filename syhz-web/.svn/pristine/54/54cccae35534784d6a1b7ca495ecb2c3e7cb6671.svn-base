function toggleNav(f, s, t) {
	if (t != 0 && s != 0) {
		$("#nav-" + f).collapse('toggle');
		$("#nav-" + f + "-" + s).collapse('toggle');
		$("#nav-" + f + "-" + s + "-" + t).addClass("wm-nav-active");
	} else {
		if (s != 0) {
			$("#nav-" + f).collapse('toggle');
			$("#nav-" + f + "-" + s).addClass("wm-nav-active");
		} else {
			$("#nav-" + f).addClass("wm-nav-active");
		}
	}
}
function jumpTo(p) {
	window.location.href = basePath + "/" + p + "/view";
}