package Employees;

import Person.Person;

public class Librarian extends Person implements Employee{
    public Librarian(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void working_time() {
        System.out.println("Библиетекарь " + getName() + " работает 6 дней в неделю. ");
    }
}
