package com.syntax.class11;

public class Phones {

    // Create a Class “Phone”. Create 2 Objects of it: iPhone, Pixel with specific  attributes and behaviors.

    String make;
    String model;
    String color;
    int storage;
    double size;
    int price;
    boolean affordable;

    void facetime() {
        System.out.println("Facetiming friends");
    }

    void playGames() {
        System.out.println("Playing games");
    }

        public static void main (String[]args){

            Phones iphone = new Phones();

            iphone.make = "Apple";
            iphone.model = "Iphone 14 Pro Max";
            iphone.color = "Black";
            iphone.storage = 128;
            iphone.size = 6.8;
            iphone.affordable = false;

            iphone.facetime();

         System.out.println("***********");

            Phones pixel = new Phones();

            pixel.make = "Google";
            pixel.model = "Pixel 10";
            pixel.color = "Rose Gold";
            pixel.storage = 64;
            pixel.size = 7.5;
            pixel.affordable = true;

            pixel.playGames();

        }

    }

