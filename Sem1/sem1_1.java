package Sem1;

/*
* Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
* Если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки,
* иначе - длину массива
* */

public class sem1_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(checkArray(array, 3));
        System.out.println(checkArray(array, 7));
    }

    public static int checkArray (int[] array, int len) {
        if (array.length < len) {
            return -1;
        }
        return array.length;
    }
}
