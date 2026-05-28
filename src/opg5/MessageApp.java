package opg5;

import java.util.ArrayList;
import java.util.List;

public class MessageApp {
    private ArrayList<String>messages = new ArrayList<>();
    private TextUI ui;

    public MessageApp(TextUI ui) {
        this.ui = ui;
    }

    public void add(String message){
        messages.add(message);
    }


    public ArrayList<String>listAllMessages(){
        return messages;
    }

    public void start(){
        boolean running = true;

        while (running) {

            System.out.println("\n===MENU===");
            System.out.println("1. Send message.");
            System.out.println("2. Show all messages.");
            System.out.println("3. Exit.");

            String choice = ui.promptText("\nChoose:");
            switch (choice){
                case "1" ->{
                    String msg = ui.promptText("Send message: ");
                    add(msg);
                    System.out.println("Message sent!");
                }
                case "2" ->{
                    List<String>allMessages = listAllMessages();
                    System.out.println("==All Messages ("+ messages.size() +")==\n");
                   for (int i = 0; i < allMessages.size(); i++){
                       System.out.println((i+1) +": "+ allMessages.get(i));
                   }
                }
                case "3" -> running = false;

            }
        }
        }


}


