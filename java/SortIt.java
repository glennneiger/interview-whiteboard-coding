// To compile: javac SortIt.java
// to run: java SortIt
// Created by: Glenn Neiger
// May 16, 2018

import java.util.Arrays;
public class SortIt 
{
    public static String sort(String s) 
    {
        StringBuffer strBuffer = new StringBuffer();
        String[] words = s.split(" ");
        Arrays.sort(words);
        for (String word : words)
        {
            strBuffer.append(word + " ");
        }
        
       return strBuffer.toString();
    }

    public static void main(String[] args){
        System.out.println("Thank you for your time today!");
        String inputStr = "Baylee is the most amazing AE ever I have meet actually and the first Baylee I meet in person at Company XYZ on Wednesday afternoon";
	    System.out.println("Input string: " + inputStr);
        System.out.println("-------------------------------");
        System.out.println("sorted string output\n");
        System.out.println(sort(inputStr));
    }
}