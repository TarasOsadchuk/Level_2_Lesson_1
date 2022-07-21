package com.geekbrains.task_1;

import java.util.Arrays;

public class main_task_1 {

    /**
     * 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
     */

    public static void main(String[] args) {
        String[] names = {"Taras", "Andriy", "Oleg", "Inna"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));

        changeMethod(names, 1, 3);
        changeMethod(numbers, 3, 4);

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));
    }

    public static <T> void changeMethod(T[] array, int oneElement, int twoElement) {
        T arr = array[oneElement];
        array[oneElement] = array[twoElement];
        array[twoElement] = arr;
    }
}
