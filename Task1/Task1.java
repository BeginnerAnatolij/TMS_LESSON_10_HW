package Lesson10.Task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(20);
        numbers.add(55);
        numbers.add(13);
        numbers.add(51);
        numbers.add(93);
        int max1 = Collections.max(numbers);
        int max2 = 0;
        Collections.sort(numbers);
        for (Integer i : numbers) {
            if (i < max1) {
                max2 = i;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
