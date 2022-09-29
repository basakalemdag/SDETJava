package com.syntax.class12;

import java.util.Scanner;

public class Task4_Substring {
    public static void main(String[] args) {
        // Write a program that reads two people's first names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL

        Scanner scanner=new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String momName = scanner.nextLine();

        System.out.println("Dad’s first name?");
        String dadName = scanner.nextLine();

        System.out.println("Expecting boy or girl?");
        String gender = scanner.next();


        if(gender.equalsIgnoreCase("boy")) {

            System.out.println((dadName.substring(0, dadName.length()/2))+(momName.substring(momName.length()/2)));

        }
        else if(gender.equalsIgnoreCase("girl")) {
            System.out.println((momName.substring(0, momName.length()/2))+(dadName.substring(dadName.length()/2)));

        }
        else {
            System.out.println("Invalid gender");
        }


    }
}