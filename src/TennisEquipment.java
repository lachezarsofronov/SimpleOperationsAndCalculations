import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int RocketPrice = Integer.parseInt(input.nextLine());
        int RocketsCount = Integer.parseInt(input.nextLine());
        int SneakersPairCount = Integer.parseInt(input.nextLine());

        //•	1 чифт маратонки = 1/6 от цената на една тенис ракета

        double SneakersPrice = RocketPrice / 6.0 ;
        double OtherEquipment = (RocketPrice * RocketsCount + SneakersPairCount * SneakersPrice) * 0.2;
        double TotalPrice = RocketPrice * RocketsCount + OtherEquipment + SneakersPrice * SneakersPairCount;
        double OneEightCosts = Math.floor(TotalPrice / 8);
        double SevenEightsCost = Math.ceil(TotalPrice * 7 / 8);

        System.out.printf("Price to be paid by Djokovic %.0f\n", OneEightCosts);
        System.out.printf("Price to be paid by sponsors %.0f", SevenEightsCost);
    }
}
