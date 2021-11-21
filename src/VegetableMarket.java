import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1euro = 1.94lv.

        double PricePerKgVegetables = Double.parseDouble(input.nextLine());
        double PricePerKgFruits = Double.parseDouble(input.nextLine());
        int TotalVegetablesInKg = Integer.parseInt(input.nextLine());
        int TotalFruitsInKg = Integer.parseInt(input.nextLine());

        double TotalPrice = PricePerKgVegetables * TotalVegetablesInKg + PricePerKgFruits * TotalFruitsInKg;
        double PriceInEuro = TotalPrice / 1.94;
        System.out.printf("%.2f", PriceInEuro);
    }
}
