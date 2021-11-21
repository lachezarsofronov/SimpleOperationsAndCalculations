import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int HallRent = Integer.parseInt(input.nextLine());

        //•	Статуетки  – цената им е 30% по-малка от наема на залата
        //•	Кетъринг – цената му е 15% по-малка от тази на статуетките
        //•	Озвучаване – цената му е 1 / 2 от цената за кетъринг
        double FigurinesPrice = HallRent * 0.7;
        double CateringPrice = FigurinesPrice * 0.85;
        double SoundingPrice = CateringPrice / 2;

        double Costs = HallRent + FigurinesPrice + CateringPrice + SoundingPrice;

        System.out.printf("%.2f", Costs);
    }
}
