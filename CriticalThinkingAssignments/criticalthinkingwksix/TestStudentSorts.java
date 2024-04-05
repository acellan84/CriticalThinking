package criticalthinkingwksix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudentSorts {
	public static void selectionSort(List<Student> students, Comparator<Student> comparator) {
		// getting number of students
		int n = students.size();
		// Initiating sorting going through students
		for (int i = 0; i < n - 1; i++) {
			// current position
			int index = i;
			// compare current student to remaining students
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
		studentList.add(new Student(1254, "Amanda Cellan", "321 Yale, Billings, MT 59102"));
		studentList.add(new Student(5413, "Steve Smith", "654 Harvard, Billings MT 59102"));
		studentList.add(new Student(1211, "Autumn Cook", "789 Princeton, Billings MT 59102"));
		studentList.add(new Student(1215, "Alex Williams", "987 Cobble Stone, Billings MT 59102"));
		studentList.add(new Student(3748, "Jean Rogers", "951 Quarry Stone, Billings MT 59102"));
		studentList.add(new Student(1787, "John Walker", "357 Field Stone, Billings MT 59102"));
		studentList.add(new Student(3645, "Susan Knaub", "741 Main St, Billings MT 59102"));
		studentList.add(new Student(5624, "Travis Kelso", "963 Central Ave, Billings MT 59102"));
		studentList.add(new Student(7541, "Tracy Reeves", "258 Broadwater Ave, Billings MT 59102"));
		studentList.add(new Student(8521, "Bill Jones", "159 Grand Ave, Billings MT 59102"));

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