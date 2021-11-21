import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //(b1 + b2) * h / 2; trapezoid area

        double b1 = Double.parseDouble(input.nextLine());
        double b2 = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());

        double TrapezoidArea = (b1 + b2) * h / 2;
        System.out.printf("%.2f", TrapezoidArea);
    }
}
