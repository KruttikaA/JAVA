import java.util.*;

class Diamond{
	void pattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){ //spaces 
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=1;j<=n-i;j++){ //spaces 
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){ //spaces 
				System.out.print("*");
			}	
			System.out.println();		
		}
		
	}
	
	public static void main(String[] args){
		Diamond obj=new Diamond();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		obj.pattern(n);
	}
}
