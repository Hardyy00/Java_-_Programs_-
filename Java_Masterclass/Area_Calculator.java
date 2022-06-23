
public class Area_Calculator {
    public static double area(double radius){
        if(radius < 0.0d){
            return -1.0;
        }

        return Math.PI * radius * radius;
    }
    public static double area(double length ,double breadth){
        if(length < 0.0d || breadth < 0.0d){
            return -1.0;
        }

        return length * breadth;
    }

    public static void main(String[] args){
        double area = area(1);
        System.out.println("Area of Circle : " + area);
        System.out.println("Area of Rectangle : " + area(2.0,3.0));

    }

}
