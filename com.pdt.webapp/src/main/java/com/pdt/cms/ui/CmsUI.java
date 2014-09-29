package com.pdt.cms.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * <p>
 * Main UI for Content management system
 * </p>
 * 
 * @author hungpx
 * @since
 */
public class CmsUI extends UI {

	private static final long serialVersionUID = -8040348056976003238L;

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout mainLayout = new VerticalLayout();
		mainLayout.setSizeFull();
		MenuBar menuBar = new MenuBar();
		menuBar.setWidth("1000px");
		mainLayout.addComponent(menuBar);
		mainLayout.setComponentAlignment(menuBar, Alignment.MIDDLE_CENTER);

		Command command = new Command() {
			private static final long serialVersionUID = 1L;

			@Override
			public void menuSelected(MenuItem selectedItem) {
				mainLayout.addComponent(new Label(selectedItem.getText()));
			}
		};

		MenuItem tourItems = menuBar.addItem("Tour", command);
		tourItems.addItem("Tour", command);
		tourItems.addItem("Sự kiện", command);
		tourItems.addItem("Subject", command);

		MenuItem serviceItems = menuBar.addItem("Dịch vụ", command);
		serviceItems.addItem("Vé máy bay", null, command);

		// A top-level menu item that opens a submenu
		// MenuItem drinks = menuBar.addItem("Beverages", null, null);

		// Submenu item with a sub-submenu
		// MenuItem hots = drinks.addItem("Hot", null, null);
		// hots.addItem("Tea", null, mycommand);
		// hots.addItem("Coffee", null, mycommand);
		//
		// // Another submenu item with a sub-submenu
		// MenuItem colds = drinks.addItem("Cold", null, null);
		// colds.addItem("Milk", null, mycommand);
		// colds.addItem("Weissbier", null, mycommand);
		//
		// // Another top-level item
		// MenuItem snacks = menuBar.addItem("Snacks", null, null);
		// snacks.addItem("Weisswurst", null, mycommand);
		// snacks.addItem("Bratwurst", null, mycommand);
		// snacks.addItem("Currywurst", null, mycommand);

		// Yet another top-level item
		MenuItem servs = menuBar.addItem("Services", null, null);
		servs.addItem("Car Service", null, command);
		setContent(mainLayout);

	}
}
