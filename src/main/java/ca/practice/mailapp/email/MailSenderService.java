package ca.practice.mailapp.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String userName;

    public void sendEmail(Email email) {

        SimpleMailMessage message = new SimpleMailMessage();


        message.setFrom(userName);
        message.setTo(email.getTo());
        message.setSubject(email.getSubject());
        message.setText(email.getBody());


        javaMailSender.send(message);

        System.out.println("Mail sent successfully");
    }

}
