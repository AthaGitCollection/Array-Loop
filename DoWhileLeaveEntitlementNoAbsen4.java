import java.util.Scanner;

public class DoWhileLeaveEntitlementNoAbsen4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement = 10;
        int numLeave;
        String confirmation;

        do {
            System.out.print("Do you want to take a leave (y/n/t)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("You don’t have enough leave entitlement");
                }
            } 
            else if (confirmation.equalsIgnoreCase("t")) {
                System.out.println("Program stopped by user.");
                break;
            }

        } while (leaveEntitlement > 0);

        input.close();
    }
}
