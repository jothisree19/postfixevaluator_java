package demo;

public class car {
	String carname;
	public void showcar() {
		System.out.println("BMW its outer class");
	}
	class engine{
		String engine;
		public void showengine() {
			System.out.println("engine started its inner class");
			
		}
	}
	

	public static void main (String[] args){
		car obj=new car();
		obj.showcar(); 
		
		car.engine e=obj.new engine();
		e.showengine();
		
	}
	
}


