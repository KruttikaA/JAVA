/**4. Write a program to print the sum of odd elements in an array.Take input from the user.
Example:
Enter size: 10
Array:
1 2 3 4 2 5 6 2 8 10
Output :
Sum of odd elements : 9
*/

import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.println("Enter Array Size");

                int size=sc.nextInt();

		System.out.print("Enter Arry element   ");
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
		int sum=0;
                for(int i=0;i<size;i++){
                        if(arr[i]%2==1){
				sum=sum+arr[i];
			}
		}
		System.out.println("sum ==" +sum);

                }
        }



