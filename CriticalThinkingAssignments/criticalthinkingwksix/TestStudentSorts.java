package criticalthinkingwksix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudentSorts {
	   public static void selectionSort(List<Student> students, Comparator<Student> comparator) {
	       //getting number of students 
		   int n = students.size();
	        //Initiating sorting going through students
	        for (int i = 0; i < n - 1; i++) {
	        	//current position
	            int index = i;
	            //compare current student to remaining students
	            for (int s = i + 1; s < n; s++) {
	                if (comparator.compare(students.get(s), students.get(index)) < 0) {
	                    index = s;
	                }
	            }

	            // Swap the elements to get to the correct position
	            Student temp = students.get(i);
	            students.set(i, students.get(index));
	            students.set(index, temp);
	        }
	    }

	    public static void main(String[] args) {
	        ArrayList<Student> studentList = new ArrayList<>();

	        // Adding 10 student objects
	        studentList.add(new Student(101, "Alice", "123 Main St"));
	        studentList.add(new Student(102, "Bob", "456 Elm St"));
	        studentList.add(new Student(103, "Charlie", "789 Oak St"));
	        studentList.add(new Student(104, "David", "101 Pine St"));
	        studentList.add(new Student(105, "Eve", "222 Maple St"));
	        studentList.add(new Student(106, "Frank", "333 Cedar St"));
	        studentList.add(new Student(107, "Grace", "444 Birch St"));
	        studentList.add(new Student(108, "Hank", "555 Walnut St"));
	        studentList.add(new Student(109, "Ivy", "666 Redwood St"));
	        studentList.add(new Student(110, "Jack", "777 Sequoia St"));

	     // Sort by name
	        System.out.println("Sorting by Name:");
	        selectionSort(studentList, new StudentSort());
	        for (Student student : studentList) {
	            System.out.println(student);
	        }

	        // Sort by roll number
	        System.out.println("\nSorting by Roll No:");
	        selectionSort(studentList, new RollNoSort());
	        for (Student student : studentList) {
	            System.out.println(student);
	        }
	       
	       





	       
	    }
	}