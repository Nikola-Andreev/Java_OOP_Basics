package C_Inheritance.Exercises.E_OnlineRadioDatabase05;

class Song {

    Song(String artistName, String songName, long minutes, long seconds) {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    private void setSongName(String songName) {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
        }
    }

    private void setArtistName(String artistName) {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
        }
    }

    private void setMinutes(long minutes) {
        if (minutes > 14 || minutes < 0) {
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        }
    }

    private void setSeconds(long seconds) {
        if (seconds > 59 || seconds < 0) {
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }
    }
}