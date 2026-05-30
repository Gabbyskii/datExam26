package opg4;

import java.util.List;

public class EmailNotifier implements Notifier {
    private String recipient;

    public EmailNotifier(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public void send(String message) {
        if (message == null){
            throw new IllegalArgumentException("No messages sent yet...");
        }
        System.out.println("Email to " + recipient + ": " + message);
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }



}
