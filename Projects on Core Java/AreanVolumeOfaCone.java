/*
PROBLEM:

Write a program to define a class called Cone and find its area and volume.
The area and volume of cone are evaluated using the formula shown below:
     slant height = Sqrt of r^2 + h^2
     volume = (pi*r*r*h)/3
     area = pi*r*sqrt(r^2 + h^2)
In order to have a simple model, we do not consider the units of measurement.
 */
public class AreanVolumeOfaCone  {
    final double pi = 3.14157;
    double radius, height, slheight, volume, area;

    double sqrt(double y) {
        double z;
        z = Math.pow(y, 0.5);
        return z;
    }
    AreanVolumeOfaCone(double r, double h) {
        radius = r;
        height = h;
        slheight = sqrt(r*r+h*h);
        volume = (pi*r*r*h)/3;
        area = pi*r*sqrt(r*r+h*h);
    }
    void display() {
        System.out.println("\nHeight= "+height+"\nRadius= "+radius+"\nSlant Height= "+slheight+"\nVolume ="+volume+"\nArea= " +area);

    }
    public static void main(String[] args) {
        AreanVolumeOfaCone x = new AreanVolumeOfaCone(5.0,12.0);
        x.display();
    }
}
