package PACKAGE_NAME;

public class Wall {
  private double height;
    private double width;

    public Wall() {

    }

    public Wall(double width, double height) {
        if(height < 0){
            height = 0;
        }
        if(width < 0){
            width = 0;
        }

        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }
}
