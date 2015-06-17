package mcs.bestapp.paganino.client.content;


import mcs.bestapp.paganino.client.widget.ContentPanel;
import mcs.bestapp.paganino.client.widget.MenuBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import mcs.bestapp.paganino.client.event.EventBus;
import mcs.bestapp.paganino.client.event.StatusEvent;
import mcs.bestapp.paganino.client.event.StatusEvent.StatusHandler;
import mcs.bestapp.paganino.client.widget.Status;



public class PaganinoShell extends ResizeComposite  implements StatusHandler{

	interface PaganinoShellBinder extends UiBinder<Widget, PaganinoShell> {
	}

	private static UiBinder<Widget, PaganinoShell> binder = GWT
			.create(PaganinoShellBinder.class);


	@UiField
	ContentPanel contentPanel;
	@UiField
	MenuBar menuBar;
    @UiField
    Status status;
    
     
	public PaganinoShell() {
		initWidget(binder.createAndBindUi(this));

		if (!GWT.isProdMode()) {
			contentPanel.addTab("Log", new LogTab());
		}

		contentPanel.addTab("Home", new DateBox());

        EventBus.get().addHandler(StatusEvent.TYPE, this);
        EventBus.get().fireEvent(new StatusEvent("message"));
	}
	
	
	@Override
    public void onStatusChange(StatusEvent event) {
            status.setText(event.getStatus());
    }
	
}