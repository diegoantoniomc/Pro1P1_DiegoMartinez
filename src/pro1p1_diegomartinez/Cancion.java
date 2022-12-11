//Diego Martinez
package pro1p1_diegomartinez;

import java.util.ArrayList;

public class Cancion {
    
        private String Name;
        private String Album;
        private String Artist;
        private int Year;
        private int Dur;

    public Cancion(String Name, String Album, String Artist, int Year, int Dur) {
        this.Name = Name;
        this.Album = Album;
        this.Artist = Artist;
        this.Year = Year;
        this.Dur = Dur;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getDur() {
        return Dur;
    }

    public void setDur(int Dur) {
        this.Dur = Dur;
    }


    @Override
    public String toString() {
        return " Cancion: \n"
                + " - Nombre=" + Name + "\n"
                + " - Album=" + Album + "\n"
                + " - Artist=" + Artist + "\n"
                + " - Year=" + Year + "\n"
                + " - Duration=" + Dur + "\n";
    }

}
