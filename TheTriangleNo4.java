import java.util.Scanner;

public class TheTriangleNo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;
        int i = 0;
        String s = "";

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        while (i < numInput) {
            s += " *";
            System.out.println(s);
            i++;
        }

        input.close();
    }
}