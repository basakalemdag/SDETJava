package com.syntax.class12;

public class Task2_MiddleIndex {

    // Create a String and if the String is not empty perform the following:
    //if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
    //

        public static void main(String[] args) {
        String name = "Basak";

        if (!name.isEmpty()) {

            if (name.length() % 2 != 0 && name.length() >= 3) {

                System.out.println(name.charAt(name.length()/2));
            }
        }

        // Teacher solution:

            String str="hello";
            int length=str.length();
            if(!str.isEmpty()&&length%2!=0&&length>=3) {

                int middleIndex=length/2;
                System.out.println(str.charAt(middleIndex));
            }

    }
}
