// Q7
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
		for(int i=0;i< size;i++){
			if(arr[i]>= 'A' && arr[i] <= 'Z'){
				System.out.println((char) (arr[i]));
			}
			else{
				System.out.println(arr[i]);
			}
		}
	}
}


