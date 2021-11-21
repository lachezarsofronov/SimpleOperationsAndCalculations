import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int PeopleCount = Integer.parseInt(input.nextLine());
        double EnterTax = Double.parseDouble(input.nextLine());
        double OneChairPrice = Double.parseDouble(input.nextLine());
        double OneUmbrellaPrice = Double.parseDouble(input.nextLine());
        double UmbrellaNeeded = Math.ceil(PeopleCount * 0.5);

        double EnterTaxTotal = EnterTax * PeopleCount;
        double ChairPriceTotal = OneChairPrice * (Math.ceil(PeopleCount * 0.75));
        double UmbrellaPriceTotal = OneUmbrellaPrice * UmbrellaNeeded;




        double FinalPrice = EnterTaxTotal + ChairPriceTotal + UmbrellaPriceTotal;
        System.out.printf("%.2f lv.", FinalPrice);
    }
}
