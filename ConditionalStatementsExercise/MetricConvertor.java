import java.util.Scanner;

public class MetricConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String incomingText = scanner.nextLine();
        String outgoingText = scanner.nextLine();

        if (incomingText.equals("mm")) {
            number = number / 1000;

        } else if (incomingText.equals("cm")){
            number = number / 100;
        }
        if (outgoingText.equals("mm")){
            number = number * 1000;
        }else if (outgoingText.equals("cm")) {
            number = number * 100;

        }
        System.out.printf("%.3f", number);
        }
    }


