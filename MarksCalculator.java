import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            
            if (marks >= 0 && marks <= 100) {
                totalMarks += marks;
            } else {
                System.out.println("Invalid marks! Please enter between 0 to 100.");
                i--; 
            }
        }

        
        double percentage = (double) totalMarks / subjects;

        
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        System.out.println("\n------ Result ------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

