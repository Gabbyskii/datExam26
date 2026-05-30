package opg4;

import java.util.List;

public class SlackNotifier implements Notifier {
    private String channel;

    public SlackNotifier(String channel) {
        this.channel = channel;
    }


    @Override
    public void send(String message) {
        if (message == null){
            throw new IllegalArgumentException("No messages sent yet...");
        }
        System.out.println(channel + ": " + message);
    }


    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }


}
