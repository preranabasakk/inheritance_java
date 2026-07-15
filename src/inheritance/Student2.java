package inheritance;

public class Student2  extends Person2{
    public String school;

    public Student2(String name,int age ,String school) {
        super(name, age);
        this.school = school;
    }

        public void introduce(){
            System.out.println("this is child class");
        }

}
