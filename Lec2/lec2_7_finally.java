package Lec2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lec2_7_finally {
    public static void main(String[] args) {
        FileReader test = null;
        try {
            test = new FileReader("test"); // при открытии файла его обязательно потом закрыть-> finally
            test.read();
        } catch (RuntimeException | IOException e) { // если надо одиниково обработать несколько искл-ий
            System.out.println("caught an exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Finally - start");
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Exception while closing the file");
                }
            }
            System.out.println("Finally - finish");
        }
    }
}
