package practice07;

public class Student extends Person {

    private Klass klass;


    public Klass getKlass() {
        return klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass.getLeader()!=null && klass.getLeader().getName().equals(getName())) {
            return String.format(super.introduce()  + " I am a %s. I am Leader of Class %s.", this.getClass().getSimpleName(), klass.getNumber());
        }
        return String.format(super.introduce()  + " I am a %s. I am at Class %s.", this.getClass().getSimpleName(), klass.getNumber());
    }
}
