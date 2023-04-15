package Replit;

public class ArraysLoops1 {
    public static void main(String[] args) {
        int[] size = new int[11]; // create an array of size 11 to hold the size
        int startYear = 2010; // set the start year to 2010

        // add the size 2010 to 2020 to the array using a for loop
        for (int i = 0; i < 11; i++) {
            size[i] = startYear + i;
        }

        // print all the values in the array
        for (int year : size) {
            System.out.println(year);
        }
    }
}

/*
Write a program that creates an array of integers of size 11.
Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values.

**Example:**

2010
2011
2012
2013
2014
2015
2016
2017
2018
2019
2020
 */