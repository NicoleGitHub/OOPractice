package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {

    LinkedList<Klass> klassLinkedList = new LinkedList<>();

    public LinkedList<Klass> getKlassLinkedList() {
        return klassLinkedList;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klassLinkedList) {
        super(id, name, age);
        this.klassLinkedList = klassLinkedList;
        for (Klass klass : klassLinkedList) {
            klass.setTeacher(new Teacher(id, name, age));
        }
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        if(klassLinkedList.isEmpty()) {
            return String.format( super.introduce() + " I am a Teacher. I teach No Class.");
        }
        String classString = "";

        for(Klass klass:klassLinkedList) {
            if(klass != klassLinkedList.getLast()) {
                classString += klass.getNumber() + ", ";
            }else {
                classString += klass.getNumber();
            }
        }

        return String.format(super.introduce() + " I am a Teacher. I teach Class %s.", classString);

    }

    public String introduceWith(Student student) {
        if(!klassLinkedList.stream().filter(klass -> klass.getNumber()==student.getKlass().getNumber()).collect(Collectors.toList()).isEmpty() ) {
            return String.format(super.introduce() + " I am a Teacher. I teach %s.", student.getName());
        }
        return String.format(super.introduce() + " I am a Teacher. I don't teach %s.", student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return this.getKlassLinkedList();
    }

    public boolean isTeaching(Student jerry) {
        return !klassLinkedList.stream().filter(klass -> klass.getNumber() == jerry.getKlass().getNumber()).collect(Collectors.toList()).isEmpty();
    }
}
