package Sem3_HW.view;

import java.util.Scanner;

public class View {
    public String NewUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные нового пользователя через пробел: Фамилия Имя Отчество День Рождения(дд.мм.гггг) Номер телефона (без пробелов) Пол(m - мужской или f-женский): ");
        return scanner.nextLine();
    }

    public void Exception(Exception e){
        Exception(e.getMessage());
    }

    public void Exception(String str){
        System.out.println(str);
    }
}
