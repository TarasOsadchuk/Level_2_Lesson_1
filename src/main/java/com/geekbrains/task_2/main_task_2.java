package com.geekbrains.task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class main_task_2 {
    /**
     * 2. Написать метод, который преобразует массив в ArrayList;
     */
    public static void main(String[] args) {

        String[] arr_string = {"privet", "ok", "how are you?"};

        System.out.println(Arrays.toString(arr_string));

        ArrayList<String> arrList = method_task_2(arr_string);

        System.out.println(arrList);
    }

    public static <T> ArrayList<T> method_task_2(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
