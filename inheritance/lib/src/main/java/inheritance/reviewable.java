package inheritance;

import java.util.ArrayList;
import java.util.List;

public interface reviewable {
     List<Review> reviews = new ArrayList<>();
     void addReview(Review review);

}
