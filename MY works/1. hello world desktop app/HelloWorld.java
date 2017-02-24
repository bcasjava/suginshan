 import javax.swing.*;
 public class HelloWorld {
	 //create and setup the window.
	 JFrame frame = new JFrame("Hello world");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 frame.setBounds(100, 100, 200, 100);
	 
	 JLabellabel = new JLabel("hello world");
	 frame.getContentPane().add(label);
	 
	 frame.setVisible(true);
	 
 }
 public static void main(String[] args) {
	 javax.swing.SwingUtilities.involeLater(new Runnable() {
		 public void run() {
			 createAndShowGUI();
		 }
	 });
 }