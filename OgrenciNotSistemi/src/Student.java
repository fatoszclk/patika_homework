public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNotes(double note1, double note2, double note3, double sozlu){
        if(note1>=0 && note1<=100) {
            this.course1.note = note1;
        }
        if(note2>=0 && note2<=100) {
            this.course2.note = note2;
        }
        if(note3>=0 && note3<=100) {
            this.course3.note = note3;
        }
        if(sozlu>=0 && sozlu<=100) {
            this.course1.sozlu = sozlu;
            this.course2.sozlu = sozlu;
            this.course3.sozlu = sozlu;
        }
    }

    double calculateAverage(Course c1){
        c1.note = (c1.note*0.8 + c1.sozlu*0.2);
        return c1.note;
    }

    void isPass(){
        if(this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0) {
            System.out.println("Notlar düzgün girilmemiş, hesaplanamadı.");
        }else{
            this.average = (calculateAverage(this.course1) + calculateAverage(this.course2) + calculateAverage(this.course3)) / 3.0;
            if(this.average>55){
                this.isPass = true;
                System.out.println(this.name + " Geçti. Ortalama: " + this.average);
            }else {
                this.isPass = false;
                System.out.println(this.name + " Kaldı. Ortalama: " + this.average);
            }
        }
    }

    void printNote(){
        System.out.println(this.course1.name + " Notu\t: " + this.course1.note);
        System.out.println(this.course2.name + " Notu\t: " + this.course2.note);
        System.out.println(this.course3.name + " Notu\t: " + this.course3.note);
    }

}
