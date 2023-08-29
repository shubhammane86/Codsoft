package project2Codsoft;
import java.util.Scanner;
	
		public class StudentGradeCalculator
		{

		    public static void main(String[] args) {
		        // Create a Scanner object to take input from the user
		       Scanner sc = new Scanner(System.in);

		        // Declare variables to store the marks, total, average, and grade
		        int marks, total = 0, average, grade;
		        
		        // Declare a constant to store the number of subjects
		        final int NUM_SUBJECTS = 5;

		        // Use a loop to take input for each subject and calculate the total
		        for (int i = 1; i <= NUM_SUBJECTS; i++) {
		            System.out.println("Enter marks obtained (out of 100) in subject " + i + ":");
		            marks = sc.nextInt();
		            total += marks;
		        }

		        // Calculate the average percentage
		        average = total / NUM_SUBJECTS;

		        // Assign grades based on the average percentage
		        if (average >= 90) {
		            grade = 'A';
		        } else if (average >= 80) {
		            grade = 'B';
		        } else if (average >= 70) {
		            grade = 'C';
		        } else if (average >= 60) {
		            grade = 'D';
		        } else {
		            grade = 'F';
		        }

		        // Display the results
		        System.out.println("Total marks: " + total);
		        System.out.println("Average percentage: " + average + "%");
		        System.out.println("Grade: " + (char)grade);
		    }
		

}
