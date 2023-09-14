package Lec2;

public class lec2_5_tryCatch {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 0; // won't be able to change value of 'number' due to the exception
            System.out.println("Это сообщение не будет выведено в консоль");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        System.out.println(number); //
    }
}
