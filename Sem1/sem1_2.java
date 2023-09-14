package Sem1;

/*
* Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
* Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например :
* 1) Если длина массива меньше некоторого заданного  минимума, метод возврашает -1, в качестве кода ошибки.
* 2) Если искомый элемент не найден, метод вернет -2 в качестве кода ошибки
* 3) Если вместо массива пришел null, метод вернет -3
* 4) придумайте свои варианты исключительных ситуаций и верните соотв коды ошибок
* Напишите метод, в кот реализуйте взаимодействие с пользователем. Т.е. этот метод запросит искомое число
* у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
* Например, если вернулся -2, пользователю выведется сообщение: "Искомый элемент не найден"
* */
public class sem1_2 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(stringCode(array, 7, 5));
        System.out.println(stringCode(array, 3, 8));
        System.out.println(stringCode(null, 7, 5));
        System.out.println(stringCode(array, 3, 5));
    }

    private static String stringCode(Integer[] array, int len, int value) {
        int code = checkArray(array, len, value);

        if (code == -1) {
            return "Array length(" + array.length + ") is less than the given value of (" + len + ")";
        }
        if (code == -2) {
            return "The given value(" + value + ") not found";
        }
        if (code == -3) {
            return "The array is null";
        }
        return "Index of the given value is " + code;
    }

    public static int checkArray (Integer[] array, int len, int value) {
        if (array == null) {
            return -3;
        }
        if (array.length < len) {
            return -1;
        }
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -2;
    }
}
