package opg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SalesReader {
    private String filePath = "src/opg3/sales.csv";
    ArrayList<Integer>sales = new ArrayList<>();

    public void readFile(){
        try (Scanner scan = new Scanner(new File(filePath))) {
            if (scan.hasNextLine()){
                scan.nextLine();
            }

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.isEmpty()) continue;

                String[] values = line.split(",");
                int salesNumber = Integer.parseInt(values[1].trim());
                sales.add(salesNumber);
            }

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public int total(){
        int total = 0;
        for (int t: sales){
            total += t;
        }
        return total;
    }

    public double average(){
        return (double) total() / sales.size();
    }

    public int max(){
        int max = sales.get(0);
        for (int m: sales){
            if (m > max){
                max = m;
            }
        }
        return max;
    }


}
