package criticalthinkingwkeight;


class Student implements Comparable<Student> {
	  private String name;
	    private String address;
	    private double gpa;

	    public Student(String name, String address, double GPA) {
	        this.name = name;
	        this.address = address;
	        this.gpa = GPA;
	    }

	   
	    public int compareTo(Student nextStudent) {
	        return this.name.compareTo(nextStudent.name);
	    }

	    
	    public String toString() {
	        return "Name: " + name + "\nAddress: " + address + "\nGPA: " + gpa + "\n";
	    }
	}