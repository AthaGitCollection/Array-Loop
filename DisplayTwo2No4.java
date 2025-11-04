import java.util.Scanner;

public class DisplayTwo2No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (int i = 2; i <= numInput; i += 2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
