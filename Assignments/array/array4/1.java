/*
 Q1.WAP to take input from the user for size and elements of an array, where you have to
print the average of array elements(Array should be of integers).
Example :
Input:
Enter the size:
4
Enter array elements:
2
4
6
8
Output:
Array elements' average is :5
 * */

import java.util.*;
class Demo{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter arry size  ");

		int size=sc.nextInt();

		System.out.print("Enter arry element   ");

		int arr[]=new int[size];

		for (int i=0;i<size ;i++){
			arr[i]=sc.nextInt();
		}
		int avg=0;
		int sum=0;
		for (int i=0;i<size ;i++){
			sum=sum+arr[i];
		}
		
		avg=sum/size;
		System.out.println("Arry element avg  " +avg);
	}
}


