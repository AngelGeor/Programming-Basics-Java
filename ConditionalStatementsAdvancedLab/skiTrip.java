import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        if (days > 0) {
            days = days - 1;
        }
        String typeRoom = scanner.nextLine();
        String feedback = scanner.nextLine();
        double tip;
        double hotelDiscount = 0;

        switch (typeRoom) {
            case "room for one person":
                if (feedback.equals("positive")) {
                    tip = days * 18 * 0.25;
                    System.out.printf("%.2f", days * 18 + tip);
                } else if (feedback.equals("negative")) {
                    tip = days * 18 * 0.10;
                    System.out.printf("%.2f", days * 18 - tip);
                }
                break;

            case "apartment":
                if (days < 10) {
                    hotelDiscount = days * 25 * 0.30;
                } else if (days > 10 && days < 15) {
                    hotelDiscount = days * 25 * 0.35;
                } else if (days > 15) {
                    hotelDiscount = days * 25 * 0.50;
                }
                if (feedback.equals("positive")) {
                    tip = (days * 25 - hotelDiscount) * 0.25;
                    System.out.printf("%.2f", days * 25 - hotelDiscount + tip);
                } else if (feedback.equals("negative")) {
                    tip = (days * 25 - hotelDiscount) * 0.10;
                    System.out.printf("%.2f", days * 25 - hotelDiscount - tip);
                }
                break;

            case "president apartment":
                if (days < 10) {
                    hotelDiscount = days * 35 * 0.10;
                } else if (days > 10 && days < 15) {
                    hotelDiscount = days * 35 * 0.15;
                } else if (days > 15) {
                    hotelDiscount = days * 35 * 0.20;
                }
                if (feedback.equals("positive")) {
                    tip = (days * 35 - hotelDiscount) * 0.25;
                    System.out.printf("%.2f", days * 35 - hotelDiscount + tip);
                } else if (feedback.equals("negative")) {
                    tip = (days * 35 - hotelDiscount) * 0.10;
                    System.out.printf("%.2f", days * 35 - hotelDiscount - tip);
                }
                break;
            default:
                break;
        }
    }
}


