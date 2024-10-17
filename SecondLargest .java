import java.util.Scanner;

public class SecondLargest {
    static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;//
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static  int findSecMax(int arr[]){
        int mx=findMax(arr);
        //the max value from findMax() will store in mx//in place of mx value we will store -infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;

            }
        }
        int secondMx=findMax(arr);//so mx jaga re -infinnity store hela pore jia max rahiba sia
        return secondMx;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array : ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element intop the array :");
        for (int i=0;i<size;i++){// if here i put the condition i<arr.length instead of i<size it will not take the input from the user
            arr[i]=sc.nextInt();
        }
        int result=findSecMax(arr);
        System.out.println("The second largest number is : "+result);
    }
}
