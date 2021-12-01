package practice09;

public class Person {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public int getId() {
        return id;
    }

    public boolean equals(Object obj){
        return this.id == ((Person)obj).getId();
    }
}