package lu.cgi.pgd.sample.samplepgd.domain.data;

import org.springframework.lang.UsesJava8;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;


@Entity
public class Compagny {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long societeId;

    @NotNull
    private String vatnumber;

    @NotNull
    @Size(min = 2,max = 50)
    private String name;


    public Long getSocieteId() {
        return societeId;
    }

    public void setSocieteId(Long societeId) {
        this.societeId = societeId;
    }

    public String getVatnumber() {
        return vatnumber;
    }

    public void setVatnumber(String vatnumber) {
        this.vatnumber = vatnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
