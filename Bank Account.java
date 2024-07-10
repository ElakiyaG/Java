import java.util.*;

class transaction {
    int no;
    public void deposit(float balance,float depositamt){
        balance += depositamt;
        System.out.println("Successfully Deposited!.....");
        System.out.println("The Total Balance in your Account "+no+" is Rs."+balance);
    }
    public void withdraw(float balance,float withdrawamt) {
        if (balance >= withdrawamt) {
            balance -= withdrawamt;
            System.out.println("Successfully Withdrawed!.....");
            System.out.println("The Total Balance in your Account " + no + " is Rs." + balance);
        }
        else{
            System.out.println("OOPS! Sorry your Account has not sufficient Amount to be Withdrawed!...");
            System.out.println("Since your Account " + no + " only has a Balance of Rs." + balance);
        }
    }
}
public class p1 {
    public static void main(String args[]){
        transaction trans=new transaction();
        Scanner scan=new Scanner(System.in);
        System.out.println("--------------BANK ACCOUNT----------------");
        System.out.println("Enter your Bank Account Number: ");
        int bankacc=scan.nextInt();
        trans.no=bankacc;
        System.out.println("Enter your Initial Balance: ");
        float bal=scan.nextFloat();
        System.out.println("Enter whether you need to deposit or withdraw Money: ");
        scan.nextLine();
        String choice=scan.nextLine();
        if(choice.equals("deposit")){
            System.out.println("Enter the Amount of Money need to be Deposited: ");
            float deposit=scan.nextFloat();
            trans.deposit(bal,deposit);
        }
        else if(choice.equals("withdraw")){
            System.out.println("Enter the Amount of Money need to be Withdrawed: ");
            float withdraw=scan.nextFloat();
            trans.withdraw(bal,withdraw);
        }
        else{
            System.out.println("Enter your transaction correctly!!! ");
            System.out.println("The Total Balance in your Account "+bankacc+" is Rs."+bal);
        }
    }
}
