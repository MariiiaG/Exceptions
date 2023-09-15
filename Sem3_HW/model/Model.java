package Sem3_HW.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Model {
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private Character gender;

    public Character getGender() {
        return gender;
    }
    public void setGender(Character gender) throws IllegalArgumentException {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Ошибка ввода - Пол");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) throws IllegalArgumentException {
        if (phoneNumber.matches("\\d+") || phoneNumber.length() > 11) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Ошибка ввода - Номер телефона");
        }
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String data) throws IllegalArgumentException{
        try {
            LocalDate dateOfBirth = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            this.dateOfBirth = dateOfBirth;
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Ошибка ввода - Дата рождения");
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String surname) {
        patronymic = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + patronymic + " " + dateOfBirth + " " + phoneNumber + " " + gender;
    }
}
