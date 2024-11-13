package ca.nl.cna.ethan.drover.Help.Random;

public class Player {

    private Double ID;
    private Integer Level;
    private String Name;

    public Player(Double ID, Integer level, String name) {
        this.ID = ID;
        Level = level;
        Name = name;
    }

    public Double getID() {
        return ID;
    }

    public void setID(Double ID) {
        if (ID >= 0) {
            this.ID = ID;
        }
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        if (level >= 0) {
            Level = level;
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}