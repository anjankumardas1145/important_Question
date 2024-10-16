import java.util.Scanner;

public class UniqueElement {

    public static int findElement(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of the array : ");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element into the array :");
        for (int i=0;i<size;i++){// if here i put the condition i<arr.length instead of i<size it will not take the input from the user
            arr[i]=sc.nextInt();
        }
        int result=findElement(arr);
        System.out.println("The unique element in the array is : " + result);
    }
}
