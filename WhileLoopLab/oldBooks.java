import java.util.Scanner;

public class oldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        int counter = 0;  // брояч на книги

        boolean isFound = false; // когато намерим търсената книга , това става вярно (Тру)

        String nextBook = scanner.nextLine();

        while (!nextBook.equals("No More Books")) {
            if (nextBook.equals(bookName)) {
                isFound = true; //otkrili sme tursenata kniga
                break; //prikliuchva s turseneto
            }
            counter++; //uvelichava ako nqmame "No more books" ili ako nqmame knigata, koqto tursim

            nextBook = scanner.nextLine(); // !!! това кара цикъла да продължава да чете книгите надолу

        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", counter);

        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }




        
    }
}
