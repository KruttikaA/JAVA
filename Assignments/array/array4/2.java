/*
 Q2.WAP to find the difference between minimum element in an array and maximum
element in an array, take input from the user.
Example :
Input:
Enter the size :
5
Enter the elements of the array:
3
6
9
8
10
Output
The difference between the minimum and maximum elements is: 7
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
		int max=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]> max){
				max=arr[i];
			}
		}

		int min=arr[0];
		for(int i=0;i<size;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		int diff=0;
		diff=max-min;
		System.out.println("diff of max or min  " +diff);
	}
}	

