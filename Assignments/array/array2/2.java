/*
 * 2.WAP to print the sum of elements divisible by 3 in the array, where you have to take the
size and elements from the user.
Example:
Enter size : 8
9 13 5 13 6 22 36 10
output:
Elements divisible by 3 : 9 6 36
Sum of elements divisible by 3 is: 51*/

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
                        if(arr[i]%3==0){
                                System.out.println("Divisible no  by 3   =" +arr[i]);
                                sum+=arr[i];
                        }
                }

                System.out.println("sum "+sum);
        }
}



