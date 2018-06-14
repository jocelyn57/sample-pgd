package lu.cgi.pgd.sample.samplepgd.domain.repository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lu.cgi.pgd.sample.samplepgd.domain.data.Compagny;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "compagny")
public interface CompagnyRepository extends CrudRepository<Compagny,Long> {

    public Compagny findCompagnyByName(String name);

}
