package lu.cgi.pgd.sample.samplepgd.domain.data;

import lu.cgi.pgd.sample.samplepgd.domain.repository.CompagnyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompagnyRepositoryTest {

    @Autowired
    private CompagnyRepository compagnyRepository;


    @Test
    public void shoudVatonErrorTest() {
        Compagny compagny = new Compagny();
        compagny.setName("test");
        compagny.setVatnumber("1222");

        Compagny compagny1 = compagnyRepository.save(compagny);

    }


}
