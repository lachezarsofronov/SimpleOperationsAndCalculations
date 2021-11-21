import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //градус = радиан * 180 / π

        double rad = Double.parseDouble(input.nextLine());
        double deg = rad * 180 / Math.PI;
        System.out.printf("%.0f", deg);

    }
}
