/*
 Q3. WAP to find the second largest element in an array.
Example:
Input:
Enter the size :4
Enter the elements of the array:
1
2
3
4
Output:
The second largest element in the array is: 3
 * */
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
                int max=arr[0];
                for(int i=0;i<size;i++){
                        if(arr[i]> max){
                                max=arr[i];
                        }
                }

                int max2=arr[0];
                for(int i=0;i<size;i++){
                        if(arr[i]>= max2){
                                max2=arr[i];
                        }
                }
                System.out.println(max);
        }
}



