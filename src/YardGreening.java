import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //7.61 na m2
        //18% - FinalPrice

        double SquareMeters = Double.parseDouble(input.nextLine());
        double Price = SquareMeters * 7.61;
        double FinalPrice = Price - Price * 0.18;
        double Discount = Price - FinalPrice;

        System.out.printf("The final price is: %.2f lv.\n", FinalPrice);
        System.out.printf("The discount is: %.2f lv.", Discount);
    }
}
