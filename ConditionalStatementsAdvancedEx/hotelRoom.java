import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

       double studioPrice = 0.0;
       double apartmentPrice = 0.0;

       if (month.equals("May") || month.equals("October")) {
           studioPrice = nights * 50;
           apartmentPrice = nights * 65.0;

           if (nights > 14 ) {
               studioPrice = studioPrice - (studioPrice * 0.3);
               apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);



           } else if (nights > 7) {
               studioPrice = studioPrice - (studioPrice * 0.05);
           }

        }else if (month.equals("June") || month.equals("September")) {
           studioPrice = nights * 75.20;
           apartmentPrice = nights * 68.70;

           if (nights > 14) {
               studioPrice = studioPrice - (studioPrice * 0.2);
               apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);

           }

       }else if (month.equals("July") || month.equals("August")) {

           studioPrice = nights * 76.0;
           apartmentPrice = nights * 77.0;

           if (nights > 14){

               apartmentPrice = apartmentPrice - (apartmentPrice * 0.1);

           }
       }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);

    }
}
