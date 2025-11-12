import java.util.Scanner;
import java.util.Random;

public class QuizModify {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;    

            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input.nextInt();

                if (answer < number) {
                    System.out.println("small");
                } else if (answer > number) {
                    System.out.println("big");
                } else {
                    System.out.println("Correct");
                    success = true;
                }
            } while (!success);

            System.out.print("Do you want to repeat the game (Y/N): ");
            menu = input.next().charAt(0);

        } while (menu == 'y' || menu == 'Y');
        input.close();
    }   
}
