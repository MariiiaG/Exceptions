package Lec2;

/*
* Неверное преобразование символьной строки в числовой формат
* */

public class lec2_3_numberFormatException {
    public static void main(String[] args) {
        String number = "123qw";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }
}
