

// Q6 
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
		System.out.print(" enter key num");
		int key=sc.nextInt();
                for (int i=0;i<size ;i++){
			if(arr[i]%key==0){
				System.out.println(key+ "key elemnt fount in index "+i);
			}
		}
	}
}
			
