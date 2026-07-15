package inheritance;

public class Person2 {
    public String name;
    public  int age ;

    public Person2(String name , int age ){
        this.name=name;
        this.age=age;
    }
    public void introduce(){
        System.out.println("this is parent class");
    }
}
