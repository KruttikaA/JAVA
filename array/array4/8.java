// occurance in a charecter 
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
		System.out.print("Enter key ch   ");
		char ch=sc.next().charAt(0);
		int count=0;
                for (int i=0;i<size ;i++){
			if(ch==arr[i]){
				count++;
			}
		}
		if(count <=2){
			System.out.println(ch +"2 times in given arry ");
		}
		else{
			System.out.println("Not found ");
		}
	}
}



