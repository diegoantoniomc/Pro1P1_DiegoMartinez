package pro1p1_diegomartinez;

import java.util.ArrayList;

public class Song {
    
    private String Name;
    private String Artist;

    public Song(String Name, String Artist) {
        this.Name = Name;
        this.Artist = Artist;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }
    
    @Override
    public String toString() {
        return  Name + " - "
                +Artist + "\n";
    }
    
}
