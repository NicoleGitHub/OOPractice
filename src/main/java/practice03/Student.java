package practice03;

public class Student extends Person{

    private int klass;


    public int getKlass() {
        return klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format("I am a %s. I am at Class %s.", this.getClass().getSimpleName(), klass);
    }
}
