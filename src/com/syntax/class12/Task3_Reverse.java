package com.syntax.class12;

public class Task3_Reverse {

    public static void main(String[] args) {

        //Create a String and print it in reverse order (Sunday → yadnuS).

        String name = "Basak";

        for (int i=name.length()-1; i >=0; i--) {

            System.out.print(name.charAt(i));
        }
    }
}