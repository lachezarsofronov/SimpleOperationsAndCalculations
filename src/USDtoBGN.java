import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  1 USD = 1.79549 BGN.
        double USD = Double.parseDouble(input.nextLine());
        System.out.println(USD * 1.79549);
    }
}
