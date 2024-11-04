import java.util.Scanner;

public class PrefixSum {
    public  static int[] prefixSum(int originalArr[]){
        int l= originalArr.length;
        int resultArr[]=new int[l];
        resultArr[0]=originalArr[0];
        for (int i=1;i<l;i++){
            resultArr[i]=resultArr[i-1]+originalArr[i];
        }
        return resultArr;
    }
    public  static void utilityArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int orriginaArr[]=new int[n];
        //input the element from the user
        System.out.println("Enter the element into the array:");
        for(int i=0;i<orriginaArr.length;i++){
            orriginaArr[i]= sc.nextInt();
        }
        //utilityArray(orriginaArr);

        int output[]=prefixSum(orriginaArr);
System.out.println("The new array is : ");
        utilityArray(output);
    }
}
