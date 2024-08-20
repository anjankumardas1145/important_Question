//Question:1
//Day:1
import java.util.*;

public class ReverseNumber{
public static void main(String args[]){
System.out.println("Enter the number you want to reverse:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int result=0;
while(a>0){
int rem=a%10;
result=result*10+rem;
a=a/10;
}
System.out.println("The reverse of the number is: "+ result);
}
}


