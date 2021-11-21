import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double MackerelPricePerKg = Double.parseDouble(input.nextLine());
        double SpratPricePerKg = Double.parseDouble(input.nextLine());

        double BonitoInKg = Double.parseDouble(input.nextLine());
        double HorseMackerelInKg = Double.parseDouble(input.nextLine());
        int    ClamsInKg = Integer.parseInt(input.nextLine());

        double BonitoPrice = MackerelPricePerKg + MackerelPricePerKg * 0.60;
        double HorseMackerelPrice = SpratPricePerKg + SpratPricePerKg * 0.80;

        double TotalPrice = BonitoInKg * BonitoPrice + HorseMackerelInKg * HorseMackerelPrice + ClamsInKg * 7.50;
        System.out.printf("%.2f", TotalPrice);


    }
}
