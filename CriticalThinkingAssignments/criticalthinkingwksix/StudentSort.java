package criticalthinkingwksix;

import java.util.Comparator;

public class StudentSort implements Comparator<Student> {
    @Override
    public int compare(Student studentOne, Student studentTwo) {
        return studentOne.getName().compareTo(studentTwo.getName());
    }
}

