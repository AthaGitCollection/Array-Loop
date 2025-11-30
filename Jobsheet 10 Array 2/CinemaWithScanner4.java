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
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {

                while (true) {
                    System.out.print("Enter a Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Row Number (1-4): ");
                    row = sc.nextInt();

                    System.out.print("Enter Column Number (1-2): ");
                    column = sc.nextInt();
                    sc.nextLine();

                
                    if (row < 1 || row > 4 || column < 1 || column > 2) {
                        System.out.println("Seat not available. Enter again.\n");
                        continue;
                    }

                    
                    if (audience[row - 1][column - 1] != null) {
                        System.out.println("Seat already occupied! Choose another.\n");
                        continue;
                    }

                    
                    audience[row - 1][column - 1] = name;

                    System.out.print("Add another audience? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }

            else if (menu == 2) {
                System.out.println("\n AUDIENCE LIST ");

                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {

                        if (audience[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(audience[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            }

            else if (menu == 3) {
                System.out.println("Program finished.");
                break;
            }

            else {
                System.out.println("Invalid menu!");
            }
        }
    }
}
