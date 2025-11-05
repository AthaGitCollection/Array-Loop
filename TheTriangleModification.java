public class TheTriangleModification {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
     System.out.print("Input some number: ");
        int number = input.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
    

