import java.util.ArrayList;

public class Restaurant {

    private String name;
    private float numberOfStares;
    private float priceCategory;
    private ArrayList<Object> reviews =new ArrayList<Object>();



    public ArrayList<Object> getReviews() {
        return reviews;
    }
    public Restaurant(String name, float numberOfStares, float priceCategory) {
        this.name = name;
        this.numberOfStares = numberOfStares;
        this.priceCategory = priceCategory;
    }
    public String addReview(String body, float numberOfStar, String author){
        Review oneReview=new Review(body,numberOfStar,author);
//oneReview.setBody(body);
//oneReview.setAuthor(author);
//oneReview.setNumberOfStar(numberOfStar);
        ArrayList <String> oneReviewContent=new ArrayList<>();
        oneReviewContent.add(oneReview.getAuthor());
        oneReviewContent.add(oneReview.getBody());
        String numOfStarsToString=String.valueOf(numberOfStar);
        oneReviewContent.add(numOfStarsToString);
        reviews.add(oneReview);
        return "oneReviewContent";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNumberOfStares() {
        return numberOfStares;
    }

    public void setNumberOfStares(float numberOfStares) {
        this.numberOfStares = numberOfStares;
    }

    public float getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(float priceCategory) {
        this.priceCategory = priceCategory;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStares=" + numberOfStares +
                ", priceCategory=" + priceCategory +
                '}';
    }


}
