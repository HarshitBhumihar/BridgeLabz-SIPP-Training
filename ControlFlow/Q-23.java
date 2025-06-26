import java.util.Scanner;
public class Four {
public static String MaximumAge(int Amar_a,int Akabar_a,int Anthany_a){
if(Amar_a>Akabar_a && Amar_a>Anthany_a){
System.out.println("Amar_a");
}else if(Amar_a<Akabar_a && Akabar_a>Anthany_a){
System.out.println("Akabar_a");
}else{
System.out.println("Antany_a");
}
}
    public static void main(String[] args) {



       Scanner sc = new Scanner(System.in);
      int Amar_a=sc.nextInt();
int Akabar_a=sc.nextInt();
int Anthany_a=sc.nextInt();
int Amar_ht=sc.nextInt();
int Akbar_ht=sc.nextInt();
int Anthay_ht=sc.nextInt();
String result=MaximumAge(Amar_a, Akabar_a, Anthany_a);
System.out.println(result);

     
       
    }
    
}
