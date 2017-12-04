package dsodling.app;

import dsodling.pre.annotation.Xconf;

/**
 *
 * @author Daniel Södling (daniel.sodling@pdsvision.se)
 */
public class AppClass {

    @Xconf("APP_VALUE")
    private static final String APP_PROP = "dsodling.test.app.prop";

}
