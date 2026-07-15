package shapes;

public class Square extends Polygon {
    int sideLength;

    public Square(int side,int sideLength){
        super(side);
        this.sideLength=sideLength;

    }
    public double area(){
        return sideLength*sideLength;
    }
}
