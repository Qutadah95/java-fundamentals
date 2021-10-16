
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
        arrayOfweather(weeklyMonthTemperatures);
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        tally(votes);
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
        ArrayList<Double> arrayOfAvg = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            double sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            arrayOfAvg.add(sum / array[i].length);
        }
        Collections.sort(arrayOfAvg);
        for (int i = 0; i < arrayOfAvg.size() ; i++) {
            System.out.println( "the averages is = " + arrayOfAvg.get(i) );
        }
        System.out.println("\n\n The Lowest Average is: " + arrayOfAvg.get(0) + "\n\n");
        System.out.println(arrayOfAvg);
        return array[arrayOfAvg.indexOf(Collections.min(arrayOfAvg))];

    }

    public static String arrayOfweather(int [][] arrayOfTemps) {
        System.out.println("\n analyzingWeatherData Method\n");


        Set<Integer> temp = new HashSet<Integer>();

        for (int i = 0; i < arrayOfTemps.length; i++) {
            for (int j = 0; j < arrayOfTemps[i].length; j++) {
                temp.add(arrayOfTemps[i][j]);
            }
        }

        temp = new TreeSet<>(temp);



        Integer[] temperaturesAsAnArray = temp.toArray(new Integer[temp.size()]);

        int high = temperaturesAsAnArray[temperaturesAsAnArray.length-1];
        int low = temperaturesAsAnArray[0];

        System.out.println("\n High: " + high);
        System.out.println("\n Low: " + low);

        System.out.println("\n");

        String tempsNotShown = "";
        for (int i = low; i < high; i++) {
            if(!temp.contains(i)){
                tempsNotShown = "Never saw temperature: " + i;
                System.out.println(tempsNotShown);
            }
        }

        System.out.println(tempsNotShown+"\n");

        return tempsNotShown;
    }
    public static String tally(List<String> votes){

        System.out.println(votes);

        Set<String> repeatedValues = new HashSet<String>();
        int count = 0;
        for (int i = 0; i < votes.size(); i++) {
            System.out.println(votes.get(i));
            if(repeatedValues.contains(votes.get(i))==true){
                count++;
            } else {
                count = 0;
                repeatedValues.add(votes.get(i));
            }
            System.out.println(count);
        }
        System.out.println(repeatedValues);
        String tallyMost = "received the most votes!  "+repeatedValues;
        return tallyMost;
    }

}

