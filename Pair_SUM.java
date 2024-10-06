import java.util.Scanner;

public class Pair_SUM {


    public static int returnPair(int arr[],int target){
        int result=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    result++;
                    System.out.println( " In This indexes : ( "+i+" , " +j+  " )");
                    System.out.println("( "+arr[i]+  " , "+ arr[j] +") ") ;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the sum whose pair you want to see :");
        int target=sc.nextInt();
//input element into the array
        System.out.println(" Enter element into array :");
         for (int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }

//function call
        int ans=returnPair(arr,target);
        System.out.println(" ans is : "+ans);


    }
}
