package problem3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class detectArrow {
	
	public detectArrow (){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setFocusable(true);
		
		JPanel panel = new JPanel();
		JLabel up = new JLabel();
		JLabel down = new JLabel();
		JLabel left = new JLabel();
		JLabel right = new JLabel();
		panel.add(up);
		panel.add(down);
		panel.add(left);
		panel.add(right);
		
		up.setText("up,0");
		down.setText("down,0");
		left.setText("left,0");
		right.setText("right,0");
		
		frame.addKeyListener(new KeyListener() {
			int upCount = 0;
			int downCount = 0;
			int leftCount = 0;
			int rightCount = 0;
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				int keyCode = arg0.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_UP:
						up.setText("up"+ Integer.toString(upCount++));
						break;
					case KeyEvent.VK_DOWN:
						down.setText("down"+ Integer.toString(downCount++));
						break;
					case KeyEvent.VK_LEFT:
						left.setText("left"+ Integer.toString(leftCount++));
						break;
					case KeyEvent.VK_RIGHT:
						right.setText("right"+ Integer.toString(rightCount++));
						break;
				}
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.add(panel); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new detectArrow ();
	}

}
