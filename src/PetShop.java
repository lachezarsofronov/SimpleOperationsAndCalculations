import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int DogsCount = Integer.parseInt(input.nextLine());
        int OtherAnimals = Integer.parseInt(input.nextLine());
        double FinalPrice = (DogsCount * 2.50) + (OtherAnimals * 4);

        System.out.printf("%.1f lv.", FinalPrice);
    }
}
