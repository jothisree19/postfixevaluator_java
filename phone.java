package demo;

public class phone {
	int phoneNumber;
	public void showPhone() {
		System.out.println("samsung");
	}
     class Battery{
		int battery=40;
		public void showBattery() {
			System.out.println("Battery: " + battery + "%");
		}
			public void chargeBattery() {

	            System.out.println("Charging...");

	            battery = 60;

	            System.out.println("Battery: " + battery + "%");


			System.out.println("charging");
		}
	}
	
public static void main(String args[]) {
	phone obj=new phone();
	obj.showPhone();
	phone.Battery b = obj.new Battery();
	b.showBattery();
	b.chargeBattery();
}

}
