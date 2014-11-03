;(function($) {
	/*
	 * Plugin defaults
	 */	
	$.screensaver = function(settings) {		
		var o = $("#screensaver");
		if(o){
			o.remove();
		}
		$.screensaver.settings = $.extend({}, settings);
		
		var scrsvrObj = $($.screensaver.settings.html)
			.appendTo("body").hide()
			.css({
				'position': 'absolute', 'top': '0', 'left': '0', 'overflow': 'hidden',
				'width': $.screensaver.settings.width, 'height': $.screensaver.settings.height
			});
		//$.screensaver.startCounter($.screensaver.settings.delay);
		console.log($.screensaver.settings.passwordProtected);
		if( $.screensaver.settings.passwordProtected == false){
			bindEvents($.screensaver.settings.events);
		}	
		return scrsvrObj;
	};
	
	/*
	 * Public Functions
	 */
	 $.screensaver.destroy = function() {
		 var o = $("#screensaver");
			if(o){
				o.remove();
			}
	};
	$.screensaver.hide = function() {
		var o = $("#screensaver");
		if(o){
			o.fadeOut("slow");
		}		
	};
	
	$.screensaver.show = function() {
		$("#screensaver").fadeIn("slow");
	};

	function bindEvents(events, elmt) {
		$(window).bind(events, $.screensaver.hide);
		$("#screensaver, #screensaver object").bind(events, $.screensaver.hide);

	};
})(jQuery);