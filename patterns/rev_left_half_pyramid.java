import java.util.*;

class Rev{
	void pattern(int n){
		
		for(int i=n;i>=1;i--){
			int space=n-i;
			for(int j=1;j<=space;j++){ 
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
						
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		Rev obj=new Rev();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		obj.pattern(n);
	}
}
