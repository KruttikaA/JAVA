/*
 6. Write a program where you have to take input from the user for a character array and
print the characters.*/

import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter arry Size  ");
		int size=sc.nextInt();

		int arr[]=new int [size];
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}

		for(int i=0;i<size;i++){
			System.out.println((char)(arr[i]));
		}
		
	}
}


