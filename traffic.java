package demo;
enum traffics{
	RED,
	YELLOW,
	GREEN
}

public class traffic {
	public static void main(String[] args) {
		//obj creation line
		traffics t=traffics.RED;
		
		
		if(t==traffics.RED) {
			System.out.println("stop");
			System.out.println("u should stop when u see red light");
		}
		else if(t==traffics.YELLOW) {
			System.out.println("WAITING ");
		}
		else if(t==traffics.GREEN) {
			System.out.println("GOOOOO");
		}
	}
}


		
	


