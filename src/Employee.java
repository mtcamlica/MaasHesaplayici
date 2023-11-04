public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax = 0.03;
    double taxAmount;
    int fazlaMesai = 0;
    int fazlaMesaiUcreti = 0;
    double maasArtisi = 0.0;
    double vergiBonusMaas = 0.0;
    double sonMaas = 0.0;





    Employee (String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax () {
        if (salary < 1000 && salary >0) {
            return salary;
        }else {
            this.taxAmount = tax*salary;
        }
        return this.taxAmount;
    }
    public double bonus () {
        if (workHours >40) {
            fazlaMesai = workHours - 40;
            fazlaMesaiUcreti = fazlaMesai * 30;
        }
        return fazlaMesaiUcreti;
    }
    public double raiseSalary () {
        int baslangicYili = 2021;

        if (baslangicYili - hireYear <10){
            this.maasArtisi = this.salary * 0.05;
            return maasArtisi;
        } else if ((baslangicYili - hireYear <20) && (baslangicYili - hireYear>9)) {
            this.maasArtisi = this.salary * 0.1;
            return maasArtisi;
        } else if (baslangicYili - hireYear >19) {
            this.maasArtisi = this.salary * 0.15;
            return maasArtisi;
        }
        return maasArtisi;
    }
    public double vergiBonusMaas () {
        this.vergiBonusMaas = ((this.salary - this.taxAmount) + this.fazlaMesaiUcreti);
        return vergiBonusMaas;
    }

    public double sonMaas () {
        this.sonMaas = this.vergiBonusMaas + this.maasArtisi;
        return sonMaas;
    }

    public String toString() {
        System.out.println("Adı \t\t\t:" + this.name);
        System.out.println("Maaşı \t\t\t:" + this.salary);
        System.out.println("Çalışma Saati\t:" + this.workHours);
        System.out.println("Başlangıç Yılı\t:" + this.hireYear);
        System.out.println("Vergi\t\t\t:" + this.tax());
        System.out.println("Bonus\t\t\t:" + this.bonus());
        System.out.println("Maaş Artışı\t\t:" + this.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + this.vergiBonusMaas());
        System.out.println("Toplam Maaş\t\t:" + this.sonMaas());
        return null;
    }

}
