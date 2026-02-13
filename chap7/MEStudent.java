package chap7;

public class MEStudent extends Student{
    private String skill;

    public MEStudent(String skill, String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.skill = skill;
    }

}
