package ca.practice.mailapp.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmailController {

    @Autowired
    private MailSenderService mailSenderService;

    @GetMapping("/emails")
    public List<Email> getAllEmails() {
        return mailSenderService.getAllEmails();
    }

    @GetMapping("/email")
    public List<Email> getEmailsByPrams(@RequestParam(required = false) String recipient, @RequestParam(required = false) String subject) {
        EmailSearchParameters emailSearchPrams = new EmailSearchParameters();

        emailSearchPrams.setRecipient(recipient);
        emailSearchPrams.setSubject(subject);

        return mailSenderService.findEmailByParameters(emailSearchPrams);
    }

    @PostMapping("/email")
    public void sendEmail(@RequestBody Email email) {
        mailSenderService.saveEmail(email);
        mailSenderService.sendEmail(email);
    }
}
