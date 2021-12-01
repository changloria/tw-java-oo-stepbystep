package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader;
    private final List<Student> students = new ArrayList<>();

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
        if(students.contains(student))
            this.leader = student;
        else
            System.out.println("It is not one of us.");
    }

    public Student getLeader(){
        return leader;
    }
}
