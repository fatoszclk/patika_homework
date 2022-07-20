public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary <= 1000){
            return 0;
        }else{
            return this.salary*3/100;
        }
    }

    double bonus(){
        if(this.workHours > 40.0) {
            return (this.workHours - 40.0) * 30;
        }else{
            return 0;
        }
    }

    double raiseSalary(){
        if((2021-this.hireYear) < 10){
            return this.salary*5/100;
        }else if((2021-this.hireYear)>=10 && (2021-this.hireYear)<20){
            return this.salary/10;
        }else{
            return this.salary*15/100;
        }
    }

    public void tostring(){
        System.out.println("Adı\t: " + this.name);
        System.out.println("Maaşı\t: " + this.salary);
        System.out.println("Çalışma Saati\t: " + this.workHours);
        System.out.println("Başlangıç Yılı\t: " + this.hireYear);
        System.out.println("Vergi\t: " + tax());
        System.out.println("Bonus\t: " + bonus());
        System.out.println("Maaş Artışı\t: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte Maaş\t: " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş\t: " + (this.salary + - tax() + bonus() + raiseSalary()));
    }
}
