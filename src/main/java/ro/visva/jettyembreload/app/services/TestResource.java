package ro.visva.jettyembreload.app.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2015-02-18 | c026ilema | .
 */
@Path("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TestResource
{

//    private Logger log = LogManager.getLogger(TestResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String getHello() throws InterruptedException
    {
//        log.info(">> getHello()");

        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        final String message = "test hello, " + sdf.format(new Date());

//        log.info("<< getHello('{}')", message);

        return message;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello.json")
    public Data getHelloJSON() throws InterruptedException
    {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        final String message = "test hello json, " + sdf.format(new Date());
        return new Data(message);
    }

    public static class Data
    {
        private final String text;

        public Data(String data)
        {
            this.text = data;
        }

        public String getData()
        {
            return text;
        }
    }

}
