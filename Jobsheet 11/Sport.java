import java.util.Arrays;
import java.util.Scanner;

public class Sport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        String[][] athletes = new String[sports.length][5];

        // Input athlete names
        for (int i = 0; i < sports.length; i++) {
            System.out.println("Enter 5 athletes for " + sports[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = sc.nextLine();
            }
            // Sort each sport’s athletes in ascending order
            Arrays.sort(athletes[i]);
            System.out.println();
        }

        // Display results
        System.out.println("=== Athlete List (Ascending Order) ===");
        for (int i = 0; i < sports.length; i++) {
            System.out.println(sports[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(" - " + athletes[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

  {
    
}

}
