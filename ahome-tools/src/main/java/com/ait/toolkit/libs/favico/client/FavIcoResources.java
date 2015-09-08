package com.ait.toolkit.libs.favico.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface FavIcoResources extends ClientBundle {

    public static FavIcoResources INSTANCE = GWT.create( FavIcoResources.class );

    @Source( "lib.js" )
    public TextResource js();
}
