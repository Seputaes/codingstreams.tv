package gg.sep.codingstreams.routes;

import com.amazonaws.serverless.proxy.model.AwsProxyResponse;

import gg.sep.avenue.router.AbstractRouteController;
import gg.sep.avenue.router.AwsResponseBuilder;
import gg.sep.avenue.router.GET;

/**
 * Routes for the website home page.
 */
public class HomeRouteController extends AbstractRouteController {

    /**
     * Home Page.
     * @return Home Page.
     */
    @GET(paths = "/")
    public AwsProxyResponse home() {
        return AwsResponseBuilder.newBuilder()
            .html()
            .stringBody("Hello World!")
            .build();
    }
}
