package mcs.bestapp.paganino.client.event;


import mcs.bestapp.paganino.client.event.NameEvent.NameHandler;
import com.google.gwt.event.shared.EventHandler;
import com.google.web.bindery.event.shared.Event;

public class NameEvent extends Event<NameHandler> {

	public static final Type<NameHandler> TYPE = new Type<NameHandler>();

	public interface NameHandler extends EventHandler {
		public void onNameChange(NameEvent nameEvent);
	}

	private String name;

	public NameEvent(String name) {
		this.name = name;
	}

	@Override
	public Type<NameHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(NameHandler handler) {
		handler.onNameChange(this);
	}

	public String getName() {
		return name;
	}

}
