import java.util.Scanner;
class AltPrmNoo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		int primeCount=0;
		String s="";
		for(int j=1;j<=range;j++){
			int n=j;
			int count=0;
			if(n<=1){
				count++;
			}
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					count++;
					break;
				}
			}
			if(count==0){
				primeCount++;
				if(primeCount%2!=0){
					s+=j+" ";
				}
			}
			
		}
		System.out.print("The alternate prime number is: "+ s);
		
	}
}