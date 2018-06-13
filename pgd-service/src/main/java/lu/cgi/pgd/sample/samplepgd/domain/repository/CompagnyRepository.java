package lu.cgi.pgd.sample.samplepgd.domain.repository;

import lu.cgi.pgd.sample.samplepgd.domain.data.Compagny;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "data/compagny")
public interface CompagnyRepository extends CrudRepository<Compagny,Long> {

    public Compagny findCompagnyByName(String name);

}
