package com.ait.toolkit.libs.intro.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface IntroResources extends ClientBundle {

	public static final IntroResources INSTANCE = GWT.create(IntroResources.class);

	@Source("dark.css")
	TextResource darkTheme();

	@Source("nassim.css")
	TextResource nassimTheme();

	@Source("nazanin.css")
	TextResource nazaninTheme();

	@Source("royal.css")
	TextResource royalTheme();

	@Source("lib.css")
	TextResource css();

	@Source("lib.js")
	TextResource lib();

	@Source("libRtl.js")
	TextResource libRtl();
}
