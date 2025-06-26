import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int sum=0;
while(true){
int a=sc.nextInt();
if(a<=0){
break;
}
else{
sum=sum+a;
}
}
System.out.println(sum);

}
}