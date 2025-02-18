package rand2;

import javax.xml.ws.Endpoint;

public class RandPublisher2 {
    public static void main(String[] args) {
        final String url = "http://localhost:8888/RandService?wsdl";
        System.out.println("Publishing RandService at " + url);
        Endpoint.publish(url, new RandImp());
    }
}
