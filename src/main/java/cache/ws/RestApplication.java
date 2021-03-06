package cache.ws;

import javax.ws.rs.core.Application;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by qdnguyen on 4/10/16.
 */
public class RestApplication extends Application{

    private Set<Object> singletons;

    public RestApplication() throws IOException {
        HashSet<Object> hs = new HashSet<>();
        hs.add(new RestApi());
        hs.add(new StatusApi());
        singletons = Collections.unmodifiableSet(hs);
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
