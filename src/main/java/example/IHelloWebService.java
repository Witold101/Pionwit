package example;

        import org.springframework.stereotype.Service;

        import javax.jws.WebMethod;
        import javax.jws.WebService;
        import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHelloWebService {

    @WebMethod
    String getHello(String from);
}
