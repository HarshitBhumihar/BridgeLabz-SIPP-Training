import java.util.Scanner;
public class Four {
public static int factorial(int a){
if(a==0 || a==1){
System.out.println("1");
}
else{
fact=fact*factorial(a-1);
}
System.out.println(fact);
}

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
int fact=1;

System.out.println(factorial(a);




     
       
    }
    
}
