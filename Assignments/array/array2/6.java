/*
 * 6.Write a program to print the products of odd indexed elements in an array. Where you
have to take size input and elements input from the user.
Note:
Example:
Input:
Enter the size
6
Enter elements:
1
2
3
4
5
6
Output:
product of odd indexed elements : 48*/


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
                int pro=1;
                for(int i=0;i<size;i++){
                        if(arr[i]%2==1){
                                
                                pro*=arr[i];
                        }
                }

                System.out.println("product of odd index   "+pro);
        }
}



