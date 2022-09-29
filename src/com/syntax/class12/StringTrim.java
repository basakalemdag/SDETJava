package com.syntax.class12;

public class StringTrim {

    public static void main(String[] args) {
        String str=" i love java ";

        System.out.println(str);

        System.out.println(str.trim());

        String str2="Java is very easy";

        /*
         * Remove the spaces before and after the
         * String but not the ones which are present in between
         /



        /
         * startsWith=> checks if a String starts with a specific letter or word
         * endsWith=> checks if a String Ends with a specific letter or word
         * contains=> checks if a String Contains a specific letter or word
         */


        System.out.println(str2.startsWith("J"));
        System.out.println(str2.endsWith("y"));
        System.out.println(str2.contains("very"));


         // Method chaining helps us call multiple methods on a single line one method after another


        System.out.println(str2.toLowerCase().contains("very"));

    }
}
