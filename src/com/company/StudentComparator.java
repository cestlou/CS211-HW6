package com.company;
import java.util.*;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.lastName.compareTo(s2.lastName);
    }
}
