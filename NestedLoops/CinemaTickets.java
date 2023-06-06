import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        int totalTickets = 0;
        int countStudentTickets = 0;
        int countStandardTickets = 0;
        int countKidsTickets = 0;

        while (!film.equals("Finish")) {
            //филм
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int occupiedSeats = 0;
            while (true) {
                String ticketType = scanner.nextLine(); //тип на билета
                if (ticketType.equals("End")) {
                    break;
                }
                totalTickets++;
                occupiedSeats++;
                //проверка за билета
                if (ticketType.equals("student")) {
                    countStudentTickets++;
                } else if (ticketType.equals("standard")) {
                    countStandardTickets++;
                } else if (ticketType.equals("kid")){
                    countKidsTickets++;
                }
                //проверка дали има още свободни места
                if (occupiedSeats >= freeSeats) {
                    break;
                }
                //"student", "standard", "kid"


            }

            double percentTaken = occupiedSeats * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", film, percentTaken);
            film = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        double percentStudent = countStudentTickets * 1.0 / totalTickets * 100;
        System.out.printf("%.2f%% student tickets.%n", percentStudent);
        double percentStandard = countStandardTickets * 1.0 / totalTickets * 100;
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        double percentKids = countKidsTickets * 1.0 / totalTickets * 100;
        System.out.printf("%.2f%% kids tickets.%n", percentKids);




    }
}