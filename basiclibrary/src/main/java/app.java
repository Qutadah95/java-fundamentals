
import java.util.*;


public class app {

    public static void main(String[] args) {

        roll(6);
        containsDuplicates(10);
        calculatingAverages();
        arrayOfArrays();

    }



    public static void roll(int n){
        System.out.println("--------------------");
        System.out.println("Roll Function\n\n");
        Random randomRoll = new Random();
        ArrayList<Integer> arrayOfSide = new ArrayList<Integer>();
        int sideOfDice;
        for (int i=0; i<n; i++){
            sideOfDice = randomRoll.nextInt(6);
            arrayOfSide.add(sideOfDice);
        }
        System.out.print(arrayOfSide + "\n\n");
        System.out.println("--------------------");
    }

    public static void containsDuplicates (int n) {
        System.out.println("--------------------");
        System.out.println("Contains Duplicates Function\n\n");
        Random randomNumber = new Random();
        ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();
        int number;
        for (int i=0; i<n; i++){
            number = randomNumber.nextInt(n);
            if(arrayOfNumbers.contains(number)){
                System.out.print("Is " + number + " duplicated? " + " true" + "\n\n");
            } else {
                System.out.print("Is " + number + " duplicated? " + " false" + "\n\n");
            }
            arrayOfNumbers.add(number);
        }
        System.out.print( arrayOfNumbers + "\n\n");
        System.out.println("--------------------");
    }

    public static void calculatingAverages () {
        System.out.println("--------------------");
        System.out.print(" calculating Averages Function \n\n");

        int [] arrayOfIntegers = new int [10];
        double sum=0;
        double avg=0;
        Random randomNumber = new Random();
        int numbers;
        for (int i=0; i<arrayOfIntegers.length; i++){
            numbers = randomNumber.nextInt(10);
            arrayOfIntegers[i]=numbers;
            sum+=numbers;

        }
        avg=sum/10;
        System.out.println(" The Average of " + sum + "/10" + " = " + avg);
        System.out.println("--------------------");
    }
    public static void arrayOfArrays() {
        System.out.println("--------------------");
        System.out.print(" arrayOfArrays Function \n\n");
        double sum=0;
        double average=0;
        int index = 0;
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        double arrayOfAverages [] = new double [weeklyMonthTemperatures.length];
        System.out.println("The Averages are : " + "\n\n");
        //for the main array
        for (int i=0; i<weeklyMonthTemperatures.length; i++){
            index=0;
            sum=0;
            //for the sub array
            for (int j=0; j<weeklyMonthTemperatures[i].length; j++){
                sum+=weeklyMonthTemperatures[i][j];
                index++;
            }
            average=sum/index;
            arrayOfAverages[i]=average;
            System.out.println( "the averages is = " + arrayOfAverages[i] );
        }
        Arrays.sort(arrayOfAverages);
        System.out.println(" The Lowest Average is: " + arrayOfAverages[2] + "\n\n");
        System.out.println("--------------------");

    }



}