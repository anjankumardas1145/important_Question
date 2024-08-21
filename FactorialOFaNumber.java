//Day-2,Question:3

//Time complexity for this code is O(n) 
//Explanation:The for loop runs from 1 to a, performing a multiplication operation at each iteration.
//since the loop runs  a times so the complexity is linear,denoted as O(n),where  n is the input number for which a is //calculated

import java.util.*;
public class FactorialOFaNumber{
public static void main(String args[]){
System.out.println("Enter the number you find the factorial");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
long fact=1;
for(int i=1;i<=a;i++){
fact=fact*i;
}
System.out.println("The factorial of  " + a +" is "+ fact);
}
}
