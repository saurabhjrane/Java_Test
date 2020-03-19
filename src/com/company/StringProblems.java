package com.company;





public class StringProblems {

    public int LongestWordLength(String str){
       String longestword  = LongestWord(str);
       return longestword.length();

    }
    public int ShortestWordLength(String str) {
        String shortest  = ShortestWord(str);
        return shortest.length();
    }
    public String ShortestWord(String str) {
        if (str.isEmpty())
        {
            return "Invalid Input";
        }
        String[] words = str.split(" ");
        int shortestwordLen = Integer.MAX_VALUE;
        String shortestWord = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();

            if (length < shortestwordLen) {
                shortestwordLen = length;
                shortestWord = word;
            }
        }
        System.out.println("Shortest word: " + shortestWord + " | Length: " + shortestwordLen);
        return  shortestWord ;
    }

    public String LongestWord(String str){
        if (str.isEmpty())
        {
            return "Invalid Input";
        }
        String[] words = str.split(" ");
        int length = 0;

        for (String word : words) {
            if (length < word.length()) {
                length = word.length();
            }
        }

        int index = 0;
        for (int i = 0; i < words.length; ++i) {
            final String current = words[i];
            if (current.length() > words[index].length()) {
                index = i;
            }
        }
        System.out.println( "Longest Word: " + words[index] + " |  Length: " + length);
        return words[index] ;

    }


    public static void main(String args[]) {
           String testString = "The cow jumped over the moon";

           StringProblems str = new StringProblems();

           System.out.println(str.LongestWordLength(testString));
           System.out.println(str.ShortestWordLength(testString));

    }



}
