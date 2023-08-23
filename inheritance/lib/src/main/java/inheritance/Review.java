package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;
    Restaurant restaurant;
    Shop shop;
    Theater theater;
    private String movie;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;

        if (stars >= 0 && stars <= 5) {
            this.stars = stars;
        } else {
            throw new IllegalArgumentException("Rating should be in the range of [0-5].");
        }


    }
    public Review(String body, String author, int stars,Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.restaurant=restaurant;

        if (stars >= 0 && stars <= 5) {
            this.stars = stars;
        } else {
            throw new IllegalArgumentException("Rating should be in the range of [0-5].");
        }


    }

    public Review(String body, String author, int stars,Shop shop) {
        this.body = body;
        this.author = author;

        if (stars >= 0 && stars <= 5) {
            this.stars = stars;
        } else {
            throw new IllegalArgumentException("Rating should be in the range of [0-5].");
        }

this.shop=shop;    }

    public Review(String body, String author, int stars, Theater theater, String movie) {
        this.body = body;
        this.author = author;

        if (stars >= 0 && stars <= 5) {
            this.stars = stars;
        } else {
            throw new IllegalArgumentException("Rating should be in the range of [0-5].");
        }

        this.theater = theater;
        this.movie = movie;
    }
    public Review(String body, String author, int stars, Theater theater) {
        this.body = body;
        this.author = author;

        if (stars >= 0 && stars <= 5) {
            this.stars = stars;
        } else {
            throw new IllegalArgumentException("Rating should be in the range of [0-5].");
        }

        this.theater = theater;

    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

        public void setStars(int stars) {

        }



    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", stars=" + stars +
                ", body='" + body + '\'' +
                '}';
    }
}
