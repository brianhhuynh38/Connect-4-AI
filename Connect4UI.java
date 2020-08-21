import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Connect4UI {
	public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("CONNECT 4");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      final GameState state = new GameState();
	      final BoardDrawing board = new BoardDrawing(state);

	      JButton button1 = new JButton("1");
	      button1.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.move(1);
	            	board.repaint();
	            }
	         });
	      
	      JButton button2 = new JButton("2");
	      button2.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.move(2);
	            	board.repaint();
	            }
	         });
	      
	      JButton button3 = new JButton("3");
	      button3.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.move(3);
	            	board.repaint();
	            }
	         });
	      
	      JButton button4 = new JButton("4");
	      button4.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.move(4);
	            	board.repaint();
	            }
	         });
	      
	      JButton button5 = new JButton("5");
	      button5.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.move(5);
	            	board.repaint();
	            }
	         });
	      
	      JButton button6 = new JButton("6");
	      button6.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.move(6);
	            	board.repaint();
	            }
	         });
	      
	      JButton button7 = new JButton("7");
	      button7.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.move(7);
	            	board.repaint();
	            }
	         });
	      
	      JButton buttonUndo = new JButton("Undo");
	      buttonUndo.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.undo();
	            	board.repaint();
	            }
	         });
	      
	      JButton buttonRestart = new JButton("Restart");
	      buttonRestart.addActionListener(new
	         ActionListener()
	         {
	            public void actionPerformed(ActionEvent event)
	            {
	            	state.restart();
	            	board.repaint();
	            }
	         });

	      
	      JPanel buttons = new JPanel();
	      buttons.add(button1);
	      buttons.add(button2);
	      buttons.add(button3);
	      buttons.add(button4);
	      buttons.add(button5);
	      buttons.add(button6);
	      buttons.add(button7);
	      buttons.add(buttonUndo);
	      buttons.add(buttonRestart);

	      frame.add(board, BorderLayout.CENTER);
	      frame.add(buttons, BorderLayout.SOUTH);

	      frame.setSize(750, 550);
	      
	      frame.setVisible(true);
	   }
}
