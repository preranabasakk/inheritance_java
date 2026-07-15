package inheritance;

public class Main {
    public static void main (String[] args ){
    Person2 a = new Student2("hola",22,"abc ");
    System.out.println(a.name+" "+a.age +" ");
    a.introduce();

    Student2 b = new Student2("Hola", 22, "ABC");

        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.school);
        b.introduce();
}
}
