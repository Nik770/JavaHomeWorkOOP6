package org.example.HomeWork5.model;

public class Names {
    private String[] firstName = new String[] {
            "Иван", "Артем", "Ольга", "Виктория", "Анжела", "Сергей", "Степан", "Григорий", "Евгений", "Петр"
    };
    private String[] secondName = new String[] {
            "Иванов(а)", "Петров(а)", "Сидоров(а)", "Степанов(а)", "Лобанов(а)", "Коротков(а)", "Васильев(а)"
    };

    public String[] getFirstName() {
        return firstName;
    }

    public String[] getSecondName() {
        return secondName;
    }
}