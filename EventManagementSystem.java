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
        System.out.println("---------------------------");
    }
}

public class CollegeEventManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Event> events = new ArrayList<>();
        int choice;

        do {

            System.out.println("\n===== COLLEGE EVENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Search Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
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

                    events.add(new Event(id,name,date,venue));

                    System.out.println("Event Added Successfully!");
                    break;

                case 2:

                    if(events.isEmpty()) {
                        System.out.println("No events available.");
                    }
                    else {
                        System.out.println("\nEVENT LIST");
                        for(Event e : events) {
                            e.display();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Event ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(Event e : events) {
                        if(e.id == searchId) {
                            System.out.println("Event Found:");
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Event not found.");
                    }
                    break;

                case 4:

                    System.out.print("Enter Event ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for(int i=0;i<events.size();i++) {
                        if(events.get(i).id == deleteId) {
                            events.remove(i);
                            System.out.println("Event Deleted Successfully!");
                            deleted = true;
                            break;
                        }
                    }

                    if(!deleted) {
                        System.out.println("Event not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 5);

        sc.close();
    }
}
