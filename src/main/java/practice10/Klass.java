package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();
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

    public void assignLeader(Student leader) {
        if (!members.contains(leader)) {
            System.out.print("It is not one of us.\n");

        } else {
            if (teacher != null)
                System.out.printf("I am %s. I know %s become Leader of Class %s.\n", teacher.getName(), leader.getName(), number);
            this.leader = leader;
        }
    }

    public Person getLeader() {
        return leader;
    }


    public void appendMember(Student appendMember) {

        this.members.add(appendMember);
        if (teacher != null)
            System.out.printf("I am %s. I know %s has joined Class %s.\n", teacher.getName(), appendMember.getName(), number);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}