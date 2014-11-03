package com.ait.toolkit.libs.jquery.slick.client;

import com.ait.toolkit.core.client.Util;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

class SlickItem extends ComplexPanel implements IsWidget {

	Element root;
	private String id = Util.randomString();

	SlickItem() {
		root = Document.get().createDivElement();
		root.setId(id);
		setElement(root);
	}

	SlickItem(Widget child) {
		this();
		add(child);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void add(Widget w) {
		add(w, getElement());
	}

}
