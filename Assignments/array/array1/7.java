/*
 * 7. Write a program to print the elements of the array which is divisible by 4. Take input
from the user.
Example:
Enter size: 10
14 20 18 9 11 51 16 2 8 10
Output:
20 is divisible by 4 and its index is 1
16 is divisible by 4 and its index is 6
8 is divisible by 4 and its index is 8*/

import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.println("Enter Array Size");

                int size=sc.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<size;i++){
			if(arr[i]%4==0){
				System.out.println(arr[i] +" is adivisible by 4 nd index is  "+ i);
			}
		}

                }
        }


