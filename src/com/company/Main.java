package com.company;
import java.util.*;

public class Main {
    public String lastName;
    public String firstName;
    public int studentID;

    public static void main(String[] args) {
        Random generator = new Random();
        String[] lastNames = new String[]{"Mortl", "Alvarez", "Mechling", "Ladywood", "Hotes", "Malan", "Brisk", "Allan", "Wight"};
        String[] firstNames = new String[]{"Luna", "Chris", "Will", "Adam", "Chadwick", "Tyler", "Jennifer", "Rebecca", "Anthony"};
        int[] SID = new int[]{99819, 72637, 11938, 12134, 23902};

        Student[] studentArray = new Student[5];
        for (int i = 0; i < studentArray.length; i++) {
            int randomLastName = generator.nextInt(lastNames.length);
            int randomFirstName = generator.nextInt(firstNames.length);
            int randomSID = generator.nextInt(SID.length);
            studentArray[i] = new Student(lastNames[randomLastName], firstNames[randomFirstName], SID[randomSID]);
        }


        System.out.println("Before sorting: " + Arrays.toString(studentArray));
        Arrays.sort(studentArray, new StudentComparator());
        System.out.println("After sorting: " + Arrays.toString(studentArray));

        Random generator = new Random();
        String[] lastNames = new String[]{"Mortl", "Alvarez", "Mechling", "Ladywood", "Hotes", "Malan", "Brisk", "Allan", "Wight"};
        String[] firstNames = new String[]{"Luna", "Chris", "Will", "Adam", "Chadwick", "Tyler", "Jennifer", "Rebecca", "Anthony"};
        int[] SID = new int[]{99819, 72637, 11938, 12134, 23902};
    }
}
