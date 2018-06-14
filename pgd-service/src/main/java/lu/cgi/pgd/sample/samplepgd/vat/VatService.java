package lu.cgi.pgd.sample.samplepgd.vat;

import lu.cgi.pgd.vat.wsdl.CheckVat;
import lu.cgi.pgd.vat.wsdl.CheckVatResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.validation.Valid;

@Service
public class VatService extends WebServiceGatewaySupport
{

    private static final Logger LOG = LoggerFactory.getLogger(VatService.class.getName());


    @Value("${ws.soap.vat.url}")
    private String defaultUri;

    public VatService(@Autowired Jaxb2Marshaller jaxb2Marshaller) {
        this.setMarshaller(jaxb2Marshaller);
        this.setUnmarshaller(jaxb2Marshaller);
        this.setDefaultUri(defaultUri);
    }


    public CheckVatResponse checkVat(CheckVat checkVat) {

        LOG.info("INFO LOG");
        LOG.debug("DEBUG MODE");

        CheckVatResponse ret = (CheckVatResponse) getWebServiceTemplate()
                .marshalSendAndReceive(defaultUri,
                        checkVat,
                        new SoapActionCallback(defaultUri));

        return ret;

    }
}

