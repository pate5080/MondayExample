/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/** distributed vcs - configure Local Rep
 * s1: initialize versioning, .gitconfig, .gitignore, commit
 * print student details 3 - name , age
 * User interaction i/o - view class
 * @author Anshul Alpesh Patel
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student [] list = new Student[3];   //Array of object declaration
        // Code to print 3 students details
        // object student
        Student s1 = new Student(); // Define the name and Age
        s1.setName("Peter");
        s1.setAge(21);
        
        Student s2 = new Student(); // Define the name and Age
        s2.setName("Kumar");
        s2.setAge(23);
        
        Student s3 = new Student(); // Define the name and Age
        s3.setName("Simran");
        s3.setAge(19);
        
        // array
        
        list [0] = s1;
        list [1] = s2;
        list [2] = s3;
        
        // Getting the output from the list
        
        for (int i=0; i<list.length; i++){
            System.out.println("The name of the student is: " + list[i].getName());
            System.out.println("The age of the student is: " + list[i].getAge());
        }
    }
    
}
