import java.util.*;
class Main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int fee=sc.nextInt();
int d_perc=sc.nextInt();
int discount=(d_perc*fee)/100;
int a_discount_fee=fee-discount;
System.out.println(a_discount_fee);
}
}

