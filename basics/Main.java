import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {+
        int dogCount = 1;

        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 20;

        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;

        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
             flipNHeads(5);

        clock();
    }

    public static void clock() {
        String firstTime = "";
        int million = 1_000_000;
        double counter = 0;

        while (true) {
            counter++;
            LocalDateTime now = LocalDateTime.now();
            String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if (!currentTime.equals(firstTime)) {
                firstTime = currentTime;
                System.out.println(firstTime + " " + counter / million + " MHz");
                counter = 0;
            }}
  }

    public static void flipNHeads(int n) {
        Random random = new Random();
        int num = 0;
        int heads = 0;
        int tails = 0;

        while (num < n) {
            double ranNum = random.nextDouble();
            if (ranNum < 0.5) {
                System.out.println("tails");
                num = 0; 
                tails++;
            } else {
                System.out.println("heads");
                num++;
                heads++;
            }
            if (tails == 1) {
                num = 0;
                tails = 0;
            }
        }

        System.out.println("It took " + heads + " flips to flip " + n + " heads in a row.");
    }

    public static String pluralize(String word, int num) {
        if (num == 0 || num > 1) {
            return word + "s";
        } else {
            return word;
        }
        



    }
   
 
  
    }
