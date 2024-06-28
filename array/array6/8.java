// revse no Q8

import java.util.*;
class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry size  ");

                int size=sc.nextInt();

                System.out.print("Enter arry element   ");

                char  arr[]=new char[size];

                for (int i=0;i<size ;i++){
                        arr[i]=sc.next().charAt(0);
                }

                for (int i=0;i<size ;i+=2){
                        System.out.println("Before revsed " +arr[i]);
                }


               char temp=0;

                for (int i=0;i<size/2 ;i++){
                        temp=arr[i];
                        arr[i]=arr[size-1-i];
                        arr[size-1-i]=temp;
                }

                for (int i=0;i<size ;i+=2){
                        System.out.println( " after revesed element   "+arr[i]);
                }
        }
}
                           


