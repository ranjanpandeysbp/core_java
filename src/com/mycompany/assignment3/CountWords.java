/*11.	Write a program to count all the words in a user input String.*/

package com.mycompany.assignment3;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Input String to count the number of words");
        String sentence = sc.nextLine();
        //String sentence = "              How are you?              ";
        sentence=sentence.trim();//removing the unwanted whitespaces at the beginning and ending
        System.out.println("Input String without leading and trailing whitespaces is: \""+sentence+"\"");
        if(sentence.isEmpty())//When there is no string entered or only spaces
        {
            System.out.println("No words present in the Input String provided!");
        }
        else// if(sentence.contains(" "))
        {
            String[] words = null;
            //System.out.println("Sentence contains spaces:");
            //words = sentence.split(" ");
            words = sentence.split("[\\h\\s\\v]+");
            /*\h A horizontal whitespace character: [ \t\xA0\u1680\u180e\u2000-\u200a\u202f\u205f\u3000]
            \H A non-horizontal whitespace character: [^\h]
            \s A whitespace character: [ \t\n\x0B\f\r]
            \S A non-whitespace character: [^\s]
            \v A vertical whitespace character: [\n\x0B\f\r\x85\u2028\u2029]
            \V A non-vertical whitespace character: [^\v]*/
            //Below logic considers more than 1 space as a word
            System.out.println("Number of word(s): "+words.length);
            System.out.println("Words are:");
            for(String s: words)
            {
                System.out.println(s);
            }
            /*Needed if regex is "[\\h\\s\\v]", not needed if regex is "[\\h\\s\\v]+"
            //Logic to avoid calculating consecutive spaces as word

            System.out.println("Excluding spaces");
            int count = 0;
            for (String word : words) {
                if (word.length() > 0) {
                    count++;
                    System.out.println(word);
                }
            }
            System.out.println("Number of word(s): "+count);
            */
        }/*
        else
        {
            System.out.println("Sentence does not contain any spaces:");
            System.out.println("Number of word is 1");
            System.out.println("Word is: "+sentence);
        }*/
    }
}
