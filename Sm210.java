import java.util.*;

class Movie {
    String title, director, genre;
    int year;
    double rating;

   
    Movie(String title, String director, String genre, int year, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

   
    public String toString() {
        return String.format("| %-20s | %-15s | %-10s | %-4d | %-6.1f |", title, director, genre, year, rating);
    }
}

public class Sm210 {
    static ArrayList<Movie> movies = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("\n--- Movie Collection Manager ---");
            System.out.println("1. Add Movie");
            System.out.println("2. View All Movies");
            System.out.println("3. Remove Movie");
            System.out.println("4. Filter by Genre");
            System.out.println("5. Sort by Rating");
            System.out.println("6. Sort by Title");
            System.out.println("7. Sort by Year");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

           
            switch (choice) {
                case 1: addMovie(); break;
                case 2: viewMovies(); break;
                case 3: removeMovie(); break;
                case 4: filterByGenre(); break;
                case 5: sortByRating(); break;
                case 6: sortByTitle(); break;
                case 7: sortByYear(); break;
                case 8: run = false; break;
                default: System.out.println("Invalid choice. Try again."); break;
            }
        }
    }

    
    static void addMovie() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter director: ");
        String director = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter release year: ");
        int year = scanner.nextInt();
        System.out.print("Enter rating (0-10): ");
        double rating = scanner.nextDouble();
        scanner.nextLine(); 

        movies.add(new Movie(title, director, genre, year, rating));
        System.out.println("Movie added!");
    }

   
    static void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies in the collection.");
            return;
        }
        System.out.println("\n| Title                | Director       | Genre     | Year | Rating |");
        System.out.println("---------------------------------------------------------------------");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

   
    static void removeMovie() {
        System.out.print("Enter movie title to remove: ");
        String title = scanner.nextLine();
        boolean removed = movies.removeIf(movie -> movie.title.equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Movie removed.");
        } else {
            System.out.println("Movie not found.");
        }
    }

    
    static void filterByGenre() {
        System.out.print("Enter genre to filter by: ");
        String genre = scanner.nextLine();
        System.out.println("\nFiltered Movies by Genre (" + genre + "):");
        System.out.println("| Title                | Director       | Genre     | Year | Rating |");
        System.out.println("---------------------------------------------------------------------");
        for (Movie movie : movies) {
            if (movie.genre.equalsIgnoreCase(genre)) {
                System.out.println(movie);
            }
        }
    }

   
    static void sortByRating() {
        movies.sort(Comparator.comparingDouble((Movie m) -> m.rating).reversed());
        System.out.println("\nMovies Sorted by Rating:");
        viewMovies();
    }

   
    static void sortByTitle() {
        movies.sort(Comparator.comparing((Movie m) -> m.title));
        System.out.println("\nMovies Sorted by Title:");
        viewMovies();
    }

   
    static void sortByYear() {
        movies.sort(Comparator.comparingInt((Movie m) -> m.year));
        System.out.println("\nMovies Sorted by Year:");
        viewMovies();
    }
}
