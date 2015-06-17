package mcs.bestapp.paganino.client.widget;

import mcs.bestapp.paganino.client.PaganinoResources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import mcs.bestapp.paganino.client.event.EventBus;
import mcs.bestapp.paganino.client.event.MenuEvent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;


public class MenuItem extends Composite {

	PaganinoResources images = PaganinoResources.INSTANCE;

	interface MenuItemBinder extends UiBinder<Widget, MenuItem> {
	}

	private static UiBinder<Widget, MenuItem> binder = GWT
			.create(MenuItemBinder.class);

	@UiField
	Anchor anchor;
	
	@UiConstructor
    public MenuItem(String text, ImageResource imageResource,
                    final String contentName) {
            initWidget(binder.createAndBindUi(this));
            anchor.setHTML(getHtml(imageResource, text));
            anchor.setName(contentName);
            anchor.addClickHandler(new ClickHandler() {
                    @Override
                    public void onClick(ClickEvent event) {
                            EventBus.get().fireEvent(new MenuEvent(contentName));
                    }
            });
    }

	private SafeHtml getHtml(ImageResource image, String text) {
		SafeHtmlBuilder sb = new SafeHtmlBuilder();
		sb.append(getHtml(images.blank()));
		sb.append(getHtml(image));
		sb.append(getHtml(images.blank()));
		sb.appendEscaped(" ").appendEscaped(text);
		return sb.toSafeHtml();
	}

	private SafeHtml getHtml(ImageResource image) {
		return SafeHtmlUtils.fromTrustedString(AbstractImagePrototype.create(
				image).getHTML());
	}

	
	
}