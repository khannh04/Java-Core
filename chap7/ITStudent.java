package chap7;

public class ITStudent extends Student{
    private String language;
    public ITStudent(String language,String id, String name, double price, double tax){
        super(id, name, price, tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

}
