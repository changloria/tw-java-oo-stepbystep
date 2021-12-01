package practice08;

public class Teacher extends Person{
    Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super (id, name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super (name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super (name, age);
    }

    public Teacher(int id, String name, int age) {
        super (id, name, age);
    }

    public Klass getKlass(){
        return klass;
    }

    public String introduce() {
        if(klass != null)
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", klass.getDisplayName());
        else
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
    }

    public String introduceWith(Student student){
        if (student.getKlass().getNumber() == klass.getNumber())
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.", getName(), getAge(), student.getName());
        else
            return String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.", getName(), getAge(), student.getName());
    }
}
