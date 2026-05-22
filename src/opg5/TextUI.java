package opg5;

import java.util.Scanner;

public class TextUI {
    private Scanner scan = new Scanner(System.in);

    public String promptText(String msg){
        System.out.println(msg);
        return scan.nextLine();
    }

}
