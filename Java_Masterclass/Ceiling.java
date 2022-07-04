package Composition;
// Part of the Composition Problem (Bedroom , Bed , Ceiling, Lamp, Wall)
public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height , int paintedColor){
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
