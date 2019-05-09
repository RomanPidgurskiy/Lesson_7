package ua.lviv.lgs;

public class Su_27 extends Plane implements Turbo_Acceleration,Technology_Stels,Nuclear_Udar{
	

	private int maxSpeed;
	private String color;
	
		public Su_27(int lenth, int width, int weigth,int maxSpeed, String color) {
		super(lenth, width, weigth);
		this.maxSpeed = maxSpeed;
		this.color = color;
		
	}

		@Override
		public void nuclearUdar() {
			int udar=(int)(Math.random()*10+5);
			System.out.println("The number of nuclear warheads has been reset: "+udar+" pcs");
			
		}

		@Override
		public void technologystels() {
			int times = (int)(Math.random()*60);
			System.out.println("The plane is not visible in the short run: "+times+" s");
			
		}

		@Override
		public void turboacceleration() {
			int acceleration = (int)(Math.random()*100);
			System.out.println("Speed at Turbo Acceleration: " +(maxSpeed+acceleration)+" km");
			
		}


}


