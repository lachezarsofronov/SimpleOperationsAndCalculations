import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String AirlineName = input.nextLine();
        int AdultTicketsCount = Integer.parseInt(input.nextLine());
        int ChildTicketsCount = Integer.parseInt(input.nextLine());
        double NetPriceAdultTicket = Double.parseDouble(input.nextLine());
        double ServeTax = Double.parseDouble(input.nextLine());

        double NetPriceChildTicket = NetPriceAdultTicket - NetPriceAdultTicket * 0.70;
        double TotalPriceChildTicket = NetPriceChildTicket + ServeTax;
        double TotalPriceAdultTicket = NetPriceAdultTicket + ServeTax;

        double Profit = AdultTicketsCount * TotalPriceAdultTicket + ChildTicketsCount * TotalPriceChildTicket;
        double FinalProfit = Profit * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", AirlineName, FinalProfit);
    }
}
