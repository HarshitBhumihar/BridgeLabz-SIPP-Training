import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();

if(a>0){
System.out.println(a);
}     
 while(a>0){
if(a%3==0){
System.out.println("Fizz");
break;
}else if(a%5==0){
System.out.println("Buzz");
break;
}
else if(a% 3==0 && a%5==0){
System.out.println("FizzBuzz");
break;
}
}    
    }
    
}
