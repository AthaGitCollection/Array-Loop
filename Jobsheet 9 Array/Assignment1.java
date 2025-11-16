import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of student grades: ");
        int count = sc.nextInt();
        
        int[] grades = new int[count];
        int total = 0;
        int highest = 0;
        int lowest = 100;
        
        for(int i = 0; i < count; i++) {
            System.out.print("Enter grade for student " + (i+1) + ": ");
            grades[i] = sc.nextInt();
            total += grades[i];
            
            if(grades[i] > highest) highest = grades[i];
            if(grades[i] < lowest) lowest = grades[i];
        }
        
        double average = (double) total / count;
        
        System.out.println("\nAverage grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        
        System.out.print("All grades: ");
        for(int i = 0; i < count; i++) {
            System.out.print(grades[i]);
            if(i < count - 1) System.out.print(", ");
        }
    }
}