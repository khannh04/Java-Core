package chap6;

public class Student {
    String name;
    Integer id;
    @Override
    public String toString(){
        return "Student [name=" + name + ", id= " + id + "]";
    }
    // constructor
    public Student(String name, Integer id){
        this.name = name;
        this.id = id;
    }
    // getter
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    // setter
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}
