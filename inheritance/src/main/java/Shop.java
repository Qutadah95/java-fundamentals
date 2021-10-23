import java.util.ArrayList;

public class Shop {

    //name, description, and number of dollar signs

    private String name;
    private String description;
    private String numberOfDollarSigns;
    private ArrayList<Object> ShopReviews =new ArrayList<Object>();

    public Shop(String name, String description, String numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    public Shop() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }

    public void setNumberOfDollarSigns(String numberOfDollarSigns) {
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns='" + numberOfDollarSigns + '\'' +
                '}';
    }
    public ArrayList<Object> addReview(String name, String description, String numberOfDollarSigns){
        ShopReviews.add(name);
        ShopReviews.add(description);
        ShopReviews.add(numberOfDollarSigns);
        return ShopReviews;
    }

}
