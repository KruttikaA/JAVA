// sum of prime no code 
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
		int prco=0;
		int sum=0;

                for (int i=0;i<size-1 ;i++){
			int count=0;
			for(int j=1;j<= arr[i];j++){
				if(arr[i]%j==0){
					count++;
					prco++;
				}
			}
			if(count ==2){
				sum=sum+arr[i];
			}
		}
		System.out.println(sum+ "  sum of prime no and total primr no is "+prco);
	}
}
                        


