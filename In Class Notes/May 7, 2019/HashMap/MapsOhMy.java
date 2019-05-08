/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapsohmy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class MapsOhMy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        HashMap<String, Student> firstNames = new HashMap();
        HashMap<String, Student> lastNames = new HashMap();
        
        students.add(new Student("John", "OConnor", "K", 0, 5));
        students.add(new Student("Sue", "Smith", "K", 1, 6));
        students.add(new Student("Chester", "Buijs", "2", 2, 8));
        students.add(new Student("Tony", "Humbert", "2", 3, 8));
        students.add(new Student("Milton", "Harrison", "2", 4, 9));
        students.add(new Student("Dorothy", "Daniels", "3", 5, 10));
        students.add(new Student("Sallie", "Roger", "3", 6, 10));
        students.add(new Student("Edith", "Querci", "3", 7, 10));
        students.add(new Student("Floyd", "Hunt", "4", 8, 10));
        students.add(new Student("Pearl", "Chiarelli", "5", 9, 11));
        
        for (Student s : students) {
            firstNames.put(s.getfName().toUpperCase(), s);
            lastNames.put(s.getlName().toUpperCase(), s);
        }
        
        
        System.out.println("Enter your student name to log in:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        boolean found = false;
        
        Student myStudent = firstNames.get(name.toUpperCase());
        if (myStudent == null) {
            myStudent = lastNames.get(name.toUpperCase());
            if (myStudent == null) {
                System.out.println("Didn't find student with first or last name " + name);
            } else {
                System.out.println("Student with last name : " + name);
            }
        } else {
            System.out.println("Student with first name : " + name);
        }
        
        
//        for (Student temp: students) {
//           if (temp.getfName().equalsIgnoreCase(name)) {
//               found = true;
//               System.out.println("Found Student " + name + " in the array.");
//            }
//           if (!found) {
//               System.out.println("Student " + name + " : NOT FOUND");
//           }
//        }
    }
}
