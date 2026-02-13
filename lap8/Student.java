package lap8;

public class Student extends Person{
    private int mark;
    private String grade;
    public Student(String id, String name, int age, int mark){
            super(id, name, age);
            this.mark = mark;
    }
    // getter
    public String getGrade() {
        return grade;
    }
    public int getMark() {
        return mark;
    }
    // setter
    public void setMark(Integer mark) {
        this.mark = mark;
    }
    public void setGrade() {
        if (this.mark < 5) {
            this.grade = "Tach cmnr";
        } else if (this.mark < 6) {
            this.grade = "D";
        } else if (this.mark < 7) {
            this.grade = "C";
        } else if (this.mark < 8) {
            this.grade = "B";
        } else {
            this.grade = "A";
        }
    }
    @Override
    public String toString() {
        return "Student{" + "mark=" + mark + ", grade='" + grade + '\'' + '}';
    }

}
