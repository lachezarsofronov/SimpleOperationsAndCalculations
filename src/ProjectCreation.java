import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Architect = input.nextLine();
        int Projects = Integer.parseInt(input.nextLine());
        int Hours = 3 * Projects;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", Architect, Hours, Projects);
    }
}
