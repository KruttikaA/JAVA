//  key nim two time the print cube
//

import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry size  ");

                int size=sc.nextInt();

                System.out.print("Enter arry element   ");

                int arr[]=new int[size];

		System.out.print("Enter key num   ");
		int num=sc.nextInt();


                for (int i=0;i<size ;i++){
                        arr[i]=sc.nextInt();
                }
		for(int i=0;i<size;i++){
			if(num== arr[i]){
				arr[i]=arr[i]*arr[i]*arr[i];
			}
		}

		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
}

                


