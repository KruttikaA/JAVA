import java.util.*;

class Triangle{
	void pattern(int n){
		for(int i=1 ;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println("");						
		}
	}
	public static void main(String[] args){
		Triangle obj=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");		
		int n=sc.nextInt();
		obj.pattern(n);
	}
}
