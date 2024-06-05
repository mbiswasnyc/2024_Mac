package Class_May29;

public class Rectangle extends Shape{
    private double length;
    private double weight;

    Rectangle (double weight, double length){
        this.weight = weight;
        this.length = length;
    }

    public double getArea(){
        return weight*length;
    }
}
