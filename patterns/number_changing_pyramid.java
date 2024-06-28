import java.util.*;

class Numincpry{
	void pattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}	
			System.out.println();	

		}
	}
	
	public static void main(String[] args){
		Numincpry obj=new Numincpry();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n=sc.nextInt();	
		obj.pattern(n);	
		
	
	}

}
