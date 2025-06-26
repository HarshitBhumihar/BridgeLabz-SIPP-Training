import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double p_a=a+b+c;
double ans=(p_a/300)*100;
if(ans>=80){
System.out.println("A grade");
}else if(ans<=79 && ans>=71){
System.out.println("B grade");

} 
else if(ans<=70 && ans>=61){
System.out.println("C grade");

} else if(ans<=60 && ans>=51){
System.out.println("D grade");
} else{
System.out.println("fail");

}
}
    
}
