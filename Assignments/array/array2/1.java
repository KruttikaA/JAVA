/*
 * 1.WAP to count the even numbers in an array where you have to take the size and
elements from the user. And also print the even numbers too
Example:
Enter size =8
1 12 55 65 44 22 36 10
Output : even numbers 12 44 22 36 10
Count of even elements is : 5*/

import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter arry Size");
		int size=sc.nextInt();

		int arr[]=new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				System.out.println("even no =" +arr[i]);
				count++;
			}
		}
		
		System.out.println("count "+count);
	}
}

