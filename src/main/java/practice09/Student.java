package practice09;

public class Student extends Person {
    Klass klass;

    public Student(int id, String name, int age, Klass klass){
        super(id, name, age);
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public int getNumber() {
        return klass.getNumber();
    }

    public String introduce() {
        String result = super.introduce() + String.format(" I am a Student.");
        if(klass.getLeader() == this)
            result += String.format(" I am Leader of Class %d.", klass.getNumber());
        else
            result += String.format(" I am at Class %d.", klass.getNumber());
        return result;
    }

}
