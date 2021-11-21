import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String MovieName = input.nextLine();
        int DaysCount = Integer.parseInt(input.nextLine());
        int TicketsCount = Integer.parseInt(input.nextLine());
        double TicketPrice = Double.parseDouble(input.nextLine());
        int CinemaPercent = Integer.parseInt(input.nextLine());

        double TotalPrice = DaysCount * (TicketsCount * TicketPrice);

        double StudioProfit = TotalPrice * CinemaPercent / 100;
        double StudioProfitTotal = TotalPrice - StudioProfit;

        System.out.printf("The profit from the movie %s is %.2f lv.", MovieName, StudioProfitTotal);
    }
}
