package Clients;

import Person.Person;

public class Senile extends Person implements Client{
    public Senile(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void get_Book() {
        System.out.println("Клиент старческого возраста " + getName() + " получил книгу. Пол: " + getSex());
    }
}
