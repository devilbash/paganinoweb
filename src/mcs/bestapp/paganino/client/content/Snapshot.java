package mcs.bestapp.paganino.client.content;



import java.util.HashMap;
import java.util.Map;

import mcs.bestapp.paganino.client.event.EventBus;
import mcs.bestapp.paganino.client.event.NameEvent;
import mcs.bestapp.paganino.client.widget.FactPanel;
import mcs.bestapp.paganino.client.widget.FactTable;
import mcs.bestapp.paganino.client.widget.TitlePanel;
import mcs.bestapp.paganino.client.widget.ToolbarItem;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;

public class Snapshot extends ResizeComposite {

	interface SnapshotBinder extends UiBinder<Widget, Snapshot> {
	}

	private static UiBinder<Widget, Snapshot> binder = GWT
			.create(SnapshotBinder.class);



	public Snapshot() {
		initWidget(binder.createAndBindUi(this));
		

		//SymbolAction symbolAction = new SymbolAction(getFilterMap());
		//symbolAction.setEventSource(this);
		//EventBus.get().addHandlerToSource(NameEvent.TYPE, this, symbolAction);
	}

	

	@UiFactory
	public TitlePanel titlePanelFactory() {
		TitlePanel tp = new TitlePanel();
		//EventBus.get().addHandlerToSource(NameEvent.TYPE, this, tp);
		return tp;
	}




}
