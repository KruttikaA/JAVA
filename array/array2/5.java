/*
 5.Write a program to print the sum of odd indexed elements, in an array. Where you have
to take size input and elements input from the user .
Example:
Input:
Enter the size
5
Enter elements:
4
8
2
6
7
Output:
Sum of odd indexed elements : 14*/

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
                int sum=0;
                for(int i=0;i<size;i++){
                        if(arr[i]%2==1){
                                
                                sum+=arr[i];
                        }
                }

                System.out.println("sum "+sum);
        }
}



