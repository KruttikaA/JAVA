/*class Outer{
	void fun(){
		class Inner1{
			Inner1(){
				System.out.println("Inner 1 constructor");
			}
			void gun(){
				class Inner2{
					Inner2(){
						System.out.println("Inner 2 constructor");
					}	
			
				}
				Inner2 obj2=new Inner2();
			
			}
		}	
		Inner1 obj1=new Inner1();
		
		//obj1.gun();
	}
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.fun();
	}
}*/
class Outer{
	void fun(){
		class Inner1{
			Inner1(){
				System.out.println("Inner 1 constructor");
			}
			void gun(){
				class Inner2{
					Inner2(){
						System.out.println("Inner 2 constructor");
					}
					class Inner3{
						
					}	
			
				}
				Inner2 obj2=new Inner2();
				

			
			}
		}	
		Inner1 obj1=new Inner1();
		
		obj1.gun();
	}
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.fun();
	}
}
