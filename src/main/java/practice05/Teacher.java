package practice05;

public class Teacher extends Person {

    private int klass = 0;


    public int getKlass() {
        return klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }



    @Override
    public String introduce() {
        if(klass == 0) {
            return String.format( super.introduce() + " I am a Teacher. I teach No Class.");
        }
        return String.format(super.introduce() + " I am a Teacher. I teach Class %s.", klass);

    }
}
