package lu.cgi.pgd.sample.samplepgd.vat;

import lu.cgi.pgd.vat.wsdl.CheckVat;
import lu.cgi.pgd.vat.wsdl.CheckVatResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VatControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void checkVatTest() {

        CheckVat checkVat = new CheckVat();
        checkVat.setVatNumber("21747447");
        checkVat.setCountryCode("LU");
        CheckVatResponse body = this.restTemplate.postForObject("/vat/checkvat",checkVat, CheckVatResponse.class);
        assertTrue(body.isValid());
    }
}
