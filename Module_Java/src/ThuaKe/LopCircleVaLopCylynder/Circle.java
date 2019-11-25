package LopCircleVaLopCylynder;

public class Circle {
    private  int r;
    final double PI = 3.14;
    String color = "Blue";

    public int getR() {
        return this.r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double Area() {
        return this.r * this.r * PI;
    }


}
