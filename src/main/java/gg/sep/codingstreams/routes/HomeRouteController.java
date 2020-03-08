package gg.sep.codingstreams.routes;

import java.util.Collections;

import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.mitchellbosecke.pebble.PebbleEngine;
import lombok.RequiredArgsConstructor;

import gg.sep.avenue.router.AbstractRouteController;
import gg.sep.avenue.router.AwsResponseBuilder;
import gg.sep.avenue.router.GET;
import gg.sep.codingstreams.util.TemplateUtils;

/**
 * Routes for the website home page.
 */
@RequiredArgsConstructor
public class HomeRouteController extends AbstractRouteController {

    private final PebbleEngine pebbleEngine;

    /**
     * Home Page.
     * @return Home Page.
     */
    @GET(paths = "/")
    public AwsProxyResponse home() {
        return AwsResponseBuilder.newBuilder()
            .html()
            .stringBody(TemplateUtils.render("website/home.peb", pebbleEngine, Collections.emptyMap()))
            .build();
    }
}
