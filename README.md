# java-fundamentals
Lab 01-Java primitives and control flow :
 Main.java - Main class with 
  1- pluralize  
  2- flipping coins
  3- command line clock methods.

Lab 02-Java Roll Dice, create project with gradel init with Contains Duplicates, Calculating Averages and Array of arrays methods.

Lab 03-Maps and File I/O: Maps.java -
In the basiclibrary directory is the Maps class that has a weather meathod that keeps track of weather data with the weatherData method,
and there is a tally function that is used to tally up all of the votes using the tally method,
In the linter directory is the App for the linter. More information in the linter folder.
Lab: 06  Inheritance and Composition - in the inheritance folder I create a Review class and Restaurant class and each class has constructer and some method to deaal with data fealds, and assocciated between them (1from resturant --> many from reviews ) each resturant has many reviews and the review only for one resturant.

lab 07:Interface / i created a shop class and theater class also i created a interface to forcess all classes to extend a review method to reviewable shop,resturant,and theater and here is explaination:
Review Class
The Review class represents a review given by an author for various entities like restaurants, shops, and theaters. It includes properties like body (the review content), author (the reviewer's name), stars (rating from 0 to 5), and entity-specific references (restaurant, shop, theater, and movie).

The class offers multiple constructors to accommodate different review scenarios.
The addReview method updates the average rating for a restaurant, shop, or theater by calculating the total stars and dividing by the number of reviews.
Shop Class
The Shop class models a shop, also implementing the reviewable interface. It includes properties like name, description, numberOfDollar, reviews, and averageRating.

Similar to the restaurant, the addReview method calculates the average rating based on reviews.
The toString method offers a formatted representation of the shop.
Theater Class
The Theater class models a theater, implementing the reviewable interface. It has properties like name, reviews, movies, and averageRating.

The class includes methods to add and remove movies from the list.
The addReview method calculates the average rating based on theater reviews.
The toString method provides a formatted representation of the theater.
Interface reviewable
This interface defines a common structure for classes that can be reviewed. It includes a list of reviews and a method to add reviews.

Testing
The testing section includes JUnit tests to verify the functionality of the classes and their methods.

The tests cover constructor, getter, and setter methods for each class.
Review association with entities (Restaurant, Shop, and Theater) is tested to ensure that reviews are correctly linked and average ratings are calculated.
Tests for movie association in the Theater class and extended functionality of the Review class are also included.