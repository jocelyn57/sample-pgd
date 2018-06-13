package lu.cgi.pgd.sample.samplepgd.vat;

import lu.cgi.pgd.vat.wsdl.CheckVat;
import lu.cgi.pgd.vat.wsdl.CheckVatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class VatService extends WebServiceGatewaySupport
{


    private String defaultUri="http://ec.europa.eu/taxation_customs/vies/services/checkVatService";

    public VatService(@Autowired Jaxb2Marshaller jaxb2Marshaller) {
        this.setMarshaller(jaxb2Marshaller);
        this.setUnmarshaller(jaxb2Marshaller);
        this.setDefaultUri(defaultUri);
    }


    public CheckVatResponse checkVat(CheckVat checkVat) {
        CheckVatResponse ret = (CheckVatResponse) getWebServiceTemplate()
                .marshalSendAndReceive(defaultUri,
                        checkVat,
                        new SoapActionCallback(defaultUri));

        return ret;

    }
}

