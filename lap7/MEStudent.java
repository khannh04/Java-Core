package lap7;

public class MEStudent extends Student {
    double scoreCNC;
    double scorePLC;

    public MEStudent(double scoreCNC,double scorePLC) {
        this.scorePLC = scorePLC;
        this.scoreCNC = scoreCNC;
    }
    @Override
    public double getGrade(){
        return (this.scoreCNC + this.scorePLC)/2;
    }
}
