import java.util.ArrayList;
import java.util.Scanner;

class Event {
    int id;
    String name;

    Event(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EventManagementSystem {

    public static void main(String[] args) {

        ArrayList<Event> events = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\nOnline College Event Management");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Event ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Event Name: ");
                    String name = sc.nextLine();

                    events.add(new Event(id, name));
                    System.out.println("Event Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nEvent List:");
                    for (Event e : events) {
                        System.out.println("ID: " + e.id + "  Name: " + e.name);
                    }
                    break;

                case 3:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

    }
}