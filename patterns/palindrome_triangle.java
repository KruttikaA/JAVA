import java.util.*;

class Palindrome{
	void pattern(int n){
		for(int i=1;i<=n;i++){
			for (int j=1;j<=2*(n-i);j++){
				System.out.print(" ");
			}
			for (int j=i;j>=1;j--){
				System.out.print(j+" ");
			}
			for (int j=2;j<=i;j++){
				System.out.print(j+" ");
			}			
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n  :");
		Palindrome obj=new Palindrome();
		obj.pattern(sc.nextInt());
	}
}
