/*
 * 3. Write a program to print the even elements in the array. Take input from the user.
Example :
Enter size : 10
Array:
10 11 12 13 14 15 16 17 18 19
Output :
10
12
14
16
18*/

class Demo{
        public static void main(String[] args){
                int arr[] = {10,11,12,13,14,15,16,17,18,19};

		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				System.out.println(arr[i]);
			}
		}

	}

}


