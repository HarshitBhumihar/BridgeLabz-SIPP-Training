import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
if(a<=0){
System.out.println("it is not natural number");
} else{
int ans=a*(a+1)/2;
System.out.println(ans);
}




     
       
    }
    
}
