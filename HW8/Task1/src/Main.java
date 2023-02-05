import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int [] count = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < count.length; i++) {
//            count [i] = new Random().nextInt(10);
        }
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
        System.out.println("\n\n");

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo

        for (int i = count.length-1; i >=0 ; i--) {
            System.out.println(count[i]);
        }
        System.out.println("\n\n");
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo

        for (int i = 0; i < count.length /2; i++) {
            int temp = count [i];
            count [i] = count[count.length-(1+i)];
            count [count.length- (1+i)] = temp;

        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);

        }
    }
}
