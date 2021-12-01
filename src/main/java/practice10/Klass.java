package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader;
    private final List<Student> students = new ArrayList<>();
    private Teacher teacher;

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
            if(teacher != null){
                System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n", teacher.getName(), student.getName(), klass));
            }
        else
            System.out.print("It is not one of us.\n");
    }

    public Student getLeader(){
        return leader;
    }

    public void appendMember(Student student){
        students.add(student);
        if(teacher != null)
            System.out.print(String.format("I am %s. I know %s has joined Class %d.\n", teacher.getName(), student.getName(), klass));
    }

    public boolean isIn(Student student){
        return student.getKlass().getNumber() == this.getNumber();
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

