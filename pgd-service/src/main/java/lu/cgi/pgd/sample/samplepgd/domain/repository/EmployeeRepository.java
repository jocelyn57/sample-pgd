package lu.cgi.pgd.sample.samplepgd.domain.repository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lu.cgi.pgd.sample.samplepgd.domain.data.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@Api(tags = "employee")
@RepositoryRestResource( path = "employee")
public interface EmployeeRepository extends CrudRepository<Employee,Long> {


    @ApiOperation("find  employee by lastname")
    public Employee findEmployeeByLastName(String lastName);

  //  public Employee findByLastNameAndFirstName(String lastName, String firstName);

   // public List<Employee> findAllByAgeBefore(Integer age);



}
