// revsed no print 

import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry size  ");

                int size=sc.nextInt();

                System.out.print("Enter arry element   ");

                int arr[]=new int[size];

                for (int i=0;i<size ;i++){
                        arr[i]=sc.nextInt();
                }
		int temp=0;

                for (int i=0;i<size/2 ;i++){
			temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}

                for (int i=0;i<size ;i++){
			System.out.println( "revesed element   "+arr[i]);
		}
	}
}

