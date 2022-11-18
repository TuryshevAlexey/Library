package Clients;

import Person.Person;

public class Young extends Person implements Client{
    public Young(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void get_Book() {
        System.out.println("Клиент юного возраста " + getName() + " получил книгу. Пол: " + getSex());
    }
}
