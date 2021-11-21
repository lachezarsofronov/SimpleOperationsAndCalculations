import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int EasterCakes = Integer.parseInt(input.nextLine());
        int Eggshells = Integer.parseInt(input.nextLine());
        int CookiesInKg = Integer.parseInt(input.nextLine());

        //•	Козунак  – 3.20 лв.
        //•	Яйца –  4.35 лв. за кора с 12 яйца
        //•	Курабии – 5.40 лв. за килограм
        //•	Боя за яйца - 0.15 лв. за яйце

        double EasterCakesPrice = EasterCakes * 3.20;
        double EggsshellsPrice = Eggshells * 4.35;
        double CookiesPrice = CookiesInKg * 5.40;
        double EggPaintPrice = (Eggshells * 12) * 0.15;

        double Costs = EasterCakesPrice + EggsshellsPrice + CookiesPrice + EggPaintPrice;

        System.out.printf("%.2f", Costs);
    }
}
