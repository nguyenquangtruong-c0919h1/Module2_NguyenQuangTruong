package LopVaDoiTuongJava;

import java.util.Scanner;

public class LopHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Nhap width");;
        width=scanner.nextFloat();
        System.out.println("Nhap height");
        height=scanner.nextFloat();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
    public static class Rectangle{
        float width, height;
        public Rectangle(float width,float height) {
            this.width = width;
            this.height = height;
        }
        public float getArea(){
            return this.width*this.height;
        }
        public float getPerimeter(){
            return  (this.height+this.width)*2;
        }
        public String display(){
            return "Rectangle( width = "+width +", height = " +height+")";
        }
    }
}
