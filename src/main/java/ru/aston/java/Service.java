package ru.aston.java;

public class Service {
    private int number;
    private String name;


    public void setNumber(int number) {
        if (number == 7) {

            System.out.println("Привет");

        }
        this.number = number;
    }

    public void setName(String name) {
        if (name == "Вячеслав") {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        this.name = name;
    }


}


