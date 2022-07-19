public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "+9054000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "+9054000000");
        Teacher t3 = new Teacher("Kül Yutmaz", "BIO", "+9054000000");

        Course c1 = new Course("TARIH", "TRH", "101");
        c1.addTeacher(t1);
        Course c2 = new Course("FIZIK", "FZK", "101");
        c2.addTeacher(t2);
        Course c3 = new Course("BIO", "BIO", "101");
        c3.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", c1, c2, c3);
        s1.addBulkExamNotes(100.0, 200.0, 50.0, 100.0);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4", c1, c2, c3);
        s2.addBulkExamNotes(50.0, 100.0, 80.0,80.0);
        s2.isPass();
    }
}
