package project3;
import java.util.Scanner;

public class studentgrade {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();

	       
	        int[] marks = new int[numSubjects];
	        System.out.println("Enter the marks obtained (out of 100) for each subject:");
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Marks for subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	        }

	      
	        int totalMarks = 0;
	        for (int mark : marks) {
	            totalMarks += mark;
	        }

	        
	        double averagePercentage = (double) totalMarks / numSubjects;

	        String grade = calculateGrade(averagePercentage);

	       
	        System.out.println("\nResults:");
	        System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
	        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }

	   
	    public static String calculateGrade(double percentage) {
	        if (percentage >= 90) {
	            return "A+";
	        } else if (percentage >= 80) {
	            return "A";
	        } else if (percentage >= 70) {
	            return "B";
	        } else if (percentage >= 60) {
	            return "C";
	        } else if (percentage >= 50) {
	            return "D";
	        } else {
	            return "F"; 
	        }
	    }
	}


