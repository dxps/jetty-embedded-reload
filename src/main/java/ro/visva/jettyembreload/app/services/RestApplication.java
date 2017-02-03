package ro.visva.jettyembreload.app.services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * <br>
 * 2015-02-20 | ilema | .
 */
@ApplicationPath("/rest")
public class RestApplication extends Application
{

    private Set<Object> singletons = new HashSet<>();

    public RestApplication() {
        singletons.add(new TestResource());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
