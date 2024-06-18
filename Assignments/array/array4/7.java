// convt lowe upper case

import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry size  ");

                int size=sc.nextInt();

                System.out.print("Enter arry element   ");

                char arr[]=new char[size];

                for (int i=0;i<size ;i++){
                        arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i< size;i++){
			if(arr[i]>= 'a' && arr[i]<= 'z'){
				arr[i]=(char)(arr[i]-32);
			}
		}

		for(int i=0;i< size;i++){
			System.out.println(arr[i]+"\t");
		}
	}
}

