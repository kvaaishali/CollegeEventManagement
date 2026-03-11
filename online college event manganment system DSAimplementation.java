import java.util.Scanner;

class Event {
    int id;
    String name;

    Event(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class EventManagement {

    static Event[] events = new Event[10];
    static int count = 0;

    public static void addEvent(int id, String name) {
        events[count] = new Event(id, name);
        count++;
        System.out.println("Event Added Successfully");
    }

    public static void displayEvents() {
        if (count == 0) {
            System.out.println("No events available");
        } else {
            System.out.println("Event List:");
            for (int i = 0; i < count; i++) {
                System.out.println(events[i].id + " - " + events[i].name);
            }
        }
    }

    public static void searchEvent(int id) {
        for (int i = 0; i < count; i++) {
            if (events[i].id == id) {
                System.out.println("Event Found: " + events[i].name);
                return;
            }
        }
        System.out.println("Event Not Found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add Event");
            System.out.println("2.Display Events");
            System.out.println("3.Search Event");
            System.out.println("4.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Event ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Event Name: ");
                    String name = sc.nextLine();

                    addEvent(id, name);
                    break;

                case 2:
                    displayEvents();
                    break;

                case 3:
                    System.out.print("Enter Event ID to search: ");
                    int searchId = sc.nextInt();
                    searchEvent(searchId);
                    break;

                case 4:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}