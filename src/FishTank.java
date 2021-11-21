import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Lenght = Integer.parseInt(input.nextLine());
        int Width = Integer.parseInt(input.nextLine());
        int Height = Integer.parseInt(input.nextLine());
        double PercentThigs = Double.parseDouble(input.nextLine());

        double Size = (Lenght * Width * Height);
        double Liters = Size * 0.001;
        PercentThigs *= 0.01;

        double FinalCapacity = Liters - Liters * PercentThigs;
        System.out.printf("%.2f", FinalCapacity);

    }
}
