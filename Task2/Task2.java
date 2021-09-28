package Lesson10.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 строк");
        ArrayList<String> resolve = new ArrayList<String>();
        String result = " ";
        for (int i = 0; i < 5; i++) {
            String x = scanner.nextLine();
            strings.add(x);
        }
        for (String word : strings) {
            result = word.replace("+", "+++");

            resolve.add(result);
        }
        System.out.println(resolve);


    }
}
