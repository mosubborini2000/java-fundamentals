package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements reviewable{
    private String name;    private List<Review> reviews = new ArrayList<>();
    private List<String> movies = new ArrayList<>();

    public List<String> getMovies() {
        return movies;
    }

    private double averageRating;

    public Theater(String name) {
        this.name = name;
    }
    public void addMovie(String movie) {
        if(!movies.contains(movie)){
            movies.add(movie);
        }
        else {
            System.out.println("this movie already exist");
        }

    }

    public double getAverageRating() {
        return averageRating;
    }

    public void removeMovie(String movie) {
        if(movies == null) {
            System.out.println("There are no movies in list");
        } else {
            movies.remove(movie);
        }    }

    public String getName() {
        return name;
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);

            double totalStars = 0;
            for (Review r : reviews) {
                totalStars += r.getStars();
            }
            this.averageRating = totalStars / reviews.size();
        }}
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movie='" + movies + '\'' +
                ",Stars="+averageRating+
                '}';
    }


}
