package sale_backend.sale_backend.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailImpl {
    @Autowired

    private JavaMailSender emailSender;

    public void sendSimpleMessage(String from, String to, String subject, String otp) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(otp);
        emailSender.send(message);
    }
}

