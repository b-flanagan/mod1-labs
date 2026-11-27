package oo2;

public class Ball {
	public int x, y, w, h;
	private int dirX, dirY;
	
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY =dirY;	
	}
	
	public Ball(int x, int y, int w, int h) {
		this(x,y,w,h, 1, 1);	
	}
	
	public void move() {
		this.x += this.dirX;
		this.y += this.dirY;
		
		if (this.x < 0) {
			this.x = 0;
			this.dirX = -this.dirX;
		}
		
		if (this.y < 0) {
			this.y = 0;
			this.dirY = -this.dirY;
		}
		
		if(this.x > 300 - this.w) {
			this.x = 300 -this.w;
			this.dirX = -this.dirX;
		}
		
		if(this.y > 300 - this.h) {
			this.y = 300 - this.h;
			this.dirY = -this.dirY;
		}
	}
}
