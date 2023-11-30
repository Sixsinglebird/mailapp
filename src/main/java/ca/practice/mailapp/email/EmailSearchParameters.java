package ca.practice.mailapp.email;

public class EmailSearchParameters {
    private String recipient;
    private String subject;

    public EmailSearchParameters() {
    }

    public EmailSearchParameters(String recipient, String subject) {
        this.recipient = recipient;
        this.subject = subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
