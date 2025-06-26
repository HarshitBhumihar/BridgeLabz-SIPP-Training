import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int month = sc.nextInt();
       int day = sc.nextInt();
       if(month==3 && day>=20 && day<=31){
           System.out.println("Spring");
       }
       else if(month==4 && day>=1 && day<=30){
           System.out.println("Spring");
       }
       else if(month==5 && day>=1 && day<=31){
           System.out.println("Spring");
       }
       else if(month==6 && day>=1 && day<=20){
           System.out.println("Spring");
       }else{
        System.out.println("Not Spring");
       }
       
    }
    
}
