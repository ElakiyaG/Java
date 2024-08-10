import java.util.Scanner;

public class Avg_Grade {
    public static void sum(int no,int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of the Marks: "+sum+"/"+(no*100));
        float avg=(float)sum/(float)no;
        System.out.println("Average of the Marks: "+avg+"/100");
        if(avg<=100 && avg>80) System.out.println("Congrats! You have acquired an 'A' Grade.");
        else if(avg<=80 && avg>70) System.out.println("Excellent! You have acquired an 'B' Grade.");
        else if(avg<=70 && avg>60) System.out.println("Very Good! You have acquired an 'C' Grade.");
        else if(avg<=60 && avg>50) System.out.println("Good! You have acquired an 'D' Grade.");
        else if(avg<=50 && avg>40) System.out.println("Improve yourself! You have acquired an 'E' Grade.");
        else System.out.println("OOPS! Sorry You're Fail.");
        System.out.println("Your CGPA Mark: "+avg/10+"/10");
    }
    public static void main(String args[]){
        System.out.println("------AVERAGE & GRADE OF MARKS------");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of Subjects:");
        int no=scan.nextInt();
        System.out.println("Enter marks for each Subject:");
        int arr[]=new int[no];
        for (int i=0;i<no;i++){
            int marks=scan.nextInt();
            arr[i]=marks;
        }
        sum(no,arr);
    }
}
