package LopCircleVaLopCylynder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR(3);
        System.out.println("Dien tich hinh trong" + circle.Area() + "mau sac : " + circle.color);
        Cylynder cylynder = new Cylynder();
        cylynder.setH(3);
        cylynder.setR(3);
        System.out.println("Dien tich hinh tru " +cylynder.Cylynder());
    }

}
