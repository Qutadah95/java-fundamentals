import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");


        flipNHeads(2);
        clock();

    }




    public static String pluralize(String animalName, int num) {
        if ( num > 1 ||  num == 0) {
            return animalName + 's';
        } else {
            if (num == 1) {
                return animalName;
            }
        }
        return animalName;
    }


//from w3school https://www.w3schools.com/java/java_math.asp
    public static double Random () {
        return Math.random();
    }

    public static void flipNHeads (int number){
        int headsNumber=0;
        int counter=0;
        while(number!=headsNumber){
            double randomFlips = Random();
            if(randomFlips>=0.5){
                System.out.println("heads");
                headsNumber++;
            } else {
                System.out.println("tails");
                headsNumber=0;
            }
            counter++;
        }
        System.out.println("It took " + counter + " flips to flip " + number + " heads in a row.");

    }

// get helped from https://www.geeksforgeeks.org/ to under stand the logic for the code
// https://www.geeksforgeeks.org/localdatetime-now-method-in-java-with-examples/
    public static void clock() {
        LocalDateTime now = LocalDateTime.now();

        while (true) {
            LocalDateTime current = LocalDateTime.now();
            if (current.getSecond() != now.getSecond()) {
                now = current;
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);


            }

        }


    }
}