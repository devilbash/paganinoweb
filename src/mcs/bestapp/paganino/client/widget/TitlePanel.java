package mcs.bestapp.paganino.client.widget;

import mcs.bestapp.paganino.client.event.NameEvent;
import mcs.bestapp.paganino.client.event.NameEvent.NameHandler;

import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class TitlePanel extends Composite implements NameHandler {

	interface SimpleLabelBinder extends UiBinder<Widget, TitlePanel> {
	}

	private static UiBinder<Widget, TitlePanel> binder = GWT
			.create(SimpleLabelBinder.class);

	@UiField
	Label label;

	public TitlePanel() {
		initWidget(binder.createAndBindUi(this));
		label.setText("prova");
	}

	@Override
	public void onNameChange(NameEvent nameEvent) {
		label.setText(nameEvent.getName());
	}
}
