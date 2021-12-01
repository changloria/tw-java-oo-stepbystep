package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    Klass klass;
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super (id, name, age);
        this.classes = classes;
        for(Klass newKlass : classes){
            newKlass.setTeacher(this);
        }
    }

    public Teacher(String name, int age, LinkedList<Klass> classes) {
        super (name, age);
        this.classes = classes;
    }

    public Teacher(String name, int age) {
        super (name, age);
    }

    public Teacher(int id, String name, int age) {
        super (id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce() {
        if(classes == null)
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        else
            return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", classes.stream().map(Klass::getNumber).map(String::valueOf).collect(Collectors.joining(", ")));
    }

    public String introduceWith(Student student){
        if (isTeaching(student))
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        else
            return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
    }

    public boolean isTeaching(Student student){
        boolean isTeach = false;
        for (Klass item : classes){
            if(item.isIn(student))
                isTeach = true;
        }
        return isTeach;
    }
}
