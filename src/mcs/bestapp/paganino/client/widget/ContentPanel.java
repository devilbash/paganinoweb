package mcs.bestapp.paganino.client.widget;



import mcs.bestapp.paganino.client.content.Snapshot;
import mcs.bestapp.paganino.client.event.EventBus;
import mcs.bestapp.paganino.client.event.MenuEvent;
import mcs.bestapp.paganino.client.event.MenuHandler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;


public class ContentPanel extends ResizeComposite 
		implements MenuHandler,
					CloseHandler<ClosePanel> {

	interface ContentPanelBinder extends UiBinder<Widget, ContentPanel> {
	}

	private static UiBinder<Widget, ContentPanel> binder = GWT
			.create(ContentPanelBinder.class);

	@UiField
	TabLayoutPanel tab;

	public ContentPanel() {
		initWidget(binder.createAndBindUi(this));
        EventBus.get().addHandler(MenuEvent.TYPE, this);
   	}

	public void addTab(String text, Composite content) {
		ClosePanel closePanel = new ClosePanel();
		closePanel.setText(text);
		closePanel.addCloseHandler(this);
		tab.add(content,closePanel);
		tab.selectTab(tab.getWidgetCount() - 1);
	}
	
	@Override
    public void onMenuSelection(MenuEvent menuEvent) {
            String contentName = menuEvent.getMenu();
            if (contentName.equals("Snapshot")) {
                addTab(contentName, new Snapshot());
            }
    }
	@Override
	public void onClose(CloseEvent<ClosePanel> event) {
		if (tab.getWidgetCount() > 1) {
			event.getTarget().removeFromParent();
		}
	}
}