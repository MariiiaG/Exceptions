package Lec3;

/*
* Рядом с try в круглых скобках указывается создаваемый ресурс, который при выходе из блока try должен быть освобождён,
* и не важно будет ли брошено какое-то исключение или нет.
* То есть вся работа по написанию блока finally выполняется автоматически без нашего участия.
* B круглых скобках можно указать только объекты, реализующие интерфейс AutoClosable.
*
* */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lec3_1_tryWithResources {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("Lec3/test.txt"); // can insert multiple
             FileWriter writer = new FileWriter("Lec3/test1.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception : " + e.getClass().getSimpleName());
        }
        System.out.println("Copied successully");
    }
}
