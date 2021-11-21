import java.util.Scanner;

public class WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Degree = Double.parseDouble(input.nextLine());
         if (Degree >= 26 && Degree <= 35) {
             System.out.println("Hot");
         } else if (Degree >= 20.1 && Degree <= 25.9) {
             System.out.println("Warm");
         } else if (Degree >= 15 && Degree <= 20) {
             System.out.println("Mild");
         } else if (Degree >= 12 && Degree <= 14.9) {
             System.out.println("Cool");
         } else if (Degree >= 5 && Degree <= 11.9) {
             System.out.println("Cold");
         } else {
             System.out.println("unknown");
         }
    }
}
