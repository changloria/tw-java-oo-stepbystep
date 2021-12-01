package practice09;

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
            System.out.print("It is not one of us.\n");
    }

    public Student getLeader(){
        return leader;
    }

    public void appendMember(Student student){
        students.add(student);
    }

    public boolean isIn(Student student){
        return student.getKlass().getNumber() == this.getNumber();
    }
}
