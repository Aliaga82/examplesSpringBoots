package sale_backend.sale_backend.service;

import lombok.AllArgsConstructor;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sale_backend.sale_backend.domain.PasswordResetToken;
import sale_backend.sale_backend.domain.User;
import sale_backend.sale_backend.repository.UserRepository;
import sale_backend.sale_backend.util.DateOperation;
import sale_backend.sale_backend.util.EmailImpl;

import java.util.Date;


@Service
@AllArgsConstructor
public class UserSerice {
    private final UserRepository userRepository;
    private final PasswordResetTokenService passwordResetTokenService;

    @Autowired
    private EmailImpl emailsender;

    public User save(User user) {
        return userRepository.save(user);
    }


    public void resetPasswordByUserEmail(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new IllegalArgumentException("USER_NOT_FOUND");
        }
        PasswordResetToken passwordResetToken = genareteOnetimeOtp(user);
        emailsender.sendSimpleMessage("aliaga-82@mail.ru","aliagaageyev@gmail.com ", "Test", passwordResetToken.getCode());
    }

    public PasswordResetToken genareteOnetimeOtp(User userPersistent) {
        PasswordResetToken passwordResetToken = new PasswordResetToken();
        passwordResetToken.setCode(RandomString.make(5));
        passwordResetToken.setUser(userPersistent);
        passwordResetToken.setExpiryDate(DateOperation.increaseDateByDay(1, new Date()));
        return passwordResetTokenService.save(passwordResetToken);
    }

}

