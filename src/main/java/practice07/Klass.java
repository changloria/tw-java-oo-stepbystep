package practice07;

public class Klass {
    private int klass;
    private Student leader;

    public Klass(int klass){
        this.klass = klass;
    }

    public int getNumber(){
        return klass;
    }

    public String getDisplayName(){
        return "Class " + klass;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public Student getLeader(){
        return leader;
    }
}
