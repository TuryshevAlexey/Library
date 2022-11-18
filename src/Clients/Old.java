package Clients;

import Person.Person;

public class Old extends Person implements Client{
    public Old(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void get_Book() {
        System.out.println("Клиент пожилого возраста " + getName() + " получил книгу. Пол: " + getSex());
    }
}
