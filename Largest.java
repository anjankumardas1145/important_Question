public class Largest{
public static void main(String args[]){
int arr[]={45,67,23,54,90};
int max=arr[0];//Assuming first element is largest

for(int i=0;i<arr.length;i++){

if(arr[i]>max){
max=arr[i];
}
}
System.out.println("The largest number in the array is: " +max);
}
}
