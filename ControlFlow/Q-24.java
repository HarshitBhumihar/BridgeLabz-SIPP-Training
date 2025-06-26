import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int year=sc.nextInt();
int salary=sc.nextInt();
double ans=0;
if(5>=year){
System.out.println("Sorry");
}else{
ans=(5.0/100)*salary;
System.out.println(ans);
}

}
    
}
