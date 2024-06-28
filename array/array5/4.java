// dupalicat no in arry
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
			for(int j=i+1;j< size ;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[j]  +"first dupalicat in " +i);
					break;
				}
			}
		}
	}
}



