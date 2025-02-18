package rand;

import javax.xml.ws.Endpoint;

public class RandPublisher
{
    public static void main(String[] args){
        final String url = "http://localhost:8080/RandService?wsdl";
        System.out.println("Publishing RandService at " + url);
        Endpoint.publish(url, new RandService());
    }
}
