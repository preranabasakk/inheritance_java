package staffs;

public class Teacher extends Staff{
    int teacherSalary;

    public Teacher(int baseSalary) {
        super();
        this.teacherSalary = 20000;
    }

    public int getSalary(){
    return baseSalary+teacherSalary;
    }
}
