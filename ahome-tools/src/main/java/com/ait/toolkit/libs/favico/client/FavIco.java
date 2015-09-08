package com.ait.toolkit.libs.favico.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.Util;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Image;

public final class FavIco extends JsObject {

    static {
        Util.injectJs( FavIcoResources.INSTANCE.js() );
    }

    private FavIco( JavaScriptObject peer ) {
        jsObj = peer;
    }

    public static FavIco create( FavIcoConfig config ) {
        return new FavIco( createPeer( config.getJsObj() ) );
    }

    public static FavIco create() {
        return new FavIco( createPeer() );
    }

    public native void badge( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.badge(value);
    }-*/;

    public void setImage( ImageResource imageResources ) {
        Image image = new Image( imageResources );
        setImage( image.getElement() );
    }

    public void setImage( String imageElementId ) {
        setImage( DOM.getElementById( imageElementId ) );
    }

    public native void setImage( Element imageElement )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.image(imageElement);
    }-*/;

    public void playVideo( String imageElementId ) {
        playVideo( DOM.getElementById( imageElementId ) );
    }

    public native void playVideo( Element imageElement )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.video(imageElement);
    }-*/;

    public native void stopVideo()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.video('stop');
    }-*/;

    public native void webcam()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.webcam();
    }-*/;

    public native void stopWebcam()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.webcam('stop');
    }-*/;

    private static native JavaScriptObject createPeer( JavaScriptObject config )/*-{
		return new $wnd.Favico(config);
    }-*/;

    private static native JavaScriptObject createPeer()/*-{
		return new $wnd.Favico();
    }-*/;

}
