package sale_backend.sale_backend.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "t_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Ad is mecburidir")
    private String name;

    private String surname;

    private String fatherName;

    @Email(message = "mail vacibdir")
    private String email;
    @Transient
    private String SID;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Adresses> adresses;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Child> childs;

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public List<Adresses> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresses> adresses) {
        this.adresses = adresses;
    }

    public List<Child> getChilds() {
        return childs;
    }

    public void setChilds(List<Child> child) {
        this.childs = child;
    }
}
