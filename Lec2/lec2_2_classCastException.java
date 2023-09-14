package Lec2;

/*
* Неверное приведение типов
* */

import java.io.File;

public class lec2_2_classCastException {
    public static void main(String[] args) {
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);
    }
}
