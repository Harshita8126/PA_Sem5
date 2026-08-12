package practice;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    String course;
    double marks;
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        course = sc.nextLine();
        marks = sc.nextDouble();
        sc.close();
    }
     public char calculateGrade() {

        if(marks>=90) {
            return 'A';
        }
        else if(marks>=80) {
            return 'B';
        }
        else if(marks>=70) {
            return 'C';
        }
        else if(marks>=60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
    
    public void displayDetails() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(course);
        System.out.println(marks);
        System.out.println(calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.displayDetails();
        
    }
}
