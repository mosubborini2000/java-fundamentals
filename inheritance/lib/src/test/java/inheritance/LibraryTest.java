/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

        @Test
        void restaurantConstructorTest() {
            Restaurant restTest = new Restaurant("Papi",35);
            assertEquals(restTest.getName(), "Papi");
            assertEquals(restTest.getPriceCategory(), 35);

        }
    @Test
    void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Mosuab Restaurant", 4);
        String expected = "Restaurant{name='Mosuab Restaurant', stars=0.0, priceCategory=4}";
        assertEquals(expected, restaurant.toString());
    }

    @Test
    void reviewConstructorTest() {
            Restaurant test=new Restaurant("Mosuab Restaurant", 4);
        Review reviewTest = new Review("Great food", "Mosuab",5,test);
        assertEquals(reviewTest.getBody(), "Great food");
        assertEquals(reviewTest.getAuthor(), "Mosuab");
        assertEquals(reviewTest.getStars(), 5);


    }
    @Test
    void testReviewToString() {
        Restaurant testRestaurant = new Restaurant("Mosuab Restaurant", 4);
        Review reviewTest = new Review("Great food!", "Mosuab", 5, testRestaurant);
        String expected = "Review{author='Mosuab', stars=5, body='Great food!'}";
        assertEquals(expected, reviewTest.toString());
    }
    @Test
    void testRestaurantReviewAssociation() {
        Restaurant testRestaurant = new Restaurant("Test Restaurant", 3);
        Review review = new Review("Delicious dishes", "Alice", 4, testRestaurant);
        testRestaurant.addReview(review);

        assertEquals(4.0, testRestaurant.getStars());

    }
    @Test
    void shopConstructorTest() {
        Shop shop = new Shop("Cool Shop", "A shop that sells cool stuff", 2);
        assertEquals("Cool Shop", shop.getName());
        assertEquals("A shop that sells cool stuff", shop.getDescription());
        assertEquals(2, shop.getNumberOfDollar());
    }
    @Test
    void testShopReviewAssociation() {
        Shop shop = new Shop("Test Shop", "Test description", 3);
        Review review = new Review("Awesome shop!", "Bob", 4, shop);
        shop.addReview(review);

        assertEquals(4.0,shop.getAverageRating());
    }
    @Test
    void theaterConstructorTest() {
        Theater theater = new Theater("CinemaPlex");
        assertEquals("CinemaPlex", theater.getName());
    }
    @Test
    void testTheaterMovieAssociation() {
        Theater theater = new Theater("Test Theater");
        theater.addMovie("Action Movie");
        theater.addMovie("Comedy Movie");

        assertEquals(2, theater.getMovies().size());
        assertTrue(theater.getMovies().contains("Action Movie"));
    }
    @Test
    void testTheaterReviewAssociation() {
        Theater theater = new Theater("Test Theater");
        Review review = new Review("Great movie experience!", "Alice", 5, theater, "Action Movie");
        theater.addReview(review);

        assertEquals(5.0, theater.getAverageRating());
    }



}

