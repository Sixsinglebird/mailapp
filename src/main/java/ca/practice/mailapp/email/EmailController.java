package ca.practice.mailapp.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmailController {

    @Autowired
    private MailSenderService mailSenderService;

    @PostMapping("/email")
    public void sendEmail(@RequestBody Email email) {
        mailSenderService.saveEmail(email);
        mailSenderService.sendEmail(email);
    }
}
