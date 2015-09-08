package com.ait.toolkit.libs.visibility.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface VisibilityResource extends ClientBundle {

    public static final VisibilityResource INSTANCE = GWT.create( VisibilityResource.class );

    @Source( "lib.js" )
    TextResource js();
}
