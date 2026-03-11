import java.util.Scanner;

public class EventManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] events = new String[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1.Add Event");
            System.out.println("2.View Events");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (count < 5) {
                    System.out.print("Enter Event Name: ");
                    events[count] = sc.nextLine();
                    count++;
                    System.out.println("Event Added!");
                } else {
                    System.out.println("Event list full!");
                }
            }

            else if (choice == 2) {
                System.out.println("Events List:");
                for (int i = 0; i < count; i++) {
                    System.out.println((i+1) + ". " + events[i]);
                }
            }

        } while (choice != 3);

        System.out.println("Program Ended");
    }
}