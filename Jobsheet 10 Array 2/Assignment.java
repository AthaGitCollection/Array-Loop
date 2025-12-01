
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        
        final int Row = 10; 
            final int Column = 6;

            int[][] survey = new int[Row][Column];
                double totalSum = 0.0;
                    Scanner input = new Scanner(System.in);

        
        System.out.println("--- Enter the survey data ---");
        System.out.println("Please enter scores from 1 to 5.");
        for (int i = 0; i < Row; i++) { 
            for (int j = 0; j < Column; j++) { 
                System.out.print("Enter score for Respondent " + (i + 1) + ", Question " + (j + 1) + ": ");
                survey[i][j] = input.nextInt();
                totalSum += survey[i][j]; 
            }
        }

        System.out.println("\n--- Average per Respondent ---");
        for (int i = 0; i < Row; i++) {
            double rowSum = 0.0;
            for (int j = 0; j < Column; j++) {
                rowSum += survey[i][j];
            }
            double rowAverage = rowSum / Column;
            System.out.println("Average for Respondent " + (i + 1) + ": " + rowAverage);
        }

        
        System.out.println("\n--- Average per Question ---");
        for (int j = 0; j < Column; j++) {
            double colSum = 0.0;
            for (int i = 0; i < Row; i++) {
                colSum += survey[i][j];
            }
            double colAverage = colSum / Row;
            System.out.println("Average for Question " + (j + 1) + ": " + colAverage);
        }

        
        System.out.println("\n--- Overall Average ---");
        double totalElements = Row * Column;
        double overallAverage = totalSum / totalElements;
        System.out.println("Overall Average Score: " + overallAverage);

        input.close();
    }
}