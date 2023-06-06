import java.util.Scanner;

public class VacationBooklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четене от конзола

        int pagesNumber = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysNumber = Integer.parseInt(scanner.nextLine());

        // 1. изчисляваме общото време за четене на книгата
        int hoursNeeded = pagesNumber / pagesPerHour;
        int hoursPerDay = hoursNeeded / daysNumber;

        System.out.println(hoursPerDay);


    }
}
