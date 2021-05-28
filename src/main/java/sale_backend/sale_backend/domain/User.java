package sale_backend.sale_backend.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "t_user")
public class User extends AbstractInfo {
    private String username;
    private String password;
}
