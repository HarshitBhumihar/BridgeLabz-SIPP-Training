import java.util.Scanner;
public class Four {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
if(a<=0){
System.out.println("plz enter positive number");
}
String [] ans=new String[a+1];
for(int i=0;i<=a;i++){
if(i%2==0 && i%5==0 ){
ans[i]=("FizzBuzz");
}else if(i%3==0){
ans[i]=("Fizz");
}else if(i%5==0){
ans[i]=("Buzz");
}else{
ans[i]=Integer.toString(i);
}
}
for(int i=0;i<=a;i++){
System.out.println(ans[i]);
}







}
    
}
