package criticalthinkingwkeight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<Student> studentList = new LinkedList<>();

			while (true) {
				System.out.print("Student's name: ");
				String name = scanner.nextLine().trim();

				System.out.print("Student's address: ");
				String address = scanner.nextLine().trim();

				double GPA;
				while (true) {
					System.out.print("Student's GPA: ");
					try {
						GPA = Double.parseDouble(scanner.nextLine().trim());
						if (GPA < 0 || GPA > 4) {
							throw new NumberFormatException();
						}
						break;
					} catch (NumberFormatException e) {
						System.out.println("Enter a valid GPA between 0 and 4.");
					}
				}

				Student student = new Student(name, address, GPA);
				studentList.add(student);

				System.out.print("Do you want to add another student? (yes/no): ");
				String choice = scanner.nextLine().trim().toLowerCase();
				if (!choice.equals("yes")) {
					break;
				}
			}

			Collections.sort(studentList);

			try (BufferedWriter writer = new BufferedWriter(new FileWriter(
					"C:\\\\Users\\\\acell\\\\git\\\\CriticalThinking\\\\CriticalThinkingAssignments\\\\criticalthinkingwkeight\\\\student_data.txt"))) {
				for (Student student : studentList) {
					writer.write(student.toString());
				}
				System.out.println("Student data saved");
			} catch (IOException e) {
				System.out.println("An error occurred while saving the file.");
			}
		}
	}
}