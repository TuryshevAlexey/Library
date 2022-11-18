package Clients;

import Person.Person;

public class Middle extends Person implements Client {
    public Middle(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void get_Book() {
        System.out.println("Клиент среднего возраста " + getName() + " получил книгу. Пол: " + getSex());
    }
}
