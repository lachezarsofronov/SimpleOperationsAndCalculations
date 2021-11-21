import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double h = Double.parseDouble(input.nextLine());
        double w = Double.parseDouble(input.nextLine());

        double wInSm = w * 100 - 100; //+removing the coridoor shirochina
        double Workstations = Math.floor(wInSm / 70); //broi mesta na red (po shirochinata)

        double hInSm = h * 100; //duljina na zalata
        double WorkstationLines = Math.floor(hInSm / 120); //broi redove (po duljinata)

        double WorkstationsCount = Workstations * WorkstationLines - 3;
        System.out.printf("%.0f", WorkstationsCount);


    }
}
