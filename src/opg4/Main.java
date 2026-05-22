package opg4;

import java.util.List;

public class Main {
    public static void main(String[] args){

      List<Notifier>notis = List.of(new SlackNotifier("Gamers channel"),
              new SmsNotifier("7654321"),
              new EmailNotifier("TGG@gmail.com"));

       notifyAll(notis, "GTA VI finally outtt!!");





    }



    static void notifyAll(List<Notifier> notifiers, String message){
        for (Notifier noti: notifiers){
            noti.send(message);
        }

    }

}
