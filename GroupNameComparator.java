package Person;

import java.util.Comparator;
import java.lang.NullPointerException;

import static java.lang.System.out;

public class GroupNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student a = (Student) o1;
        Student b = (Student) o2;
    try {
        String firstName = ((Student) a).getName();
        String secondName = ((Student) b).getName();
        try {
            if (firstName.compareTo(secondName) > 0) {
                return 1;
            }
            if (firstName.compareTo(secondName) < 0) {
                return -1;
            }
        } catch (Exception e) {
            out.println(" Метод не вызван");
        }
    } catch (Exception e) {
        return 0;
    }
        return 0;
    }
}
