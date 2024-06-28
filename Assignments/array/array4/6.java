// vovel count and conconet count 
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
		int vovel=0;
		int consunt=0;
                for (int i=0;i<size ;i++){
			if(arr[i]=='A' || arr[i]=='E' ||arr[i]=='I' ||arr[i]=='O' ||arr[i]=='U' ||arr[i]=='a' || arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u'){
			vovel++;
		}
		else{
			consunt++;
		}
		}
		System.out.println( "count of vovel " +vovel );
		System.out.println("count of consunt "+consunt);
	

	}
}


