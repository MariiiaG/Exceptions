package Sem3;

/*
* Создайте класс Счетчик, у кот есть метод add(), увеличивающий значение веутренней int переменной на 1.
* Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
* Подумайте, что должно происходить при закрытии этого ресурса?
* Напишите метод для проверки, закрыт ли ресурс.
* При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
* */

import java.io.IOException;

public class Sem3_2_main implements AutoCloseable{
    private static Integer count;

    public Sem3_2_main() {
        count = 0;
    }

    public static void add() throws IOException {
        if (count != null) {
            count ++;
        } else {
            throw new IOException();
        }
    }
    @Override
    public void close() throws Exception {
        count = null;
        System.out.println("Closed");
    }

    public static Integer getCount() throws NullPointerException{
        if (count != null) {
            return count;
        } else {
            throw new NullPointerException();
        }
    }
}
