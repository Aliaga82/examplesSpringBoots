package sale_backend.sale_backend.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_user_role")
public class Role {
    @Id
    @Basic(optional = false)
    private Long id;

    @Column
    private String name;
}
