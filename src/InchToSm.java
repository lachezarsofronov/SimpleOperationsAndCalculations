import java.util.Scanner;

public class InchToSm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double inch = Double.parseDouble(input.nextLine());
        System.out.println(inch * 2.54);
    }
}
