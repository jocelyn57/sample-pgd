package lu.cgi.pgd.sample.samplepgd.domain.repository;

import lu.cgi.pgd.sample.samplepgd.domain.data.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource( path = "data/employee")
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    public Employee findByLastName(String lastName);

    public Employee findByLastNameAndFirstName(String employeeId);

    public List<Employee> findAllByAgeBefore(Integer age);



}
