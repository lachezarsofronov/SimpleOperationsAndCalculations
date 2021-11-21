import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = Double.parseDouble(input.nextLine()); //radius circle

        // Area=π * r * r  // Perimeter= 2 * π *r

        double CalculatedArea = Math.PI * Math.pow(r, 2);
        double CalculatedPerimeter = (2* Math.PI) * r;

        System.out.printf("%.2f\n", CalculatedArea);
        System.out.printf("%.2f\n", CalculatedPerimeter);
    }
}
