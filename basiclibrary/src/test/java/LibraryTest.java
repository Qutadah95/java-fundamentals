/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testDublicatFunction() {
        int[] dublicatArray = {1, 2, 3, 4, 1};
        int[] withOutDublicatArray = {1, 2, 3, 4, 5};
        int[] emptyArray = {};
        assertTrue("test dublicat value for an array", Library.containsDuplicates(dublicatArray));
        assertFalse("test with out dublicat value for an array", Library.containsDuplicates(withOutDublicatArray));
        assertFalse("the array is empty", Library.containsDuplicates(emptyArray));
    }

    @Test
    public void testArrayofArray() {
        int[][] array = {{1, 2, 3, 4, 5, 6}, {1, 2, 5, 6}, {1, 2, 35, 6}, {1, 2, 3, 4,}};
        assertEquals("arrayOfArray", array[2], Library.arrayOfArrays(array));
    }
    @Test
    public void testTally_OneWinner() {
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

        assertEquals("received the most votes!","received the most votes!  [Hedge, Bush, Shrub]", Library.tally(votes));
    }
    @Test
    public void testWeatherData_OneEmptyWeek() {
    int[][] array={  {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}};
    int result=69;
    assertEquals("the test for weather","Never saw temperature: 69" ,Library.arrayOfweather(array));
    }
}
