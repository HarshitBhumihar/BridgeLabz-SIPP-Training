import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
int div=a-1;
int greatest=1;
while(div>=1){
if(a%div==0){
greatest=div;
System.out.println(greatest);
break;
  
    }
div--;
}
}
    
}
