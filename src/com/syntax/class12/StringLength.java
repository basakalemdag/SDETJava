package com.syntax.class12;

public class StringLength {
    public static void main(String[] args) {

        String str = new String("Java");
        String name = "Billie Eilish Pirate Baird O'Connell";

        System.out.println(str.length()); // Counts the number of characters incl. spaces
        System.out.println(name.length());

        if(name.length()>15) {

            System.out.println("Name can't be more than 15 characters");
        }

    }
}
