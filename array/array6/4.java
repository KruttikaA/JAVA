// two arry common element 
//

import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry size  ");

                int size=sc.nextInt();

                System.out.println("Enter arry1  element   ");

                int arr1[]=new int[size];

                System.out.println("Enter arry2  element   ");

                int arr2[]=new int[size];



                for (int i=0;i<size ;i++){
                        arr1[i]=sc.nextInt();
                }

             
                for (int i=0;i<size ;i++){
                        arr2[i]=sc.nextInt();
                }
		for(int i=0;i< arr1.length;i++){
			for(int j=0;j< arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr2[j]);
				}
			}
		}
	}
}



