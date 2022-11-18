package Employees;

import Person.Person;

public class Mover extends Person implements Employee{
    public Mover(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void working_time() {
        System.out.println("Грузчик " + getName() + " работает 6 дней в неделю. ");
    }
}
