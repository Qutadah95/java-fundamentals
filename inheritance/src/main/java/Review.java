public class Review {
    private String body;
    private float  NumberOfStar;
    private String author;


    public Review(String body, float numberOfStar, String author) {

        this.body = body;
        NumberOfStar = numberOfStar;
        this.author = author;


    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public float getNumberOfStar() {
        return NumberOfStar;
    }

    public void setNumberOfStar(Float numberOfStar) {
        NumberOfStar = numberOfStar;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", NumberOfStar=" + NumberOfStar +
                ", author='" + author + '\'' +
                '}';
    }
}
