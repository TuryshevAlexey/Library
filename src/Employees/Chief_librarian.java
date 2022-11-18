package Employees;

import Person.Person;

public class Chief_librarian extends Person implements Employee{
    public Chief_librarian(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void working_time() {
        System.out.println("Главный библиетекарь " + getName() + " работает 4 дня в неделю. ");
    }
}
