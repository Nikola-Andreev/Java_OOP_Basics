package C_Inheritance.Exercises.E_OnlineRadioDatabase05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        byte number = Byte.valueOf(scan.readLine());
        int totalSeconds = 0;
        int songsCounter = 0;

        for (int i = 0; i < number; i++) {
            String[] songTokens = scan.readLine().split(";");
            try {
                long songMinutes = Long.valueOf(songTokens[2].split(":")[0]);
                long songSeconds = Long.valueOf(songTokens[2].split(":")[1]);
                Song currentSong = new Song(songTokens[0], songTokens[1], songMinutes, songSeconds);
                totalSeconds += songSeconds + (songMinutes * 60);
                songsCounter++;
                System.out.println("Song added.");
            }catch (NumberFormatException e) {
                System.out.println("Invalid song length.");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Songs added: " + songsCounter);
        System.out.println("Playlist length: " + convertSeconds(totalSeconds));
    }

    private static String convertSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}