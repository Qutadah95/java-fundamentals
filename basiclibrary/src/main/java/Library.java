
import java.util.*;
import java.util.Arrays;


public class Library {

    public static void main(String[] args) {
int[]testArray={1,1};
        roll(6);
        containsDuplicates(testArray);
        calculatingAverages(testArray);

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        arrayOfArrays(weeklyMonthTemperatures);
//        arrayOfweather(weeklyMonthTemperatures);
//        List<String> votes = new ArrayList<>();
//        votes.add("Bush");
//        votes.add("Bush");
//        votes.add("Bush");
//        votes.add("Shrub");
//        votes.add("Hedge");
//        votes.add("Shrub");
//        votes.add("Bush");
//        votes.add("Hedge");
//        votes.add("Bush");
//        tally(votes);
    }



    public static int[] roll(int n){
        System.out.println("--------------------");
        System.out.println("Roll Function\n\n");

        Random randomRoll = new Random();

        int[] arrayOfSide = new int[n];
        int sideOfDice;
        for (int i=0; i<n; i++){
            sideOfDice = randomRoll.nextInt(6);
            arrayOfSide[i]=sideOfDice+1;
            System.out.println(arrayOfSide[i]+",");
        }
        System.out.println("--------------------");
        return arrayOfSide;

    }

    public static boolean containsDuplicates (int[] array) {
        System.out.println("--------------------");
        System.out.println("Contains Duplicates Function\n\n");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {
                if(i !=j){
                if (array[i]==array[j]){
                    System.out.println("true");
                    return true;
                }}
            }
        }
        System.out.println("false");
        return false;
    }

    public static double calculatingAverages (int[] array) {
        System.out.println("--------------------");
        System.out.print(" calculating Averages Function \n\n");

        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println(sum / array.length);
        return sum / array.length;
    }

    public static int[] arrayOfArrays(int[][] array) {
        System.out.println("--------------------");
        System.out.print(" arrayOfArrays Function \n\n");
        ArrayList<Double> arrayOfAvgs = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            double sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            arrayOfAvgs.add(sum / array[i].length);
        }
        Collections.sort(arrayOfAvgs);
        for (int i = 0; i < arrayOfAvgs.size() ; i++) {
            System.out.println( "the averages is = " + arrayOfAvgs.get(i) );
        }
        System.out.println("\n\n The Lowest Average is: " + arrayOfAvgs.get(0) + "\n\n");
        System.out.println(arrayOfAvgs);
        return array[arrayOfAvgs.indexOf(Collections.min(arrayOfAvgs))];

    }

//    public static void arrayOfweather(int [][] weatherInfo) {
//        System.out.println("HashSet");
//
//        HashSet<Integer> weatherTemprture = new HashSet<Integer>();
//        for (int i=0; i<weatherInfo.length; i++){
//            for (int j=0; j<weatherInfo[i].length; j++){
//                weatherTemprture.add(weatherInfo[i][j]);
//            }
//
//        }
//
//        System.out.println(weatherTemprture);
//        List<Integer> list = new ArrayList<Integer>(weatherTemprture);
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        int low = list.get(0);
//        int high = list.get(17);
//        System.out.println("high is "+high);
//        System.out.println("Low is "+low);
//
//        for (int i = low; i < high; i++) {
//            if ( !list.contains(i)) {
//                System.out.println("Never saw temperature: "+i);
//            }
//
//        }
//        System.out.println("--------------------");
//    }
//    public static void tally(List<String> value) {
//
//        System.out.println(value);
//        Set<String> newValues = new HashSet<String>();
//        System.out.println(newValues);
//        for (int i = 0; i < value.size(); i++) {
//            if (newValues.contains(value.get(i)) == false) {
//                newValues.add(value.get(i));
//            }
//        }
//        System.out.println(newValues);
//        for (String i : newValues) {
//            System.out.println(i +" received the most votes!\n");
//        }
//    }

}