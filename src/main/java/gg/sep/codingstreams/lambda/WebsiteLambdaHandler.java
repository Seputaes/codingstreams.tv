package gg.sep.codingstreams.lambda;

import com.mitchellbosecke.pebble.PebbleEngine;
import lombok.extern.log4j.Log4j2;

import gg.sep.avenue.router.BasicLambdaProxyHandler;
import gg.sep.codingstreams.routes.HomeRouteController;
import gg.sep.codingstreams.routes.PingRouteController;

/**
 * Main Lambda event handler for the codingstreams.tv website.
 */
@Log4j2
public class WebsiteLambdaHandler extends BasicLambdaProxyHandler {

    private static final PebbleEngine PEBBLE_ENGINE = buildPebbleEngine();

    /**
     * Construct the handler, setting the necessary route controllers.
     */
    public WebsiteLambdaHandler() {
        super();

        // register the controllers
        registerController(new HomeRouteController(PEBBLE_ENGINE));
        registerController(new PingRouteController());
    }

    private static PebbleEngine buildPebbleEngine() {
        return new PebbleEngine.Builder()
            .build();
    }
}
