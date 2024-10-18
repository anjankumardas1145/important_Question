//Q: Reverse an array and store the value in a another array
let arr[]={1,2,3,4,5,6},and we need to store the value in an another array like this ,suppose another array is ansArr[],so ansArr[]={6,5,4,3,2,1}
so here we need to manipulate the array from the last element and then store them in the ansArr.


import java.util.*;
public class Revnumber{

// function for reverse the array
public static int[] revArray(int arr[]){
int l=arr.length;
// to store the element in reverse order create a new array
int newArr[]=new int[l];
int j=0;
for(int i=l-1;i>=0;i--){
newArr[j++]=arr[i];

}
return newArr;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array: ");
int n=sc.nextInt();
// declare the array
int arr[]=new int[n];
System.out.println("Enter the element into the array: ");

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int result[]=revArray(arr);

// here the array element are stored in reverse order in the result variable so we need to print this
for(int i=0;i<result.length;i++){
System.out.print(result[i] + " ");
}
}
}
