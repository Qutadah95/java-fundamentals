public class Shop {

    //name, description, and number of dollar signs

    private String name;
    private String desciption;
    private String numberOfDollarSigns;

    public Shop(String name, String desciption, String numberOfDollarSigns) {
        this.name = name;
        this.desciption = desciption;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
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
                ", desciption='" + desciption + '\'' +
                ", numberOfDollarSigns='" + numberOfDollarSigns + '\'' +
                '}';
    }

}
