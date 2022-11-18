package Employees;

import Person.Person;

public class Chief_bibliographer extends Person implements Employee{
    public Chief_bibliographer(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void working_time() {
        System.out.println("Главный библиограф " + getName() + " работает 4 дня в неделю. ");
    }
}
