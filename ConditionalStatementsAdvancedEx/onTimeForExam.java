import java.util.Scanner;

public class onTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int totalExamMinutes = examHour * 60 + examMinute;
        int totalArrivalMinutes = arrivalHour * 60 + arrivalMinute;

        if (totalExamMinutes == totalArrivalMinutes) {
            System.out.println("On time");

        }else if (totalExamMinutes > totalArrivalMinutes ) {
            if (totalExamMinutes - totalArrivalMinutes <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", totalExamMinutes - totalArrivalMinutes);
            }else {
                System.out.println("Early");
                if (totalExamMinutes - totalArrivalMinutes < 60) {
                    System.out.printf("%d minutes before the start", totalExamMinutes - totalArrivalMinutes);
                }else {
                    examHour = (totalExamMinutes - totalArrivalMinutes) / 60;
                    examMinute = (totalExamMinutes - totalArrivalMinutes) % 60;

                    System.out.printf("%d:%02d hours before the start", examHour, examMinute);
                }

            }

        } else {
            System.out.println("Late");
            if (totalArrivalMinutes - totalExamMinutes <60 ) {
                System.out.printf("%d minutes after the start", totalArrivalMinutes - totalExamMinutes);

            }else {
                examHour = (totalArrivalMinutes - totalExamMinutes) / 60;
                examMinute = (totalArrivalMinutes - totalExamMinutes) % 60;
                System.out.printf("%d:%02d hours after the start", examHour, examMinute);
            }
        }
    }

}
