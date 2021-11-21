import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Celsius = Double.parseDouble(input.nextLine());
        double Fahrenheit = (Celsius * 1.8) + 32;
        System.out.printf("%.2f",Fahrenheit);

    }
}
