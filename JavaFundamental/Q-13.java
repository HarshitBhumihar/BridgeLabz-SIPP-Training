import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
double miles=r*0.621317;
double vol_r=4/3*3.14*r*r*r;
double vol_miles=4/3*3.14*miles*miles*miles;
System.out.println(vol_r);
System.out.println(vol_miles);
}
}
