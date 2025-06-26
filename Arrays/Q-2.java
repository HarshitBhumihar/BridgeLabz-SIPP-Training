import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
int [] a=new int[5];
for(int i=0;i<=4;i++){
int n=sc.nextInt();
a[i]=n;
if(n<0){
System.out.println("number is negative");
}else if(n%2==0){
System.out.println("even");
}else{
System.out.println("odd");
}
}

for(int i=0;i<5;i++){
System.out.print(a[i]);
}
if(a[0]==a[a.length-1]){
System.out.println("both are equal");
}else{
System.out.println("both are not equal");
}



}
    
}
