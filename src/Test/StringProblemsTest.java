ackage Test;

import com.company.StringProblems;
import org.junit.*;
import static org.junit.Assert.*;
import com.company.StringProblems.*;

import java.util.*;

public class StringProblemsTest {
    String sampleString = "The cow jumped over the moon";
    String blankString = "";

    @Test
    public void Test_LongestWord()
    {
        StringProblems sp = new StringProblems();
        String longestWord = sp.LongestWord(sampleString);
        assertEquals( "jumped",longestWord);
  }

    @Test
    public void Test_ShortestWord()
    {
        StringProblems sp = new StringProblems();
        String shortWord = sp.ShortestWord(sampleString);
        assertEquals("The",shortWord);
    }

    @Test
    public void Test_LongestEmpty()
    {
        StringProblems sp = new StringProblems();
        String invalid = sp.LongestWord(blankString);
        assertEquals( "Invalid Input",invalid);
    }

    @Test
    public void Test_ShortEmpty()
    {
        StringProblems sp = new StringProblems();
        String invalid = sp.ShortestWord(blankString);
        assertEquals( "Invalid Input",invalid);
    }

    @Test
    public void Test_LongestWordLength()
    {
        StringProblems sp = new StringProblems();
        int longestWordLen = sp.LongestWordLength(sampleString);
        assertEquals( 6,longestWordLen);
    }


    @Test
    public void Test_ShortestWordLength()
    {
        StringProblems sp = new StringProblems();
        int shortestWorLen = sp.ShortestWordLength(sampleString);
        assertEquals( 3,shortestWorLen);
    }
