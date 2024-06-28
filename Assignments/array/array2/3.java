/*
 * 3.WAP to check if there is any vowel in the array of characters if present then print its
index, where you have to take the size and elements from the user.
Example:
Input:
Enter the size
5
Enter elements:
arEKO
Output:
vowel a found at index 0
vowel E found at index 2
vowel O found at index 4i*/


import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);

                System.out.print("Enter arry Size");
                int size=sc.nextInt();

                int arr[]=new int[size];

                for(int i=0;i<size;i++){
                        arr[i]=sc.next().charAt(0);
                }
                
                for(int i=0;i<size;i++){
                        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='I'||arr[i]=='E'||arr[i]=='O'||arr[i]=='U'){
				System.out.println("vowel "+ (char)(arr[i]) +"  found the index "+ i);
                        }
                }

               
        }
}

