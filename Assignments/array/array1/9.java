/*
 9. Write a program where you have to print the odd indexed elements. Take input from
the user
Example :
Enter size: 10.
1 2 3 4 5 6 7 8 9 10
2 is an odd indexed element
4 is an odd indexed element
6 is an odd indexed element
8 is an odd indexed element
10 is an odd indexed element
 * */

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
                        if(i%2==1){
                                System.out.println(arr[i] +" is odd index no  "+ i);
                        }
                }

                }
        }


