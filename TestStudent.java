import java.util.*;

public class TestStudent 
{
    public static void main (String [] args) 
    {
        Scanner console = new Scanner(System.in);
        String matricNo;
        double test1,test2;

        Student [] studDegree = new Student[3];
        //complete your code here
        for(int i=0;i<3;i++) 
        {
            System.out.print("Matric No : ");
            matricNo = console.next();
            System.out.print("Test 1 : ");
            test1 = console.nextDouble();
            System.out.print("Test 2 : ");
            test2 = console.nextDouble();
            studDegree[i]= new Student(matricNo, test1, test2);
        }

        System.out.println("***************************");
        System.out.println("    STUDENT INFORMATION    ");
        System.out.println("***************************");
        System.out.println("Matric No      Average Mark");
        
        for(int j=0;j<3;j++)
        {
            studDegree[j].calculateAverage();
            System.out.println(studDegree[j].getStudentInfo());
        }

    }//end of main method
}//end of class TestStudent