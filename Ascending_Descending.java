import java.util.Scanner;
public class Ascending_Descending {
    public static void asc_n(String val[],int l){
        String temp;
        for(int i=0;i<l+1;i++){
            for(int j=i+1;j<l+1;j++){
                if(val[j].compareTo(val[i])<0){
                    temp=val[i];
                    val[i]=val[j];
                    val[j]=temp;
                }
            }
        }
        System.out.println("The Ascending Values of the Numbers are");
        for(int i=0;i<l+1;i++){
            System.out.println(val[i]);
        }
    }
    public static void desc_n(String val[],int l){
        String temp;
        for(int i=0;i<l+1;i++){
            for(int j=i+1;j<l+1;j++){
                if(val[j].compareTo(val[i])<0){
                    temp=val[i];
                    val[i]=val[j];
                    val[j]=temp;
                }
            }
        }
        System.out.println("The Descending Values of the Numbers are");
        for(int i=l;i>0;i--){
            System.out.println(val[i]);
        }
    }
    public static void asc_c(String val[],int l){
        String temp;
        for(int i=0;i<l+1;i++){
            for(int j=i+1;j<l+1;j++){
                if(val[j].compareTo(val[i])<0){
                    temp=val[i];
                    val[i]=val[j];
                    val[j]=temp;
                }
            }
        }
        System.out.println("The Descending Values of the Alphabets are");
        for(int i=0;i<l+1;i++){
            System.out.println(val[i]);
        }
    }
    public static void desc_c(String val[],int l){
        String temp;
        for(int i=0;i<l+1;i++){
            for(int j=i+1;j<l+1;j++){
                if(val[j].compareTo(val[i])<0){
                    temp=val[i];
                    val[i]=val[j];
                    val[j]=temp;
                }
            }
        }
        System.out.println("The Descending Values of the Alphabets are");
        for(int i=l;i>0;i--){
            System.out.println(val[i]);
        }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("---------ASCENDING / DESCENDING ORDER---------");
        System.out.println("Enter whether you need to arrange Numbers(n) or Alphabets(a):");
        String s1= scan.nextLine();
        System.out.println("Enter whether in Ascending(a) or Descending(d) oder:");
        String s2= scan.nextLine();
        System.out.println("Enter the Length of Values:");
        int l=scan.nextInt();
        System.out.println("Enter Values:");
        String val[]=new String[l+2];
        for(int i=0;i<l+1;i++){
            val[i]=scan.nextLine();
        }
        if(s1.equals("a") && s2.equals("a")){
            asc_c(val,l);
        } else if (s1.equals("a") && s2.equals("d")) {
            desc_c(val,l);
        } else if (s1.equals("n") && s2.equals("a")) {
            asc_n(val,l);
        } else if (s1.equals("n") && s2.equals("d")) {
            desc_n(val,l);
        }else{
            System.out.println("Enter the corresponding Characters for the corresponding Input Stream!....");
        }
    }
}
