import java.util.Scanner;

public class Building {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //1. етажите от последния към първия
        //2. за всеки един етаж -> стаите от 0 до последната
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        for (int i = floors; i >= 1 ; i--) {
            for (int j = 0; j < rooms; j++) {
                //{буква за тип на стаята}{етаж}{номер на стаята}
                if(i == floors) {
                    System.out.printf("L%d%d ",i, j);
                } else if (i % 2 == 1) {
                    System.out.printf("A%d%d ",i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ",i, j);
                }
            }
            System.out.println();

        }

    }
}
