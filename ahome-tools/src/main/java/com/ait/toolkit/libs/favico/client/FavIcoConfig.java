package com.ait.toolkit.libs.favico.client;

import com.ait.toolkit.core.client.Color;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class FavIcoConfig extends JsObject {

    public FavIcoConfig() {
        jsObj = JsoHelper.createObject();
    }

    public void setBackgroundColor( String value ) {
        JsoHelper.setAttribute( jsObj, "bgColor", value );
    }

    public void setBackgroundColor( Color color ) {
        setBackgroundColor( color.getValue() );
    }

    public void setTextColor( String value ) {
        JsoHelper.setAttribute( jsObj, "textColor", value );
    }

    public void setElementId( String value ) {
        JsoHelper.setAttribute( jsObj, "elementId", value );
    }

    public void setTextColor( Color color ) {
        setTextColor( color.getValue() );
    }

    public void setFontFamily( String value ) {
        JsoHelper.setAttribute( jsObj, "fontFamily", value );
    }

    public void setFontStyle( String value ) {
        JsoHelper.setAttribute( jsObj, "fontStyle", value );
    }

    public void setBadgeType( BadgeType value ) {
        JsoHelper.setAttribute( jsObj, "type", value.name().toLowerCase() );
    }

    public void setBadgeFontStyle( BadgeFontStyle value ) {
        JsoHelper.setAttribute( jsObj, "type", value.name().toLowerCase().replace( "style_", "" ) );
    }

    public void setBadgePosition( BadgePosition value ) {
        JsoHelper.setAttribute( jsObj, "position", value.name().toLowerCase() );
    }

    public void setBadgeAnimation( BadgeAnimation value ) {
        JsoHelper.setAttribute( jsObj, "animation", value.name().toLowerCase() );
    }

}
