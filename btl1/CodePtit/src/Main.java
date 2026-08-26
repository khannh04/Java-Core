class Student {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score){
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student(1, "An", 7.5);
        students[1] = new Student(2, "Phuong", 8.2);
        students[2] = new Student(3, "Binh", 9.0);
        students[3] = new Student(4, "Dung", 6.8);

        for (Student s : students){
            s.setName(s.getName().toUpperCase());
        }

        Student maxScore = students[0];
        for (int i = 0; i < students.length; i++){
            if(students[i].getScore() > maxScore.getScore()){
                maxScore = students[i];
            }
        }
        System.out.println("Highest Score is " + maxScore.getName() + " with: " + maxScore.getScore());

        Student maxLength = students[0];
        for (int i = 0; i < students.length; i++){
            if (students[i].getName().length() > maxLength.getName().length()){
                maxLength = students[i];
            }
        }
        System.out.println("Longest name is " + maxLength.getName());

    }
}