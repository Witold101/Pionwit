package example;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "example.IHelloWebService")
public class HelloImpl implements IHelloWebService {
    @WebMethod
    public String getHello(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
}
