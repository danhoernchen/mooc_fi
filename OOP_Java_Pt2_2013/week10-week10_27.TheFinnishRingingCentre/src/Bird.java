
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getRingingYear() {
        return ringingYear;
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object other) {
        Bird otherBird = (Bird) other;
        return otherBird.getLatinName().equals(this.latinName) && otherBird.getRingingYear() == this.ringingYear;
    }
    
    @Override
    public int hashCode(){
        int result = 12;
        result *= ringingYear;
        return result;
    }
}
