package Sem1.ModelElements;

public class Flash {
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;
    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }
    public void rotate(Angle3D grad){

    }

    public void move(Point3D cm){

    }

}
