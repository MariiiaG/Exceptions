package Sem3_HW.controller;

import Sem3_HW.model.Model;
import Sem3_HW.view.View;

import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void NewUser(){
        if(Parse(view.NewUser().split(" "))){
            Save();
        } else {
            NewUser();
        }
    }

    private boolean Parse(String[] dataArray) {
        try {
            for (String userInfo : dataArray) {
                if (userInfo.matches("[а-яА-Яa-zA-Z]+") && !userInfo.equals("m") && !userInfo.equals("f")) {
                    if (userInfo.equals(dataArray[0])) {
                        model.setLastName(userInfo);
                    } else if (userInfo.equals(dataArray[1])) {
                        model.setFirstName(userInfo);
                    } else {
                        model.setPatronymic(userInfo);
                    }
                } else if (userInfo.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {

                    model.setDateOfBirth(userInfo);
                } else if (userInfo.matches("\\d+")) {
                    model.setPhoneNumber(userInfo);
                } else if (userInfo.matches("[mf]")) {
                    model.setGender(userInfo.charAt(0));
                } else {
                    throw new IllegalArgumentException("Ошибка ввода, введите заново :");
                }
            }
        } catch (Exception e) {
            view.Exception(e);
            return false;
        }
        return true;
    }

    private void Save(){
        try (FileWriter writer = new FileWriter(model.getLastName() + ".txt", true)) {
            writer.write(model.toString());
            System.out.println("Сохранено успешно ! ");
        } catch (IOException e) {
            System.err.println("Ошибка записи файла : " + e.getMessage());
        }
    }
}
