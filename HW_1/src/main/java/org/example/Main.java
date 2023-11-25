package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */
public class Main {
    public static void main(String[] args) {
            List<Integer> array = createArray();
            double result = array.stream()
                    .filter(num -> num % 2 == 0)
                    .mapToDouble(Integer::doubleValue)
                    .average()
                    .orElse(0.0);

            System.out.println("Среднее значение четных чисел: " + result);
        }

//        array.stream().filter(num->num%2==0);
//        IntStream.range(1, 5).filter(num->num%2==0).average().ifPresent(System.out::println);

    public static List<Integer> createArray(){
        Random random = new Random();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array.add(random.nextInt(1, 100));
        }
        return array;
    }


}