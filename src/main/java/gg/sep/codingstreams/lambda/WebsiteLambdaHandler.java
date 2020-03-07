package gg.sep.codingstreams.lambda;

import gg.sep.avenue.router.BasicLambdaProxyHandler;
import gg.sep.codingstreams.routes.HomeRouteController;
import gg.sep.codingstreams.routes.PingRouteController;

/**
 * Main Lambda event handler for the codingstreams.tv website.
 */
public class WebsiteLambdaHandler extends BasicLambdaProxyHandler {

    /**
     * Construct the handler, setting the necessary route controllers.
     */
    public WebsiteLambdaHandler() {
        super();

        // register the controllers
        registerController(new HomeRouteController());
        registerController(new PingRouteController());
    }
}
