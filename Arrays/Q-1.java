import java.util.*;
public class Four {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
ArrayList<Integer> even=new ArrayList<>();
ArrayList<Integer> odd=new ArrayList<>();
for(int i=1;i<=n;i++){
if(i%2==0){
even.add(i);
}else{
odd.add(i);
}
}
Integer [] e=even.toArray(new Integer[0]);
Integer [] o=odd.toArray(new Integer[0]);

int [] Even=new int[e.length];
for(int i=0;i<e.length;i++){
Even[i]=e[i];
}
int [] Odd=new int[o.length];
for(int i=0;i<o.length;i++){
Odd[i]=o[i];
}
System.out.println(Arrays.toString(Even));
System.out.println(Arrays.toString(Odd));



}
    
}
