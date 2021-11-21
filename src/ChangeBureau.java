import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int BitcoinCount = Integer.parseInt(input.nextLine());
        double ChineseJuan = Double.parseDouble(input.nextLine());
        double ComisionTax = Double.parseDouble(input.nextLine());

        //•	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.

        double BitcoinToLev = BitcoinCount * 1168; //bitkoin v leva
        double DollarFromChineseJuan = ChineseJuan * 0.15; //
        double DollarToLev = DollarFromChineseJuan * 1.76;
        double EuroFromLev = (BitcoinToLev + DollarToLev) / 1.95;
        double ComisionTaxMoney = EuroFromLev * (ComisionTax / 100);

        double FinalPrice = EuroFromLev - ComisionTaxMoney;

        System.out.printf("%.2f", FinalPrice);
    }
}
