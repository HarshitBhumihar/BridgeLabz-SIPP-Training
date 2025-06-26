import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
double sum=0;
double ans=0;
double []a=new double[11];
for(int i=0;i<a.length;i++){
double n=sc.nextInt();
a[i]=n;
sum=sum+n;



} ans=sum/a.length;
System.out.println(ans);





}
    
}
