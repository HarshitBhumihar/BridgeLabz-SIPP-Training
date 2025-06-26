import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
int sum=0;
int temp=n;
while(temp>0){
sum+=temp%10;
temp=temp/10;

}
if(n%sum==0){
System.out.println("this is harshad number"); 
}else{
System.out.println("this is not harshad number");

}
}
    
}
