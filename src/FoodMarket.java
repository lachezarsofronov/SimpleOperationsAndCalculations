import java.util.Scanner;

public class FoodMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // цената на малините е с 50% по-ниска от тази на ягодите;
        // цената на портокалите е с 40% по-ниска от цената на малините;
        // цената на бананите е с 80% по-ниска от цената на малините.

        double StrawberryPricePerKg = Double.parseDouble(input.nextLine());
        double BannanasInKg = Double.parseDouble(input.nextLine());
        double OrangesInKg = Double.parseDouble(input.nextLine());
        double RaspberryInKg = Double.parseDouble(input.nextLine());
        double StrawberryInKg = Double.parseDouble(input.nextLine());

        double RaspberryPricePerKg = StrawberryPricePerKg / 2;
        double OrangesPricePerKg = RaspberryPricePerKg * 0.60;
        double BanannasPricePerKg = RaspberryPricePerKg * 0.20;
        double TotalPrice = StrawberryPricePerKg * StrawberryInKg + BanannasPricePerKg * BannanasInKg + RaspberryPricePerKg * RaspberryInKg + OrangesPricePerKg * OrangesInKg;
        System.out.printf("%.2f", TotalPrice);


    }
}
