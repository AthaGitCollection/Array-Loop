import java.util.Scanner;

public class ArrayAverageScore4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] score = new int[n];

        double passTotal = 0;
        double failTotal = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();

            if (score[i] > 70) {
                passTotal += score[i];
                passCount++;
            } else {
                failTotal += score[i];
                failCount++;
            }
        }

        System.out.println("The average score of students who passed is " + (passTotal / passCount));
        System.out.println("The average score of students who failed is " + (failTotal / failCount));

        sc.close();
    }
}
