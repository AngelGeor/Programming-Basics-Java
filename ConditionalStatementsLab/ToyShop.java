import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 Намираме общатата цена = Цена на пъзели + Цена за кукли + Цена за мечета + цена за минйиони + цена камиони
        //2. Намираме борят на играчките
        //3. проверяваме дали бороят на играчките е > 50, ако да правим отстъпка
        //4. Изваждаме наема
        //5. правим проверка дали печалбата покрива цената на екскурзията

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzleQuantity = Integer.parseInt(scanner.nextLine());
        int dollQuantity = Integer.parseInt(scanner.nextLine());
        int bearQuantity = Integer.parseInt(scanner.nextLine());
        int minionQuantity = Integer.parseInt(scanner.nextLine());
        int lorryQuantity = Integer.parseInt(scanner.nextLine());


        double puzzlePrice = 2.60;
        double dollPrice = 3.0;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double lorryPrice = 2.0;

        double profit = puzzlePrice * puzzleQuantity + dollPrice * dollQuantity + bearPrice * bearQuantity +
                minionPrice * minionQuantity + lorryPrice * lorryQuantity;

        int toysQuantity = puzzleQuantity + dollQuantity + bearQuantity + minionQuantity + lorryQuantity;

        if (toysQuantity >= 50) {
            profit = profit - 0.25 * profit;
        }

        //Наем = намаля цената с 10%

        profit = profit - 0.1 * profit;

        if (profit >= holidayPrice)  {
            double moneyLeft = profit - holidayPrice;

            System.out.printf("Yes! %.2f lv left.", moneyLeft);

        }else {
            double needMoney = holidayPrice - profit;
            System.out.printf("Not enough money! %.2f lv needed.", needMoney);


        }


    }
}
