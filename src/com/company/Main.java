package com.company;
import java.util.*;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        String[] lastNames = new String[]{"Mortl", "Alvarez", "Mechling", "Ladywood", "Hotes", "Malan", "Brisk", "Allan", "Wight"};
        String[] firstNames = new String[]{"Luna", "Chris", "Will", "Adam", "Chadwick", "Tyler", "Jennifer", "Rebecca", "Anthony"};
        int[] SID = new int[]{99819, 72637, 11938, 12134, 23902};

        // array sorting
        Student[] studentArray = new Student[5];
        for (int i = 0; i < studentArray.length; i++) {
            int randomLastName = generator.nextInt(lastNames.length);
            int randomFirstName = generator.nextInt(firstNames.length);
            int randomSID = generator.nextInt(SID.length);
            studentArray[i] = new Student(lastNames[randomLastName], firstNames[randomFirstName], SID[randomSID]);
        }

        System.out.println("Before array sorting: " + Arrays.toString(studentArray));
        Arrays.sort(studentArray, new StudentComparator());
        System.out.println("After array sorting: " + Arrays.toString(studentArray));

        Random collectionsGenerator = new Random();
        String[] collectionsLastNames = new String[]{"Mortl", "Alvarez", "Mechling", "Ladywood", "Hotes", "Malan", "Brisk", "Allan", "Wight"};
        String[] collectionsFirstNames = new String[]{"Luna", "Chris", "Will", "Adam", "Chadwick", "Tyler", "Jennifer", "Rebecca", "Anthony"};
        int[] collectionsSID = new int[]{99819, 72637, 57372, 12134, 23902};


        // collection sorting
        ArrayList<Student> collectionsStudentArray = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            int randomLastName = collectionsGenerator.nextInt(collectionsLastNames.length);
            int randomFirstName = collectionsGenerator.nextInt(collectionsFirstNames.length);
            int randomSID = collectionsGenerator.nextInt(collectionsSID.length);
            collectionsStudentArray.add(new Student(collectionsLastNames[randomLastName], collectionsFirstNames[randomFirstName], collectionsSID[randomSID]));
        }

        System.out.print("Before collection sorting: " + collectionsStudentArray + "\n");
        Collections.sort(collectionsStudentArray);
        System.out.print("After collection sorting: " + collectionsStudentArray);
    }
}
