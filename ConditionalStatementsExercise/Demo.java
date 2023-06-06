import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double totalTime = distanceInMeters * timeForOneMeter;
        double delay = (totalTime / 15) * 12.5;
        double TotalTimePlusDelay = totalTime + delay;




    }
}
