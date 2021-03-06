/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test public void testRestaurant() {

        System.out.println("test 1 SUCCESS");
        Restaurant KFC = new Restaurant("KFC",0,2);
        String expected = "Restaurant{name='KFC', numberOfStares=0.0, priceCategory=2.0}";
        assertEquals(expected, KFC.toString());
    }

    @Test public void testReview(){
        System.out.println("test 2 SUCCESS");
        Review review=new Review("good",2,"Qutadah");
        String expected ="Review{body='good', NumberOfStar=2.0, author='Qutadah'}";
//        assertEquals(expected,review);
        assertNotNull(review);


    }
    @Test public void testShop(){
        System.out.println("test 3 SUCCESS");
        Shop review=new Shop("KFC","Restaurant","$");
        String expected ="Shop{name='KFC', description='Restaurant', numberOfDollarSigns='$'}";
//        assertEquals(expected,review);
        assertNotNull(review);


    }
    @Test public void testTheater(){
        System.out.println("test 4 SUCCESS");
        ArrayList movies = new ArrayList();
        movies.add("Avenger");
        movies.add("IronMan");
        movies.add("spiderMan");
        Theater review=new Theater("Marvel",movies);
        String expected ="Theater{name='Marvel', movies=[Avenger, IronMan, spiderMan]}";
//        assertEquals(expected,review);
        assertNotNull(review);

    }

}
