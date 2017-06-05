package movie;

import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by mufasa on 17. 6. 5.
 */
@Configuration
public class MovieConfiguration {

    public Jaxb2Marshaller mashaller () {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("BoxOfficeAPIService.wsdl");
        return marshaller;
    }

}
