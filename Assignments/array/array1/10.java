/*
 10. Write a real-time example where you have to use the array. Take input from
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
                        
                                System.out.println("crickets jer no   "+arr[i]);
                        
                }

                }
        }


