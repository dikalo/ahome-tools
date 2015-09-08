package com.ait.toolkit.libs.visibility.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.Util;

public final class Visibility {

    static {
        Util.injectJs( VisibilityResource.INSTANCE.js() );
    }

    public static native void onVisible( Function callback )/*-{
		$wnd.visibly.onVisible(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
    }-*/;

    public static native void onHidden( Function callback )/*-{
		$wnd.visibly.onHidden(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
    }-*/;

    public static native boolean isSupported()/*-{
		return $wnd.visibly.isSupported();
    }-*/;

    public static native String getVisibilityState()/*-{
		return $wnd.visibly.visibilityState();
    }-*/;

    public static native void onVisibilityChange( VisibilityChangeCallback callback )/*-{
		$wnd.visibly
				.visibilityChange(function(s) {
					callback.@com.ait.toolkit.libs.visibility.client.VisibilityChangeCallback::onVisibilityChange(Ljava/lang/String;)(s);
				});
    }-*/;

}
