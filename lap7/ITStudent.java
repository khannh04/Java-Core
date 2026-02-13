package lap7;

public class ITStudent extends Student {
    double scoreJava;
    double scoreHTML;

    public ITStudent(double scoreJava,double scoreHTML) {
        this.scoreHTML = scoreHTML;
        this.scoreJava = scoreJava;
    }
    @Override
    public double getGrade(){
        return (this.scoreJava * 2 + this.scoreHTML)/3;
    }
}
