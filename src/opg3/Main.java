package opg3;

public class Main {
    public static void main(String[] args){

        SalesReader sales = new SalesReader();
        sales.readFile();

        System.out.println("Max sales: "+sales.max());
        System.out.println("Average sales: "+sales.average());
        System.out.println("Total sales: "+sales.total());
        System.out.println("Minimum sales: "+sales.min());
        System.out.println("Months with revenue over 40k: "
                + sales.monthsRevenueOver40000());


    }


}
