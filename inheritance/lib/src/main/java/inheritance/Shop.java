package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements reviewable{
    private String name;private String description; private int numberOfDollar;
    private List<Review> reviews = new ArrayList<>();private double averageRating;


    public Shop(String name, String description, int numberOfDollar) {
        this.name = name;
        this.description = description;
        this.numberOfDollar = numberOfDollar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);

            double totalStars = 0;
            for (Review r : reviews) {
                totalStars += r.getStars();
            }
            this.averageRating = totalStars / reviews.size();
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfDollar() {
        return numberOfDollar;
    }

    public void setNumberOfDollar(int numberOfDollar) {
        this.numberOfDollar = numberOfDollar;
    }
public double getAverageRating(){
        return averageRating;
}
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollar=" + numberOfDollar +
                ", Stars="+averageRating+
                '}';
    }
}
