import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем от конзолата
        // брой дни
        int days = Integer.parseInt(scanner.nextLine());

        //брой сладкари
        int chefs = Integer.parseInt(scanner.nextLine());

        // брой торти
        int cakes = Integer.parseInt(scanner.nextLine());

        //брой гофрети
        int waffles = Integer.parseInt(scanner.nextLine());

        // брой палачинки
        int pancakes = Integer.parseInt(scanner.nextLine());

        //смятаме сумата за всеки от продуките от един сладкар за един ден


        // цената на тортите
        double cakesPrice = cakes * 45;

        // цената на гофретите

        double wafflePrice = waffles * 5.80;

        // цената на палачинките

        double pancakesPrice = pancakes * 3.20;


        //сумата за 1 ден = (цената на тортите + цената на гофретите + цената на палчинките) * брой сладкари

        double sum = (cakesPrice + wafflePrice + pancakesPrice) * chefs;

        // сума от цялата кампания = сумата * брой дни от кампанията

        double sumAll = sum * days;

        // крайна сума = сума от цялата кампания - 0.125 * сумата от цялата кампания

        double sumAfter = sumAll - sumAll*0.125;


        // принтираме като закръглим до втория знак
        //%n = new line
        // %f ; %.0f ; %.2f

        System.out.printf("%.2f", sumAfter);



    }
}
