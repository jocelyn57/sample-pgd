package lu.cgi.pgd.sample.samplepgd.vat;

import lu.cgi.pgd.vat.wsdl.CheckVat;
import lu.cgi.pgd.vat.wsdl.CheckVatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vat")
public class VatController {

    private final VatService vatService;


    public VatController(@Autowired VatService vatService) {
        this.vatService = vatService;
    }


    @PostMapping(value = "checkvat")
    @ResponseBody
    public CheckVatResponse checkVat(@RequestBody CheckVat checkVat) {

    //    CheckVat checkVat1  = new CheckVat();
     //   checkVat1.setCountryCode(checkVat.getCountryCode());
      //  checkVat1.setVatNumber(checkVat.getVatNumber());

        return vatService.checkVat(checkVat);
    }

}
