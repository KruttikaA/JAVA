// factorial 
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
		for(int i=0;i< size ;i++){
			int fact=1;
			for(int j=1;j<=arr[i];j++){
				fact=fact*j;
			}
			System.out.println( "fact of no   "+fact);
		}
	}
}

	

