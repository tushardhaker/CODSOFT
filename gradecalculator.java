import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Subjects ---> Physics, Maths, Chemistry, English , Geography.
        int bound =100;
        System.out.println("Enter the marks you obtained in Physics, Maths, Chemistry, English and Geography are = ");
        int Physics   = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Maths     = sc.nextInt();
        int English   = sc.nextInt();
        int Geography = sc.nextInt();

        // Sum of total marks.
        int Total_marks = (Physics+Chemistry+Maths+English+Geography);
        System.out.println("Sum of Total Marks is = "+Total_marks);

        // Average PErcentage .
        float percentage = (Total_marks)/5;
        System.out.println("The Average Percentage is = "+percentage);

        // Grade Calculation based on percentage .
        if (percentage>90.0) {
            System.out.println("Grade is A+"); 
        }
        else if (percentage>80.0 && percentage<=90.0) {
            System.out.println("Grade is A");
        }
        else if (percentage>70.0 && percentage<=80.0) {
            System.out.println("Grade is B");
        }
        else if (percentage>60.0 &&percentage<=70.0) {
            System.out.println("Grade is C");  
        }
        else if (percentage>50.0 &&percentage<=60.0) {
            System.out.println("Grade is E");        
        }
        else if (percentage>40.0 && percentage<=50.0) {
            System.out.println("Grade is E");
        }
        else if (percentage<=7040) {
            System.out.println("You Are Fail !");
        }
        System.out.println("THANK YOU <.>");
    }   
}
