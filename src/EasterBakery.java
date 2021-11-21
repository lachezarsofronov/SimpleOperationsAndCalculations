import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double FlourPricePerKg = Double.parseDouble(input.nextLine());
        double FlourKgCount = Double.parseDouble(input.nextLine());
        double SugarKgCount = Double.parseDouble(input.nextLine());
        double EggshellsCount = Double.parseDouble(input.nextLine());
        int YeastPackCount = Integer.parseInt(input.nextLine());

        //•	цената на килограм захар е с 25% по-ниска от тази на килограм брашно
        //•	цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
        //•	цената на един пакет мая е с 80% по-ниска от цената на килограм захар

        double SugarPricePerKg = FlourPricePerKg * 0.75;
        double EggshellPrice = FlourPricePerKg * 1.1;
        double YeastPricePerPack = SugarPricePerKg * 0.2;

        double Costs = FlourPricePerKg * FlourKgCount + SugarKgCount * SugarPricePerKg + EggshellPrice * EggshellsCount + YeastPackCount * YeastPricePerPack;

        System.out.printf("%.2f", Costs);
    }
}
