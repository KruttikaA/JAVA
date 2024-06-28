//  sum of odd and even 
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
		int even =0;
		int odd=0;
                for (int i=0;i<size ;i++){
			if(arr[i]%2==0){
				even=even+arr[i];
			}
			else{
				odd=odd+arr[i];
			}
		}
		System.out.println(even +"sum of even no");
		System.out.println(odd +"sum of dodd no");
	}
}

