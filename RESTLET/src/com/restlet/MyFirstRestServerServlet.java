package com.restlet;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class MyFirstRestServerServlet extends Application {

	/**
	 * Creates a root Restlet that will receive all incoming calls.
	 */
	@Override
	public synchronized Restlet createInboundRoot() {
		// Create a router Restlet that routes each call to a new Resource
		Router router = new Router(getContext());

		router.attachDefault(TestJsonResource.class);
		return router;
	}
}