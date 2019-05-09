package ua.lviv.lgs;

public class Control_plane {
	 
	void moveUp() {
		
		int moving = (int)( Math.random()*100);
		System.out.println("Move the plane up to distance: " + moving );
	}

	void moveDown() {
		
		int moving = (int)( Math.random()*100);
		System.out.println("Move the plane down to distance: " + moving );
	}
	
	void moveLeft() {
		
		int moving = (int)( Math.random()*100);
		System.out.println("Move the plane left to distance: " + moving );
	}
	
	void moveRight() {
		
		int moving = (int)( Math.random()*100);
		System.out.println("Move the plane rigth to distance: " + moving );
	}
	
}
