package criticalthinkingwksix;

import java.util.Comparator;

public class RollNoSort implements Comparator<Student> {
    @Override
    public int compare(Student studentOne, Student studentTwo) {
        return Integer.compare(studentOne.getRollno(), studentTwo.getRollno());
    }
}