package com.jmexe.restlet.counter;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * Created by Jmexe on 10/10/14.
 */
public class CountApplication extends Application{
    @Override
    public synchronized Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        // new instance of HelloWorldResource.
        Router router = new Router(getContext());
        router.attach("/count/{appname}", CountResource.class);
        // Defines only one route
        //router.attachDefault(NewsResource.class);
        return router;
    }
}
