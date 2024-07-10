import java.util.*;
class balance{
    float sal;
    void expenses(float arr[]){
        int sum=0;
        int i;
        for (i=0;i<arr.length;i++)
            sum+=arr[i];
        System.out.println(sum);
        System.out.println("Then your Savings apart from your Expenses is Rs: ");
        System.out.println(sal-sum);
    }
}
public class p2 {
    public static void main(String args[]){
        balance bal=new balance();
        Scanner scan=new Scanner(System.in);
        System.out.println("------------EXPENSES CHART--------------");
        System.out.println("Enter your Earnings: ");
        float sal=scan.nextFloat();
        bal.sal=sal;
        System.out.println("Enter the number of Expenses you've Done: ");
        int no=scan.nextInt();
        String[] arrname = new String[no];
        float[] arramt = new float[no];
        for(int i=0;i<no;i++){
            System.out.println("Enter the "+(i+1)+"st Expense name and Amount spend for it :");
            scan.nextLine();
            arrname[i]=scan.nextLine();
            arramt[i]=scan.nextFloat();
        }
        System.out.println("Your Expenses are ");
        for(int i=0;i<no;i++){
            System.out.println((i+1)+". "+arrname[i]+" : "+arramt[i]);
        }
        System.out.println("Your Total Expenses costs Rs: ");
        bal.expenses(arramt);
    }
}
