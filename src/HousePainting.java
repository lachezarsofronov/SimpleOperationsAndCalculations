import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = Double.parseDouble(input.nextLine());
        double y = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());

        double BackWall = x * x;
        double FrontWall = BackWall - (1.2 * 2); // -removed door

        double SideWall = (x * y) - (1.5 * 1.5);

        double RoofSides = (x * y) * 2;
        double RoofTriangles = ((x * h) / 2) * 2;

        double WallsArea = BackWall + FrontWall + (SideWall * 2);
        double RoofArea = RoofSides + RoofTriangles;

        double GreenPaintNeeded = WallsArea / 3.4;
        double RedPaintNeeded = RoofArea / 4.3;

        System.out.printf("%.2f\n", GreenPaintNeeded);
        System.out.printf("%.2f", RedPaintNeeded);
    }
}
