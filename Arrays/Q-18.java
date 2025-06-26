import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int temp=a;
int count=0;
while(temp>0){
count++;
temp=temp/10;
}
int [] ans=new int[count];
temp=a;
for(int i=count-1;ii>=0;i++){
ans[i]=temp%10;
temp=temp/10;
}
for(int i=count-1;i>=0;i--){
System.out.println(ans[i]);
}
}

        
        
}
