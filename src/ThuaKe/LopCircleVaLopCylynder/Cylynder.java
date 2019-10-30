package LopCircleVaLopCylynder;

public class Cylynder extends Circle{
    private int h;
    public double getH(){
        return this.h;
    }
    public void setH(int h){
        this.h = h;
    }
    public double Cylynder(){
        return super.Area()*this.h;
    }
}
