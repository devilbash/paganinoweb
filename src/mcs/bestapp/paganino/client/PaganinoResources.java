package mcs.bestapp.paganino.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;



public interface PaganinoResources extends ClientBundle {

	public static final PaganinoResources INSTANCE = GWT.create(PaganinoResources.class);
	
	@Source("mcs/bestapp/paganino/client/images/bean.png")
	ImageResource bean();

	@Source("mcs/bestapp/paganino/client/images/blank.png")
	ImageResource blank();

	@Source("mcs/bestapp/paganino/client/images/chart.png")
	ImageResource chart();

	@Source("mcs/bestapp/paganino/client/images/close.png")
	ImageResource close();

	@Source("mcs/bestapp/paganino/client/images/coffee.png")
	ImageResource coffee();

	@Source("mcs/bestapp/paganino/client/images/delete.png")
	ImageResource delete();

	@Source("mcs/bestapp/paganino/client/images/dollar.png")
	ImageResource dollar();

	@Source("mcs/bestapp/paganino/client/images/folder-doc.png")
	ImageResource folderDoc();

	@Source("mcs/bestapp/paganino/client/images/line.jpeg")
	DataResource line();

	@Source("mcs/bestapp/paganino/client/images/loading.gif")
	ImageResource loading();

	@Source("mcs/bestapp/paganino/client/images/next.png")
	ImageResource next();

	@Source("mcs/bestapp/paganino/client/images/peers.png")
	ImageResource peers();

	@Source("mcs/bestapp/paganino/client/images/pin.png")
	ImageResource pin();

	@Source("mcs/bestapp/paganino/client/images/previous.png")
	ImageResource previous();

	@Source("mcs/bestapp/paganino/client/images/puzzle.png")
	ImageResource puzzle();

	@Source("mcs/bestapp/paganino/client/images/ratio.png")
	ImageResource ratio();

	@Source("mcs/bestapp/paganino/client/images/shipping.png")
	ImageResource shipping();

	@Source("mcs/bestapp/paganino/client/images/shopping-bag.png")
	ImageResource shoppingBag();

	@Source("mcs/bestapp/paganino/client/images/shopping-cart.png")
	ImageResource shoppingCart();

	@Source("mcs/bestapp/paganino/client/images/spanner.png")
	ImageResource spanner();

	@Source("mcs/bestapp/paganino/client/images/table-sheet.png")
	ImageResource tableSheet();

	@Source("mcs/bestapp/paganino/client/images/watch.png")
	ImageResource watch();

}
