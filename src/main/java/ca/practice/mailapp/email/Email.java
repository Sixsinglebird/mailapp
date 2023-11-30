package ca.practice.mailapp.email;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import org.springframework.beans.factory.annotation.Value;

@Entity
public class Email {
    //    the sql being generated by this is invalid... it's not creating the table
    @Id
    @SequenceGenerator(name = "email_sequence", sequenceName = "email_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "email_sequence")
    private long id;

    @Value("${spring.mail.username}")
    private String origin;
    private String recipient;
    private String subject;
    private String body;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
