package practice06;

public class Student extends Person {

    private Klass klass;


    public Klass getKlass() {
        return klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format(super.introduce()  + " I am a %s. I am at Class %s.", this.getClass().getSimpleName(), klass.getNumber());
    }
}
