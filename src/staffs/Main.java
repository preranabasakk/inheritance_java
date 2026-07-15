package staffs;

public class Main {
    public static void main (String [] args){
        Staff s = new Staff();

        System.out.println(s.getSalary());
        Teacher t= new Teacher(100);
        t.getSalary();
        System.out.println(t.getSalary());
        Principal p = new Principal(10000,50000);
        p.getSalary();
        System.out.println(p.getSalary());
    }
}
