// palidrome or not a palidrome 
//
import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry size  ");

                int size=sc.nextInt();
		
                System.out.print("Enter arry element   ");

                int arr[]=new int[size];
		int temparr[]=new int[size];
                for (int i=0;i<size ;i++){
                        arr[i]=sc.nextInt();
			temparr[i]=arr[i];

                }
		
                for (int i=0;i<size/2 ;i++){
			int temp=arr[i];
			arr[i]=arr[size-1-i];
			arr[size-1-i]=temp;
		}
		int flag=0;
		for(int i=0;i<size;i++){
			if(arr[i]==temparr[i]){
			}
			else{
			flag=1;
			break;
			}
		}
		if(flag==0){
			System.out.println("palidrom");
		}
		else{
			System.out.println("not a palidrome ");
		}
	}
}


