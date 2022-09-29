package com.syntax.class11;


public class Car {

    String color = "White";
    String make = "Tesla";
    String model = "S3";
    int year = 2018;
    int Hp = 300;

    void moveForward() {
        System.out.println("Moving forward.....");
    }

    void movebackwards() {
        System.out.println(make + " " + model + " " + year + " is moving backwards.");

    }

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.make = "Honda";
        car1.model = "Accord";
        car1.year = 2012;

        car1.movebackwards();

    }


}
