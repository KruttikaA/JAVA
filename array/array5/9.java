// Q9

//
import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry size  ");

                int num=sc.nextInt();

		int rem=0;              
	      	int count=0;
		int rev=0;
		int temp=num;
		while(temp>0){
			rem=temp%10;
			rev=rem+rev*10;
			
			count++;
			temp/=10;
			
		}
		int i=0;
		int arr[]=new int[count];
		int rem2=0;
		while(rev> 0){
			rem2=rev%10;
			arr[i]=rem+1;
			i++;
			rev/=10;
		}
		for( i=0;i< arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}



