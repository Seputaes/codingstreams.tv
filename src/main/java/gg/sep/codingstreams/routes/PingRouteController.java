package gg.sep.codingstreams.routes;

import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import org.apache.http.HttpStatus;

import gg.sep.avenue.router.AbstractRouteController;
import gg.sep.avenue.router.AwsResponseBuilder;
import gg.sep.avenue.router.HEAD;

/**
 * Controller dedicated to ping/keepwarm CloudWatch events.
 */
public class PingRouteController extends AbstractRouteController {

    @HEAD(paths = "/keepwarm")
    public AwsProxyResponse keepWarm() {
        return AwsResponseBuilder.newBuilder()
            .setHeader("X-PONG", "marco")
            .status(HttpStatus.SC_NO_CONTENT)
            .build();
    }
}
