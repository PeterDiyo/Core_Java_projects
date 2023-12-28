import java.util.Scanner;

public class VolumenSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        float pi = 3.14157f;
        float radius, height;
        float volume, surfaceArea, outerArea;

        radius = 0.0f;
        height = 0.0f;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please Enter the radius: ");
            radius = scanner.nextFloat();

            System.out.print("Please Enter the Height: ");
            height = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Input Output error");
            System.exit(1);
        }

        volume = pi * (float) Math.pow(radius, 2.0f) * height;
        surfaceArea = 2.0f * pi * radius * height + 2.0f * pi * (float) Math.pow(radius, 2.0f);  // Corrected formula for total surface area
        outerArea = 2.0f * pi * (float) Math.pow(radius, 2.0f);

        System.out.println("\t\tCYLINDER");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Outer Area: " + outerArea);
    }
}
