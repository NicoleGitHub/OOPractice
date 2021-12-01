package practice07;

public class Klass {

    private int number;
    private Person leader;

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
        this.leader = leader;
    }

    public Person getLeader() {
        return leader;
    }
}
