package Sem1;

/*
* Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
* Необходимо посчитать и вернуть сумму элементов этого массива.
* При этом накладываем на метод 2 ограничения : 
* - метод может только работать с квадратными массивами (кол-во строк = кол-ву столбцов), и
* - в каждой ячейке может лежать только значение 0 или 1.
* Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке
* */

public class sem1_3 {
    public static void main(String[] args) {
        int [][] array = {{1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}};
        int [][] array1 = {{1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}};
        int [][] array2 = {{1, 0, 1, 0, 1}, {1, 0, 8, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 0, 1}};
        //System.out.println(sumBinaryValue(array));
        System.out.println(sumBinaryValue(array1));
        System.out.println(sumBinaryValue(array2));
    }

    public static int sumBinaryValue (int[][] array) {
        if (array.length != array[0].length) throw new RuntimeException("Массив не квадратный(" + array.length + "x"
         + array[0].length + ")");
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array.length; j ++) {
                if (array[i][j] != 0 && array[i][j] != 1) throw new RuntimeException("Элемент с индексами - " +
                        i + " и " + j + " имеет значение " + array[i][j]);
                sum += array[i][j];
            }
        }
        return sum;
    }
}
