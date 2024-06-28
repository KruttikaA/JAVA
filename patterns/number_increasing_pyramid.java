import java.util.*;

class Numcngpry{
	void pattern(int n){
		int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num++ + " ");
			}	
			System.out.println();	

		}
	}
	
	public static void main(String[] args){
		Numcngpry obj=new Numcngpry();
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter value of n : ");
		int n=sc.nextInt();	
		obj.pattern(n);	
		
	
	}

}
