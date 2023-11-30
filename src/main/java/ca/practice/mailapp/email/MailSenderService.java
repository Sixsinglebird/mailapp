package ca.practice.mailapp.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private EmailRepository emailRepository;

    public void sendEmail(Email email) {

        SimpleMailMessage message = new SimpleMailMessage();


        message.setFrom(email.getOrigin());
        message.setTo(email.getRecipient());
        message.setSubject(email.getSubject());
        message.setText(email.getBody());


        javaMailSender.send(message);

        System.out.println("Mail sent successfully");
    }

    public void saveEmail(Email email) {
        System.out.println("Recording email to database");
        emailRepository.save(email);
    }

}
