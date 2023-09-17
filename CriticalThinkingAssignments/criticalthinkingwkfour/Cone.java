package criticalthinkingwkfour;

public class Cone extends Shape {
	private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
    	//formula for surface area
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    public double volume() {
    	//formula for volume
        return (Math.PI * radius * radius * height)/3;
    }

    public String toString() {
        return "Cone - Surface Area: " + surfaceArea() + "\nCone - Volume: " + volume();
    }
}