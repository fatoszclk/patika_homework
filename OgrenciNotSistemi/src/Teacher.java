public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void Print(){
        System.out.println("Name\t: " + this.name);
        System.out.println("Branch\t: " + this.branch);
        System.out.println("Mobile Phone\t: " + this.mpno);
    }
}
