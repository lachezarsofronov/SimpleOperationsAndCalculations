import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Weather = input.nextLine();

        if (Weather.equals("sunny")) {
            System.out.println("It's warm outside!");
        }
        else {
            System.out.println("It's cold outside!");
        }
    }
}
