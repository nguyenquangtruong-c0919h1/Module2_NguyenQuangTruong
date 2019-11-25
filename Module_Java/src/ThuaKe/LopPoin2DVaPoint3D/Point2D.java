package ThuaKe.LopPoin2DVaPoint3D;

public class Point2D {
    private float x;
    private float y;
    private float[] array = {2};

    public Point2D() {
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {

        this.array[0] = this.x;
        this.array[1] = this.y;
        return array;
    }

    public String toString() {
        return "Lop Point 2D " + array;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
