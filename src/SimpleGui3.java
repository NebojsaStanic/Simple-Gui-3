import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleGui3 implements ActionListener {
	
	JFrame frame;

	public static void main(String[] args) {
		SimpleGui3 gui = new SimpleGui3();
		gui.go();
	}
	
	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change colors");
		button.addActionListener(this);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		frame.getContentPane().add(drawPanel, BorderLayout.CENTER);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.repaint();
		
	}

}

class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		int red = (int) (Math.random()*255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);
		Color color = new Color(red, green, blue);
		
		g2d.setPaint(color);
		g2d.fillOval(75, 75, 100, 100);
	}
}
