import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int AnnualTax = Integer.parseInt(input.nextLine());

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double Sneakers = AnnualTax * 0.6;
        double Suit = Sneakers * 0.8;
        double Ball = Suit / 4;
        double Acss = Ball / 5;

        double Costs = AnnualTax + Sneakers + Suit + Ball + Acss;

        System.out.printf("%.2f", Costs);
    }
}
