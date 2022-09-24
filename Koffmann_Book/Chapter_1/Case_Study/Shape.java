package casestudy.com.hardik;

import java.util.Scanner;

public abstract class Shape {


    private String shapeName;

    public Shape(String shapeName){
        this.shapeName = shapeName;
    }



    public String getShapeName(){
        return shapeName;
    }

    @Override
    public String toString(){
        return "Shape : " + shapeName + "\n";
    }

    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract void readShapeData();


}
