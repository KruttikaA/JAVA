//  arry no of count 
//
//
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

                for (int i=0;i<size ;i++){
			int count=0;
			while(arr[i] >0){
				arr[i]/=10;
				count++;
				
			}
			System.out.println(count);
		}
	}
}


