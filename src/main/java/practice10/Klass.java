package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private Person leader;
    private List<Person> member = new ArrayList<>();
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %s", number);
    }

    public void assignLeader(Person leader) {
        if (!member.contains(leader)) {
            System.out.print("It is not one of us.\n");

        } else {
            if (teacher != null)
                System.out.print(String.format("I am %s. I know %s become Leader of Class %s.\n", teacher.getName(), leader.getName(), number));
            this.leader = leader;
        }
    }

    public Person getLeader() {
        return leader;
    }

    public void appendMember(Person member) {

        this.member.add(member);
        if (teacher != null)
            System.out.print(String.format("I am %s. I know %s has joined Class %s.\n", teacher.getName(), member.getName(), number));
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}