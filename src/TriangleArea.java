import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());

        double TriangleArea = (a * h) / 2;

        System.out.printf("%.2f", TriangleArea);
    }
}
