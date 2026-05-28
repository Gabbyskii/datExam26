package opg6;

public class Main {
    public static void main(String[] args){
        Car bmw = new Car("mercedes");

        try {
            bmw.start();
            bmw.start();
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
        bmw.stop();










    }

}
