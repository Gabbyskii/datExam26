package opg4;

import java.util.List;

public class SmsNotifier implements Notifier {
    private String phoneNumber;

    public SmsNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        if (message.length()> 160){
            message = message.substring(0, 160);
        }
        System.out.println("SMS t0 " + phoneNumber + ": " + message);
    }

}
