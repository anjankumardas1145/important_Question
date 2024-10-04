class Simple_max{
public static void main(String args[]){
int arr[]={9,7,89,89,76,54};
inrt ans=0;
for(int i=0;i<arr.length;i++){
if(arr[i]>ans){
ans=arr[i];
}
}
System.out.println("The maximum number in the array is : " +ans);
}
}
