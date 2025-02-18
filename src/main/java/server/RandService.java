
package server;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RandService", targetNamespace = "http://rand/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RandService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nextN", targetNamespace = "http://rand/", className = "src.main.java.server.NextN")
    @ResponseWrapper(localName = "nextNResponse", targetNamespace = "http://rand/", className = "src.main.java.server.NextNResponse")
    @Action(input = "http://rand/RandService/nextNRequest", output = "http://rand/RandService/nextNResponse")
    public List<Integer> nextN(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "next1", targetNamespace = "http://rand/", className = "src.main.java.server.Next1")
    @ResponseWrapper(localName = "next1Response", targetNamespace = "http://rand/", className = "src.main.java.server.Next1Response")
    @Action(input = "http://rand/RandService/next1Request", output = "http://rand/RandService/next1Response")
    public int next1();

}
