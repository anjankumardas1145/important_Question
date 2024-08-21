import java.util.*;
public class PalindromeNumber{
public static void main(String args[]){
System.out.println("Enter the number:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int num=a;
int rev=0;
while(num>0){
int rem=num%10;
rev=rev*10+rem;
num/=10;
}
num=a;
if(num==rev){
System.out.println( num + " is a palindrome number");
}
else{
System.out.println( num+ " is  not a palindrome number");
}
}
}
