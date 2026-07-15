package shapes;

public class Main {
public static void  main(String []args){
    Square s= new Square(4,10);
    s.area();
    System.out.println(s.area());

    Shape a=new Shape();
    System.out.println(a.area());
    Polygon p = new Polygon(5);
    System.out.println(p.area());
}
}
