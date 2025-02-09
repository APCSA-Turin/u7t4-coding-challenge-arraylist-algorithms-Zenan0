package com.example.project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"));
        System.out.println(strList);
        System.out.println(Main.moveBWords(strList));

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 3, 0, 4, 1, 3, 2, 4));
        System.out.println(intList);
        int[] newIntList = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        System.out.println(Main.modes(newIntList));
    }
}
