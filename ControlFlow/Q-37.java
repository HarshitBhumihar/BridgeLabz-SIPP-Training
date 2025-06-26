import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
double w=sc.nextDouble();
int h=n/100;
double bmi=w/(h*h);
if(bmi<=18.4){
System.out.println("underweight");
}
else if(bmi>18.5 && bmi<=24.9){
System.out.println("normal");
}
else if(bmi>=25.0 && bmi<=39.9){
System.out.println("overweight");
}else{
System.out.println("obese");
}





}
    
}
