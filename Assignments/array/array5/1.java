// Acending order 

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
		int flag=0;

                for (int i=0;i<size-1 ;i++){
			if(arr[i] < arr[i+1]){
			}
			else{
				flag=1;
				break;
			}
		}
		if(flag == 0){
			System.out.println("Arry is asending order ");
		}
		else{
			System.out.println("Arry is disending orde ");
		}
	}
}



