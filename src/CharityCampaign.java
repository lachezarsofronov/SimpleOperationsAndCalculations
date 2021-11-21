import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Торта - 45 лв.
        // Гофрета - 5.80 лв.
        // Палачинка - 3.20 лв.

        //1/8 от крайната сума ще бъде използвана за покриване на разходите за продуктите по време на
        // кампанията. Да се напише програма, която изчислява сумата, която е събрана в края на кампанията.

        int Days = Integer.parseInt(input.nextLine());
        int Cookers = Integer.parseInt(input.nextLine());

        int Cakes = Integer.parseInt(input.nextLine());
        int Gophrets = Integer.parseInt(input.nextLine());
        int Pancakes = Integer.parseInt(input.nextLine());

        double CakePrice = Cakes * 45;
        double GophretPrice = Gophrets * 5.80;
        double PankakePrice = Pancakes * 3.20;

        double TotalPrice = (CakePrice + GophretPrice + PankakePrice) * Days * Cookers;
        double Tax = TotalPrice / 8;
        double FinalPrice = TotalPrice - Tax;
        System.out.printf("%.2f", FinalPrice);


    }
}
