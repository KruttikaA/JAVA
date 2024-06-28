/*
 * 9. WAP to print the minimum element in the array, where you have to take the size and
elements from the user.
Example:
Input:
Enter the size
5
Enter elements:
5
6
9
-9
17
Output:*/
import java.util.*;

class Demo{

        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry Size");

                int size=sc.nextInt();
		
		System.out.println("enter arry list ");
                int arr[]=new int[size];

                for(int i=0;i<size;i++){

                        arr[i]=sc.nextInt();
                }

		int min=arr[0];		// assume the first no of arry list

                for(int i=0;i<size;i++){

			if(arr[i]< min){

				min=arr[i];
			}
		}
		System.out.println("minimum no is"+min);
	}
}
			


