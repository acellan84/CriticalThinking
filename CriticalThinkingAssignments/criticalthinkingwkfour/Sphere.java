package criticalthinkingwkfour;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
    	//formula for sphere surface area
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
    	//formula for sphere volume
        return (4/3) * Math.PI * radius * radius * radius;
    }

    public String toString() {
        return "Sphere - Surface Area: " + surfaceArea() + "\nSphere - Volume: " + volume();
    }
}