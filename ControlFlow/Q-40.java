import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int ans=n;
int arm=0;
int rem=0;
while(n>0){
rem=n%10;
arm=(rem*rem*rem)+arm;
n=n/10;
}
if(arm==ans){
System.out.println("yes");
}else{
System.out.println("no");

}

}
    
}
