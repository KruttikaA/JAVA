import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry size  ");

                int size=sc.nextInt();

		System.out.print("Enter a num occ");
		int num=sc.nextInt();

                System.out.print("Enter arry element   ");

                int arr[]=new int[size];

                for (int i=0;i<size ;i++){
                        arr[i]=sc.nextInt();
                }
		int count=0;

                for (int i=0;i<size ;i++){
			if(num==arr[i]){
				count++;
			}
		}
		if(count >=2){
			System.out.println(num +"Num is more the   " +count);
		}
		else{
			System.out.println("No not a found  ");
		}
	}
}



