import java.util.*;

class Event {
    String title, time, description;

    Event(String title, String time, String description) {
        this.title = title;
        this.time = time;
        this.description = description;
    }

    public String toString() {
        return time + " - " + title + ": " + description;
    }
}

public class Sm29 {
    static TreeMap<String, List<Event>> calendar = new TreeMap<>();

    static void addEvent(String date, String title, String time, String description) {
        calendar.putIfAbsent(date, new ArrayList<>());
        calendar.get(date).add(new Event(title, time, description));
        System.out.println(" Event added on " + date);
    }

    static void removeEvent(String date, String title) {
        if (calendar.containsKey(date)) {
            calendar.get(date).removeIf(e -> e.title.equalsIgnoreCase(title));
            System.out.println(" Event '" + title + "' removed from " + date);
        }
    }

    static void showEvents(String date) {
        System.out.println("\n Events on " + date + ":");
        List<Event> events = calendar.get(date);
        if (events != null && !events.isEmpty()) {
            for (Event e : events) {
                System.out.println(e);
            }
        } else {
            System.out.println("No events found.");
        }
    }

    static void showAllEvents() {
        System.out.println("\n All Upcoming Events:");
        for (String date : calendar.keySet()) {
            System.out.println("\nDate: " + date);
            for (Event e : calendar.get(date)) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        addEvent("2025-06-01", "Nisum Tech Talk", "10:00 AM", "Session on AI Innovations");
        addEvent("2025-06-01", "Nisum Client Call", "3:00 PM", "Status meeting with retail client");
        addEvent("2025-06-05", "Nisum Hackathon", "9:00 AM", "Internal innovation challenge kickoff");
        addEvent("2025-06-10", "Nisum HR Connect", "11:00 AM", "Monthly employee engagement meeting");

        showEvents("2025-06-01");
        removeEvent("2025-06-01", "Nisum Client Call");

        showAllEvents();
    }
}
