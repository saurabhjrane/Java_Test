package Test;

import com.company.StringProblems;
import org.junit.*;
import static org.junit.Assert.*;
import com.company.StringProblems.*;

import java.util.*;

public class StringProblemsTest {
    String sampleString = "The cow jumped over the moon";
    String blankString = "";

    @Test
    public void Test_LongestWordLength()
    {
        StringProblems sp = new StringProblems();
        String longestWord = sp.LongestWordLength(sampleString);
        assertEquals( "jumped",longestWord);
  }

    @Test
    public void Test_ShortestWordLength()
    {
        StringProblems sp = new StringProblems();
        String shortWord = sp.ShortestWordLength(sampleString);
        assertEquals("The",shortWord);
    }

    @Test
    public void Test_LongestEmptyLength()
    {
        StringProblems sp = new StringProblems();
        String invalid = sp.LongestWordLength(blankString);
        assertEquals( "Invalid Input",invalid);
    }

    @Test
    public void Test_ShortEmptyLength()
    {
        StringProblems sp = new StringProblems();
        String invalid = sp.ShortestWordLength(blankString);
        assertEquals( "Invalid Input",invalid);
    }

}
