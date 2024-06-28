// two arry stroe in thrid arry
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
                int arr3[]= new int[arr1[].lengh + arr2[].length];

		for(int i=0;i< arr3.length;i++){
			arr3[i]=arr1[i];
			arr3[i]=arr2[i];
			System.out.println(arr3[i]);
		}
	}
}



