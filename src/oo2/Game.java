package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;


public class Game extends Canvas {
	public static void main(String[] args) {
		new Game();
	}

// create an array of 3 balls 
// call this array balls
	Ball[] balls = new Ball[3];
	
	//int x = 0;

	Game() {
		balls[0] = new Ball(45, 50, 40, 40);
		balls[1] = new Ball(175, 100, 25, 25, 2, 2);
		balls[2] = new Ball(240, 150, 60, 60);
		
		JFrame frame = new JFrame();
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
			
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};

		t.schedule(tt, 0, 50);

		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	public void draw() {
		for (Ball b : balls) {
			b.move();
		}
	// call the move() method of each balls
	// Tip: use an enhanced for loop to pick 
	//	  each ball in the balls array.
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0, 0, 300, 300);
		// draw each ball in balls array
		// Tip: See these examples of using the Graphics object
		g.setColor(Color.RED);
		g.fillRect(0, 0, 300, 300);
		for (Ball b : balls) {
			g.drawOval(b.x, b.y, b.w, b.h);
			g.setColor(Color.blue);
			g.fillOval(b.x,  b.y, b.w, b.h);
		}
		
		//x++;
	}
}

