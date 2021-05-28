package sale_backend.sale_backend.domain;

import lombok.Data;
import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "t_password_reset_code")
public class PasswordResetToken extends AbstractInfo {
    private String code;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private User user;
    private Date expiryDate;
}
