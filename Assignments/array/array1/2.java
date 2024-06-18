/*
 2. Take an input from the user where the size of the array should be 10 and print the
output of the user given elements of an array.
 * */

import java.util.*;
class Demo{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array Size");

		int size=sc.nextInt();

		System.out.println("Enter Arry element    ");

		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<size;i++){
			System.out.print(arr[i]);
		}
	}
}


