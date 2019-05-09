package ua.lviv.lgs;

public abstract class  Plane extends Control_plane {
	
	private int lenth;
	private int width;
	private int weigth;
	
	
	
    public Plane(int lenth, int width, int weigth) {
		super();
		this.lenth = lenth;
		this.width = width;
		this.weigth = weigth;
	}
	
	
	void EngineON() {
		
		int time = (int)(Math.random()*(88-20+1)+20);
		System.out.println("Time before departure of the plane:" + time);
	}
	
	
	void Takeoff_Plane() {
		int distance =(int) (Math.random()*1000);
		System.out.println("Distance traveled by plane in the upward lane: " + distance );
	}

     void Landing() {
    	 System.out.println("The plane is approaching");
     }
     
}
