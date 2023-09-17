package criticalthinkingwkfour;

public class ShapeArray {
	public static void main(String[] args) {
		//creating an instance of shape with a radius and/or height and assigning to the variable
		Sphere sphere = new Sphere(4);
		Cylinder cylinder = new Cylinder(4,8);
		Cone cone = new Cone(3,5);
		
		//initializing the three shapes
		Shape[] shapeArray = new Shape[] { sphere, cylinder, cone };
		
		//loop iterating through each element of shapeArray where current element will be assigned to s
		for (Shape s : shapeArray) {
			//printing out surface area and volume of each shape
			System.out.println(s.toString());
		}
	}
}
