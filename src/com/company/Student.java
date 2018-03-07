package com.company;
import java.util.Collections;

//1. Create a class named Students such that:
//        a. There is a public lastName field  √
//        b. There is a public firstName field √
//        c. There is a public studentID field √
//        d. There is a constructor that takes these values as parameters and sets the field values √
//2. Create a Comparator for Students that orders the objects by lastName √
//3. In a public static void main method: √
//        a. create an array of these objects with data you choose (i.e. objects of [“mortl”, “will”, “888”] & [swift”, “taylor”, “777”], etc.] √
//        i. you must have at least 5 elements in the array √
//        ii. they should initially be out of order √
//        b. use Array.sort to sort them using your comparator √
//4. Modify Students to implement Comparable<Student> that orders objects based upon studentID
//5. In a public static void main method:
//        a. create a list of these objects with data you choose (i.e. again, objects of [“mortl”, “will”, “888”] & [swift”, “taylor”, “777”], etc.]
//          i. you must have at least 5 elements in the collection
//          ii. you should add them to be out of order
//        b. use Collection.sort to sort them (this will use the Comparable interface)

public class Student implements Comparable<Student> {
    public String lastName;
    public String firstName;
    public int studentID;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getStudentID() {
        return studentID;
    }

    public Student(String lastName, String firstName, int studentID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentID = studentID;
    }

    @Override
    public String toString(){
        return String.format("Last name: %s, First name: %s, SID: %s\n", getLastName(), getFirstName(), getStudentID());
    }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getStudentID(), o.studentID);
    }
//    @Override
//    public int compareTo(Student o) {
//        int BEFORE = -1;
//        int EQUAL = 0;
//        int AFTER = 1;
//        for (int i = 0; i < o; i++) {
//            if (o.getStudentID() > o[i+1].getStudentID()) {
//                return BEFORE;
//            } else if (o[i+1].getStudentID() > o[i].getStudentID()) {
//                return AFTER;
//            } else return EQUAL;
//        }
    }
