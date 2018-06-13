package lu.cgi.pgd.sample.samplepgd.domain.data;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @NotNull
    @Size(min = 2,max = 50)
    private String firstName;

    @NotNull
    @Size(min = 2,max = 50)
    private String lastName;


    @NotNull
    @Size(min = 16,max = 65)
    private Integer age;


    @OneToOne
    private Compagny compagny;


    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Compagny getCompagny() {
        return compagny;
    }

    public void setCompagny(Compagny compagny) {
        this.compagny = compagny;
    }
}
