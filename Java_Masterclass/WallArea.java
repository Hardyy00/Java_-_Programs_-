public class WallArea {
    private double width;
    private double height;

    public WallArea(){
        this(0.00d,0.00d);
    }

    public WallArea(double width,double height){

        this.width = Math.max(width, 0.0d);
        this.height = Math.max(height,0.0d);

    }

    public void setWidth(double width){
        this.width = Math.max(width,0.0);
    }

    public void setHeight(double height){
        this.height = Math.max(height , 0.0);
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }
}
