package com.bewant2be.demo;

/**
 * Created by user on 7/16/17.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.URLDecoder;
import java.util.Date;


@Path("/hello")
public class Hello {
    // This method is called if TEXT_PLAIN is request
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Jersey";
    }

    // This method is called if XML is request
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }

    // This method is called if HTML is request
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        String current = "  当前时间 : ";
        System.out.println("current="+current);
        try{
            current = URLDecoder.decode(current, "UTF-8");
        }catch (Exception e){
            return "haha";
        }

        return "<html> "
                +  "<head> <meta charset=\"utf-8\"> </head>"
                + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey" + current + new Date()+ "</body></h1>" + "</html> ";
    }


    // This method is called if HTML is request
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayJsonHello() {
        return "{\n" +
                "\"singer\":\"Metallica\",\n" +
                "\"title\":\"Enter Sandman\"\n" +
                "}";
    }
    /*
    */
}
