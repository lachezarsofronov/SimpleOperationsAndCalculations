import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String FirstName = input.nextLine();
        String LastName = input.nextLine();
        int Age = Integer.parseInt(input.nextLine());
        String Town = input.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", FirstName, LastName, Age, Town);
    }
}
