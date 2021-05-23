package sale_backend.sale_backend.domain;

import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_child")
public class Child extends AbstractInfo {
    private String childName;
    private int childAge;


    public String getChildName() {
        return childName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;


    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
