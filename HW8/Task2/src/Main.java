import java.util.Random;


//
//        Далее вам нужно будет вычислить несколько показателей:


public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        //Написать программу, которая сгенерирует случайный вес 10 людям в пределах от 40 до 100 кг.

        int[] age = new int[10];

        // задаем диапазон рандома от 40 до 100
        // (минимальное значение рандома 0, добавив 40 к 0 полуаем нижний порог,
        // но 40 прибавляется и к 101 и получается 141, поэтому меняем на 101-40=61

        for (int i = 0; i < age.length; i++) {
            age [i] = new Random().nextInt(61)+40;}
            for (int i = 0; i < age.length; i++) ;

        //        1. Средний вес всех людей.
        double sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
            System.out.println("Вес человека: " + age[i]);
        }

        //        2. Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно
        int count = 0;
        for (int i = 0; i < age.length; i++) {
            if (age [i] >= 60 && age [i] <= 80) {
            count++;
        }
    }
        System.out.println("Средний вес: "+ sum / age.length);
        System.out.println("Люди с весом от 60 до 80: "+ count);

    }
}
