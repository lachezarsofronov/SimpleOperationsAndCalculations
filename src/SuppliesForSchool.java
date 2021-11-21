import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //• Пакет химикали - 5.80 лв
        //• Пакет маркери - 7.20 лв
        //• Препарат - 1.20 лв (за литър)

        int PackOfPencils = Integer.parseInt(input.nextLine());
        int PackOfMarkers = Integer.parseInt(input.nextLine());
        double LitersOfCleaner = Double.parseDouble(input.nextLine());
        double Discount = Double.parseDouble(input.nextLine());

        double Price = PackOfPencils * 5.80 + PackOfMarkers * 7.20 + LitersOfCleaner * 1.20;
        double FinalPrice = Price - Price * Discount * 0.01;
        System.out.printf("%.3f", FinalPrice);
    }
}
