//
//
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
                        int j=1;
                        int count=0;
                        while(j <= arr[i]){
                                if(arr[i] %j == 0){
                                count++;
                        }
                        j++;
                }
                if(count !=2){
                        System.out.println(arr[i] +" compositw no of "+i);
                        
                }
                }
        }
}


 


