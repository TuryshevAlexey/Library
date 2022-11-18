package Employees;

import Person.Person;

public class Cleaner extends Person implements Employee{
    public Cleaner(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void working_time() {
        System.out.println("Уборщица " + getName() + " работает 6 дней в неделю. ");
    }
}
