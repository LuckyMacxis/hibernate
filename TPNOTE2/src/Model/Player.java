package Model;

import java.util.ArrayList;

public class Player extends BaseEntity {
    private String name;
    private int nbKOctet;
    private ArrayList<Format> formats = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbKOctet() {
        return nbKOctet;
    }

    public void setNbKOctet(int nbKOctet) {
        this.nbKOctet = nbKOctet;
    }

    public ArrayList<Format> getFormats() {
        return formats;
    }

    public void setFormats(ArrayList<Format> formats) {
        this.formats = formats;
    }
}
