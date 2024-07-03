import java.util.*;

class Numtriangle{
	void pattern(int n){
		for(int i=1 ;i<=n;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println("");						
		}
	}
	public static void main(String[] args){
		Numtriangle obj=new Numtriangle();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n : ");		
		int n=sc.nextInt();
		obj.pattern(n);
	}
}
