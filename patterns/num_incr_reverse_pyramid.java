import java.util.*;

class Revpyra{
	void pattern(int n){
		for (int i=n;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Revpyra obj=new Revpyra();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		obj.pattern(n);
		
	}
}
