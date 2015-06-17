package mcs.bestapp.paganino.client;

import mcs.bestapp.paganino.client.content.PaganinoShell;

import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class Paganino implements EntryPoint {
	
	private static final Logger log = Logger.getLogger(Paganino.class.getName());


	@Override
	public void onModuleLoad() {
	    RootLayoutPanel rp = RootLayoutPanel.get();
	    PaganinoShell finsShell = new PaganinoShell();
	    rp.add(finsShell);
	    
	    log.info("Module loaded. BaseURL - " + GWT.getModuleBaseURL());
	}

}
