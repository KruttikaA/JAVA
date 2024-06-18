/*
 8. Write a program where you have to store the employee’s age working at a company,
take count of employees from the user.Take input from the user.
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
			System.out.println("empoly no "+i  +" = "+ arr[i]);
		}
                        

                }
        }


