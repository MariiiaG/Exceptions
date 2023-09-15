package Sem2;

/*
* Запишите в файл след строки :
* Анна - 4
* Елена - 5
* Марина - 6
* Владимир - ?
* Константин - ?
* Иван - 4
* Реалтзуйте метод, кот считывает данные из файла в двумерный массив (либо Hashmap). В отдельном методе нужно
* будет пройти по структуре данных, если сохранено значение ?, заменить его на соотв число.
* Если на каком-то месте встречается символ, отличный от ? или числа, бросать подходящее исключение.
* Записать в тот же файл с заменёнными символами ?
* */


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sem2_1 {
    public static String PATH = "/Users/mariagadova/IdeaProjects/Exceptions/Sem2/names.txt";

    public static void main(String[] args) {
        List<String[]> listNames = readToList(PATH);

        replaceQ(listNames);
        writeToFile(listNames);
    }
    public static List<String[]> readToList(String file) {
        List<String[]> result = new ArrayList<>();
        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) != null) {
                String[] tempLine = line.split("=");
                if (!isNum(tempLine[1]) && !tempLine[1].equals("?")) {
                    throw new RuntimeException("Invalid value after '=': " + tempLine[1]);
                }
                result.add(tempLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static boolean isNum(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void replaceQ(List<String[]> list) {
        for (String[] string:list) {
            if (string[1].equals("?"))
                string[1] = String.valueOf(string[0].length());
        }
    }

    public static void writeToFile(List<String[]> list) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(PATH));
            for (String[] item:list) {
                bw.write(item[0] + "=" + item[1]);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
