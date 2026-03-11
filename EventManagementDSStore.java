import java.util.ArrayList;
import java.util.Scanner;

class Event {
    int id;
    String name;
    String date;
    String venue;

    Event(int id, String name, String date, String venue) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.venue = venue;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Venue: " + venue);
        System.out.println("----------------------");
    }
}

public class EventManagementDSStore {

    public static void main(String[] args) {

        ArrayList<Event> events = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n--- College Event Management ---");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Event ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Event Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Event Date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter Event Venue: ");
                    String venue = sc.nextLine();

                    events.add(new Event(id, name, date, venue));
                    System.out.println("Event Added Successfully!");
                    break;

                case 2:
                    if(events.isEmpty()) {
                        System.out.println("No events available.");
                    } else {
                        for(Event e : events) {
                            e.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 3);

    }
}