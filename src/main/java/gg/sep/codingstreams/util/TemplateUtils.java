package gg.sep.codingstreams.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

/**
 * Utilities for working with Pebble Templates.
 */
@UtilityClass
@Log4j2
public class TemplateUtils {
    private static final String TEMPLATE_PATH_PREFIX = "templates/";

    /**
     * Renders the given Pebble template file using the specified engine and template variables map.
     *
     * @param pathToTemplate Relative path to the template file inside the {@code templates} directory.
     * @param engine The {@link PebbleEngine} to use when rendering the template.
     * @param vars Map of template variable names to their values in the template.
     * @return Returns the rendered value of the template.
     * @throws RuntimeException Thrown if loading or rendering the template fails. // TODO: Make this a better exception
     */
    public static String render(final String pathToTemplate, final PebbleEngine engine, final Map<String, Object> vars) {
        try {
            final PebbleTemplate template = engine.getTemplate(TEMPLATE_PATH_PREFIX + pathToTemplate);
            final StringWriter writer = new StringWriter();
            template.evaluate(writer, vars);
            return writer.toString();
        } catch (final PebbleException e) {
            log.error(
                "PebbleException encountered while attempting to render the template. template={}, vars={}",
                pathToTemplate, vars, e);
            throw e;
        } catch (final IOException e) {
            log.error("Error evaluating the Pebble template. template={}, vars={}",
                pathToTemplate, vars, e);
            throw new RuntimeException(e); // TODO: Create our own exception for this.
        }
    }
}
