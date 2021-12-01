package practice08;

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

    public void assignLeader(Person leader) {
        if(leader.getKlass().getNumber() != number) {
            System.out.print("It is not one of us.\n");

        }else {
            this.leader = leader;
        }
    }

    public Person getLeader() {
        return leader;
    }

    public void appendMember(Person member) {
        this.leader = member;
    }

}
