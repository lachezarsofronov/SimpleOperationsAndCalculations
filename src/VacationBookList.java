import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Pages = Integer.parseInt(input.nextLine());
        int PagesHeCanReadForHour = Integer.parseInt(input.nextLine());
        int DaysMustFinishBook = Integer.parseInt(input.nextLine());

        int Time = (Pages / PagesHeCanReadForHour) / DaysMustFinishBook;
        System.out.println(Time);

    }
}
