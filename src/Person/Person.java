package Person;

public abstract class Person {
    private String name;
    private String sex;

    static {
        System.out.println("\nИнформация по клиентам и сотрудникам:\n");
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
