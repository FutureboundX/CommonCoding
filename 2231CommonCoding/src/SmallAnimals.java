//Stephen Colandro
import java.time.LocalDate;

public class SmallAnimals extends Pet {
    private boolean itBites;

    public SmallAnimals(String name, LocalDate birthdate, double price, String speciesType, boolean itBites) {
    	super(name, birthdate, price, speciesType, itBites ? "Yes" : "No");
        this.itBites = itBites;
    }

    public boolean getItBites() {
        return itBites;
    }

    public void setItBites(boolean itBites) {
        this.itBites = itBites;
        setSpecialFeatureBoolean(itBites);
        setSpecialFeature(itBites ? "Yes" : "No");
    }

    public String toString() {
        return "Small Animal: " + super.toString() + ", itBites=" + itBites;
    }
}