package practice06;

public class Teacher extends Person {

    private Klass klass;


    public Klass getKlass() {
        return klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }



    @Override
    public String introduce() {
        if(klass == null) {
            return String.format( super.introduce() + " I am a Teacher. I teach No Class.");
        }
        return String.format(super.introduce() + " I am a Teacher. I teach Class %s.", klass.getNumber());

    }

    public String introduceWith(Student student) {
        if(klass.getNumber() == student.getKlass().getNumber()) {
            return String.format(super.introduce() + " I am a Teacher. I teach %s.", student.getName());
        }
        return String.format(super.introduce() + " I am a Teacher. I don't teach %s.", student.getName());
    }
}
