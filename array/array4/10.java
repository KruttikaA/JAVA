// key chr not print 
//
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
		System.out.print("Enter key char   ");
		char ch =sc.next().charAt(0);

                for (int i=0;i<size ;i++){
			if(ch == arr[i]){
			break;
			}
		
			else{
			System.out.println(arr[i]);
			}
		}
	}
}


