import java.util.Scanner;
public class CinemaWithScanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String next;
        int row;
        int column;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.print("Enter a Name:");
            name = sc.nextLine();
            System.out.print("Enter Row Number:");
            row = sc.nextInt();
            System.out.print("Enter Column Number:");
            column = sc.nextInt();
            sc.nextLine();

            audience [row - 1][column - 1] = name;
            System.out.print("Are there any other audiences to be added? (y/n) : ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }    
}
