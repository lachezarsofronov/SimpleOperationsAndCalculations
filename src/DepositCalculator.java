import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double Deposit = Double.parseDouble(input.nextLine());
        int DepositPeriod = Integer.parseInt(input.nextLine());
        double AnnualInterest = Double.parseDouble(input.nextLine());

        double Interest = Deposit * AnnualInterest * 0.01;
        double OneMonthInterest = Interest / 12;
        double Summ = Deposit + DepositPeriod * OneMonthInterest;
        System.out.printf("%.2f", Summ);
    }
}
