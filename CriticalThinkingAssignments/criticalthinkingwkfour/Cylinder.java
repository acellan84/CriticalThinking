package criticalthinkingwkfour;

public class Cylinder extends Shape {
	   private double radius;
	    private double height;

	    public Cylinder(double radius, double height) {
	        this.radius = radius;
	        this.height = height;
	    }

	    @Override
	    public double surfaceArea() {
	    	//formula for surface area
	        return 2 * Math.PI * radius * (radius + height);
	    }

	    @Override
	    public double volume() {
	    	//formula for volume
	        return Math.PI * radius * radius * height;
	    }

	    @Override
	    public String toString() {
	        return "Cylinder - Surface Area: " + surfaceArea() + "\nCylinder - Volume: " + volume();
	    }
}
