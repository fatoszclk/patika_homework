public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozlu;

    Course(String name, String prefix, String code){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }
        else
            System.out.println("Öğretmen ve ders uyuşmuyor.");
    }
    void printTeacher(){
        this.teacher.Print();
    }
}
