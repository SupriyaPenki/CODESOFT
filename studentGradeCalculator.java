import java.util.*;
class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Subjects:");
        int numOfSub=sc.nextInt();
        int sub[]=new int[numOfSub];
        for(int i=0;i<numOfSub;i++)
        {
            System.out.println("Enter sub"+(i+1)+" marks:");
            sub[i]=sc.nextInt();
        }
        int totalSum=0;
        for(int i=0;i<numOfSub;i++)
        {
            totalSum+=sub[i];
        }
        
        double average=(double)totalSum/numOfSub;
       
        char Grade='-';
        if(average >=90)
        Grade='S';
        else if(average>=80 &&  average<90)
        Grade='A';
        else if(average>=70 &&  average<80)
        Grade='B';
        else if(average>=60 &&  average<70)
        Grade='C';
        else if(average>=50 && average<60)
        Grade='D';
        else if(average>=40 && average<50)
        Grade='E';
        else
        Grade='F';
        System.out.println("Result:");
        System.out.printf("The Average marks Of The Student is %.2f\n",average);
        System.out.println("The Total Marks Obtained in all Subjects is:"+totalSum);
        System.out.println("Assigned Grade Based on Average Percentage:"+ Grade);
        
    }
}