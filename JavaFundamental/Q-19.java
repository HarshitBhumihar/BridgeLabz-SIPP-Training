import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double h_cm=sc.nextInt();
int total_inch=h_cm/2.5;
int h_feet=total_inch/12;
int h_inch=total_inch%12;
System.out.print(h_feet);
System.out.print(h_inch);

}
}