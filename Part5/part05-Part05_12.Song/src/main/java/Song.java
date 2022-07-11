
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (! (compared instanceof Song)) {
            return false;
        }

        // convert object into a Song object
        Song comparedSong = (Song) compared;

        if ((this.artist.equals(comparedSong.artist)) &&
            (this.name.equals(comparedSong.name)) &&
            (this.durationInSeconds == comparedSong.durationInSeconds))
            return true;
        else
            return false;
    }


}
