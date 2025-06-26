import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double ans=0.0;
char o=sc.next().charAt(0);
switch(o){

case'+':
ans=a+b;
System.out.println(ans);
break;

case '-':
ans=a-b;
System.out.println(ans);
break;

case '*':
ans=a*b;
System.out.println(ans);
break;

case '/':
if(b==0){
System.out.println("invalid number");
}else{
ans=a/b;
System.out.println(ans);

}
break;

default :
System.out.println("invalid opr");
break;
}


}
    
}
