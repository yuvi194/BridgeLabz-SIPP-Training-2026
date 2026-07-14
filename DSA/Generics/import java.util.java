import java.util.LinkedList;
import java.util.Scanner;

class MusicPlaylist {

    private LinkedList<String> recentlyPlayed = new LinkedList<>();

    // Add a newly played song
    public void playSong(String song) {

        recentlyPlayed.addFirst(song);

        // Keep only latest 10 songs
        if (recentlyPlayed.size() > 10) {
            recentlyPlayed.removeLast();
        }

        System.out.println(song + " added to recently played.");
    }

    // Search for a song
    public void searchSong(String song) {

        if (recentlyPlayed.contains(song)) {
            System.out.println(song + " is present in recently played.");
        } else {
            System.out.println(song + " is not present in recently played.");
        }
    }

    // Display recently played songs
    public void displayPlaylist() {

        if (recentlyPlayed.isEmpty()) {
            System.out.println("No songs played yet.");
            return;
        }

        System.out.println("\nRecently Played Songs:");
        for (String song : recentlyPlayed) {
            System.out.println(song);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MusicPlaylist playlist = new MusicPlaylist();

        while (true) {

            System.out.println("\n===== Music Playlist Menu =====");
            System.out.println("1. Play Song");
            System.out.println("2. Search Song");
            System.out.println("3. Display Recently Played");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter song name: ");
                    String song = sc.nextLine();
                    playlist.playSong(song);
                    break;

                case 2:
                    System.out.print("Enter song to search: ");
                    String search = sc.nextLine();
                    playlist.searchSong(search);
                    break;

                case 3:
                    playlist.displayPlaylist();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}