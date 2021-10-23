import java.util.ArrayList;

public class Theater {
    private String name;
    ArrayList movies=new ArrayList();
ArrayList reviewMovies=new ArrayList();
    public Theater(String name, ArrayList movies) {
        this.name = name;
        this.movies = movies;
    }

    public ArrayList getMovies() {
        return movies;
    }

    public void setMovies(ArrayList movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMovies(String moviesName){
        if ( movies.contains(moviesName)) {
            System.out.println("the movies is fond");
        }else{
            this.movies.add(moviesName);

        }

    }
    public void RemoveMovies(String moviesName){
        this.movies.remove(moviesName);

    }
    public ArrayList<Object> addReview(String name){
        reviewMovies.add(name);
    return reviewMovies;
    }
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
