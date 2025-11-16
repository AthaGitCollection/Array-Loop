import java.util.Scanner;

public class AssignmentCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"}; 

        System.out.print("How many orders do you want to make? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] orderNames = new String[n];
        int[] orderPrices = new int[n];
        int total = 0;

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nOrder #" + (i + 1));
            System.out.print("Enter food/drink name: ");
            orderNames[i] = sc.nextLine();

           
            boolean found = false;
            for (int j = 0; j < menu.length; j++) {
                if (orderNames[i].equalsIgnoreCase(menu[j])) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print("Enter the price: ");
                orderPrices[i] = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Sorry, that item is not on the menu.");
                orderPrices[i] = 0;
            }
        }

        System.out.println("\n LIST OF ORDERS ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + orderNames[i] + " - Rp" + orderPrices[i]);
            total += orderPrices[i];
        }

        System.out.println("----------------------------");
        System.out.println("Total cost: Rp" + total);
    }
}