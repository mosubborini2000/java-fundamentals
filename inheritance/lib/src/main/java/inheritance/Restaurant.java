package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Restaurant implements reviewable {
    private String name;
    private int priceCategory;
    private double stars;
    private List<Review> reviews = new ArrayList<>();
    private double averageRating;

    public Restaurant(String name, int priceCategory) {
        this.name = name;
//        this.stars = stars;
        this.priceCategory = priceCategory;
        this.averageRating = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public double getStars() {
        return averageRating;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public int getPriceCategory() {
        return priceCategory;
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
//    private void updateAverageRating() {
//        double totalStars = 0;
//        for (Review r : reviews) {
//            totalStars += r.getStars();
//        }
//        this.averageRating = totalStars / reviews.size();
//    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + averageRating +
                ", priceCategory=" + priceCategory +
                '}';
        }
}

