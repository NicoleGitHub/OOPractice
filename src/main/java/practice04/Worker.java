package practice04;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return String.format(super.introduce() + " I am a %s. I have a job.",this.getClass().getSimpleName());
    }
}
