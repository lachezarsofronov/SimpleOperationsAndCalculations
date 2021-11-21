import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //•Торта – цената ѝ е 20% от наема на залата
        //• Напитки – цената им е 45% по-малко от тази на тортата
        //• Аниматор – цената му е 1/3 от цената за наема на залата

        double Rent = Double.parseDouble(input.nextLine());

        double Cake = Rent * 0.20;
        double Drinks = Cake - Cake * 0.45;
        double Animator = Rent / 3;
        double FinalPrice = Rent + Cake + Drinks + Animator;
        System.out.printf("%.1f", FinalPrice);
    }
}
