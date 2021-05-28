package sale_backend.sale_backend.repository;

import org.springframework.data.repository.CrudRepository;
import sale_backend.sale_backend.domain.PasswordResetToken;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetToken, Long> {

}
