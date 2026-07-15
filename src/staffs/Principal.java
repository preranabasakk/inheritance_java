package staffs;

public class Principal extends Staff {
    int bonus;

    public Principal(int baseSalary, int bonus) {
        super();
        this.bonus = bonus;
    }

    public int getSalary() {
        return baseSalary + bonus;


    }
}
