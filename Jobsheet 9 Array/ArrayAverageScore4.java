import java.util.Scanner;

public class ArrayAverageScore4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] finalScore = new int[10];
        int passCount = 0;

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            finalScore[i] = sc.nextInt();

            if (finalScore[i] > 70) {
                passCount++;
            }
        }

        System.out.println("Number of students who passed (>70): " + passCount);
        sc.close();
    }
}
