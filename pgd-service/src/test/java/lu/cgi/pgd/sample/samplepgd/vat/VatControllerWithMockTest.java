package lu.cgi.pgd.sample.samplepgd.vat;

import lu.cgi.pgd.vat.wsdl.CheckVat;
import lu.cgi.pgd.vat.wsdl.CheckVatResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VatControllerWithMockTest {

    @MockBean
    VatService service;

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void init() {
        CheckVatResponse checkVatResponse = new CheckVatResponse();
        checkVatResponse.setValid(true);
        checkVatResponse.setVatNumber("123456");

        given(this.service.checkVat(any())).willReturn(checkVatResponse);
    }


    @Test
    public void checkVatTest() {

        CheckVat checkVat = new CheckVat();
        checkVat.setVatNumber("21747447");
        checkVat.setCountryCode("LU");
        CheckVatResponse body = this.restTemplate.postForObject("/vat/checkvat",checkVat, CheckVatResponse.class);
        assertTrue(body.isValid());
        assertEquals("should be the same vatNumber", "123456",body.getVatNumber());
    }
}
