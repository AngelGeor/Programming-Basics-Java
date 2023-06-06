import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //четем дължина
        int length = Integer.parseInt(scanner.nextLine());

        // ширина
        int width = Integer.parseInt(scanner.nextLine());

        //височина
        int height = Integer.parseInt(scanner.nextLine());

        //процент
        double percent = Double.parseDouble(scanner.nextLine());

        //пресмятаме обема на аквариума
        int volume = length * width * height;

        // общи литри, които ще се съберат в аквариума ot santimetri v metri - * 0.001
        double liters = volume * 0.001;

        // литрите, необходими за пълен аквариум
        double allLiters = liters * (1 - (percent * 0.01));

        System.out.printf("%.2f", allLiters);







    }
}
