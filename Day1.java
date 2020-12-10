/* Write a program , to take a user input n then 
 * 1)find the sum of the range 1 to n
 * 2)store the 1 to n numbers into array
 *  (1)find the how many elements in the given array are even  also find their sum 
 *  (2)find the how many elements in the given array are odd  also find their sum
 *  (3)find the how many elements in the given array are prime  also find their sum  
 */



import java.util.*;

public class Main {
	

	public static void functionFor(int x) {
		int sum=0;
		for(int i=0;i<=x;i++) {
			sum=sum+i;
		}
		System.out.println("Upto No. "+sum);
		
	}
	public static void functionOddEven(int x) {
		if(x %  2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	
	public static void functionArray(int x) {
		int sum=0,sum2=0,sum1=0;
		int flag=0;
		int arr[]=new int[x];
		Scanner s=new Scanner (System.in);
		
		for(int i=0;i<x;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<x;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array is :"+sum);
		
		
		
		
		for(int i=2;i<=sum/2;i++){
	 		if(sum % i == 0)
	 		{
				System.out.println("number is not prime number " +sum);
				flag=1;
				break; 
	 		}    
		} 
		if(flag == 0){
			System.out.println("number is   prime number " +sum); 
		}

		System.out.println("Odd Numbers:");  
		for( int i=0;i<arr.length;i++){  
			if(arr[i]%2!=0){  
				 sum2=sum2+arr[i];
				System.out.println(arr[i]);  
			}  
		} 
		System.out.println("sum of odd number:" +sum2);
		
		
		
		System.out.println("Even Numbers:");  
		for(int i=0;i<arr.length;i++){  
		if(arr[i]%2==0){ 
			sum1=sum1+arr[i];
			System.out.println(arr[i]);  
			} 
		
		}
		System.out.println("sum of even number:" +sum1);

		
	}
	
	public static void main(String[] args) {
		int a,b;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Elements in Array");
		a=s.nextInt();
		
	
		
		
		//functionFor(a);
		
		//functionOddEven(a);
		
		functionArray(a);
	}
}


*************************************************************************************


Enter Number of Elements in Array
7
Sum of Array is :28


Odd Numbers:
1
3
5
7
sum of odd number:16


Even Numbers:
2
4
6
sum of even number:12


prime number are:[2, 3, 5, 7]


prime number sum is:17
