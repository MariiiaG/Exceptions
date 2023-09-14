package Lec2;

/*
* Обращение к несуществующему объекту
* */

public class lec2_1_nullPointerException {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
