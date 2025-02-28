import java.util.Scanner;

public class Main {
    

public class GPACalculator {
    
public static void main (String[ ] args) {
        
 String grade="";
 int count=0;
 double sum=0;
        
        Scanner input = new Scanner(System.in);
        while (!grade.equals("Q")) {
            System.out.println("Entera latter grade (A , B , C , D, F) OR Q to  Finish and Calculate:  ");
            
            grade = input.next();
            
            if (grade.equals("A")) {
                sum+= 4;
                count++;
            }
            else if (grade.equals("B")) {
                sum+= 3;
                count++;
                }
            else if (grade.equals("C")) {
                sum+= 2;
                count++;
        }
            else if (grade.equals("D")) {
                sum+= 1;
                count++;
        
    }
            else if (grade.equals("F")) {
                count++;
}
        
                  input.close();
                  double GPA = sum / count;
                  System.out.println("Your GPA is: " +GPA);


}
}
}
}



            