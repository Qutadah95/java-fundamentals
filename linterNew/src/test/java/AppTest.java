/*
 * This Java source file was generated by the Gradle 'init' task.
 */


import org.junit.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.Assert.assertEquals;

class AppTest {

    @Test
    public void  testLinterFunction(){

        Path test1 = Paths.get("C:\\401java\\java-fundamentals\\linterNew\\gates.js");


        String resultOutput ="Line"+3+": Missing semicolon"+"Line"+5+": Missing semicolon"+"Line"+11+": " +
                "Missing semicolon"+"Line"+ 13+": Missing semicolon" +"Line"+15+": Missing semicolon" +"Line"+26+"" +
                ": Missing semicolon"+"Line"+28+": Missing semicolon"+"Line"+32+": Missing semicolon" +"Line"+36+":" +
                " Missing semicolon" +"Line"+40+": Missing semicolon" +"Line"+41+": Missing semicolon" +"Line"+50+":" +
                " Missing semicolon" +"Line"+51+": Missing semicolon" +"Line"+59+": Missing semicolon" +"Line"+60+":" +
                " Missing semicolon" +"Line"+61+": Missing semicolon" +"Line"+62+": Missing semicolon" +"Line"+64+":" +
                " Missing semicolon" +"Line"+70+": Missing semicolon" +"Line"+71+": Missing semicolon" +"Line"+72+":" +
                " Missing semicolon"+"Line"+ 73+": Missing semicolon" +"Line"+74+": Missing semicolon" +"Line"+76+":" +
                " Missing semicolon" +"Line"+77+": Missing semicolon"+"Line"+78+": Missing semicolon" +"Line"+ 79+":" +
                " Missing semicolon" +"Line"+80+": Missing semicolon" +"Line"+82+": Missing semicolon" +"Line"+83+":" +
                " Missing semicolon" +"Line"+84+": Missing semicolon" +"Line"+85+": Missing semicolon" +"Line"+86+":" +
                " Missing semicolon" +"Line"+88+": Missing semicolon" +"Line"+89+": Missing semicolon" +"Line"+90+":" +
                " Missing semicolon" +"Line"+91+": Missing semicolon" +"Line"+92+": Missing semicolon" +"Line"+94+":" +
                " Missing semicolon" +"Line"+95+": Missing semicolon" +"Line"+96+": Missing semicolon" +"Line"+97+":" +
                " Missing semicolon" +"Line"+98+": Missing semicolon" +"Line"+99+": Missing semicolon" +"Line"+100+":" +
                " Missing semicolon" +"Line"+101+": Missing semicolon";

        assertEquals(resultOutput,App.ReadFileScanerLinter(test1));


    }


}