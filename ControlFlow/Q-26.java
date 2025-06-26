import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
int ans=1;
while(true){
      int n=sc.nextInt();
if(n<=0 || n>100){
System.out.println("invalid number");
break;
} else{
ans=ans*n;
continue;
}
}

System.out.println(ans);


}
    
}
