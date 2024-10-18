import java.util.Scanner;

public class RotateArray {
    public static int[] rotateArray(int arr[],int k){
        int ln= arr.length;
    k=k%ln;// this is because if some one enter more then array size repeation ex suppose array size is 5 ,but repeataion he/she wants to do 8 times
        //new array
        int newArray[]=new int[ln];
        int j=0;
        for(int i=(ln-k);i<ln;i++){
            newArray[j++]=arr[i];
        }
        for(int i=0;i<ln-k;i++){
            newArray[j++]=arr[i];
        }
        return newArray;
    }

    //print array
    public static void printArray(int arr []){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array : ");
        int n= sc.nextInt();
        //Declare the array
        int arr[]=new int[n];
        //store the element into the array
        System.out.println("Enter the element into the array :");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter how many times you want to rotate :");
        int k=sc.nextInt();

int result[]=rotateArray(arr,k);
printArray(result);

    }
}
