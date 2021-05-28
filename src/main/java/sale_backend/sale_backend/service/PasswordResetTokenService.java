package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.PasswordResetToken;
import sale_backend.sale_backend.repository.PasswordResetTokenRepository;

@Service
@AllArgsConstructor
public class PasswordResetTokenService {
    private final PasswordResetTokenRepository passwordResetTokenRepository;

    public PasswordResetToken save(PasswordResetToken passwordResetToken){
        return passwordResetTokenRepository.save(passwordResetToken);
    }

}
