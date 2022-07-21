package com.geekbrains.task_3;

public class main_task_3 {

    /**
     * a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
     * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
     * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов
     * и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
     * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
     * которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае
     * (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
     * (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
     * соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
     * которые были в этой коробке;
     * g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        Box<Apple> appleBox2 = new Box<>();

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        appleBox.transfer(appleBox2);
        System.out.println(appleBox.fruitBox);
        System.out.println(appleBox2.fruitBox);
    }
}
