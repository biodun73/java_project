/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author johns
 */
@SuppressWarnings("serial")
public final class CBabyBallBounce extends JFrame {
 private  SouthPanel southpanel = new SouthPanel();
 private  SidePanel sidepanel = new SidePanel();
 private  MainCenter maincenter = new MainCenter();
 private  BarPanel bar = new BarPanel();
 private  int dimD = 600;
 private  int dimH = 300;
 private JPanel panel1;
 private JPanel panel2;
 private JPanel panel3;
 private JPanel panel4;
 private Timer timer;
 int counter1=0;
 int counter2=0;
 private Container container;
 public CBabyBallBounce() {
  super("Baby Ball Bounce Application");
  setLocationRelativeTo(null);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setResizable(false);
  
  kickBall();
  init();
  timer();
  
  //initialize the movement of the ball
  
  southpanel.button1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==southpanel.button1) {
			maincenter.ballX+=maincenter.speedX;
			repaint();
		}	
	} 
  });
  

  //play the game 
  
  sidepanel.sub6.button1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sidepanel.sub6.button1) {
			maincenter.bounceOff();
			timer.start();
		}
	}
	  
  });
  
  //exit the game application 
  
  sidepanel.sub6.button4.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sidepanel.sub6.button4) {
			System.exit(0);
		}
	}
	  
  });
  
  //reset or stop the game
  
  
  southpanel.button3.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==southpanel.button3) {
			timer.stop();
			repaint();
		}
		
	}
	  
  });

 }
 
 //kick ball method
 
 public void kickBall() {
	 
    int left = maincenter.ballX; //initialize variable left
	int right = maincenter.ballX;//initialize variable right
    int up = maincenter.ballY;//initialize variable up
    int down = maincenter.ballY;//initialize variable down
   
 //move the ball to the left
    
	  sidepanel.sub4.button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==sidepanel.sub4.button4) {
					maincenter.move(left);
					maincenter.ballX-=maincenter.speedX;
					repaint();
				}
				
			}
			  
		  });
	  
	  //move the ball the right
	  
	  sidepanel.sub4.button6.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==sidepanel.sub4.button6) {
				maincenter.move(right);
				maincenter.ballX+=maincenter.speedX;
				repaint();
			}
		
		}
		  
	  });
	  
	//move the ball up
	  
	sidepanel.sub4.button2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    if(e.getSource()==sidepanel.sub4.button2) {
		    	maincenter.move(up);
		    	maincenter.ballY-=maincenter.speedY;
		    	repaint();
		    }
		}
		  
	  });
	  
	//move the ball down
	
	 sidepanel.sub4.button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==sidepanel.sub4.button8) {
					maincenter.move(down);
					maincenter.ballY+=maincenter.speedY;
					repaint();
				}
				
			}
			  
		  });

 }
 
 
 //timer method here
 
 
 public void timer() {

  timer = new Timer(100, (ActionEvent ae) -> {
  maincenter.moveBabyBall();
  getBallPosition();
  setHour();
  setMin();
  setSec();
  setCollionLeftBaby();
  setCollionRightBaby();
  repaint();
  }); 
 }
 
 //initial where all method were kept
 
 public void init() {
  container = getContentPane();
  container.setLayout(new BorderLayout());
  menu(); //menu panel in the main frame//
  centerPanel(); //center panel in the main frame//
  southPanel(); //south panel in the main frame //
  sidePanel(); //side panel in the main frame//
 
 }
 
 //create timer
 
 public void setHour() {
  String h = maincenter.setHour();
  sidepanel.sub2.field1.setText(String.valueOf(h));
 }
 
 //create timer
 
 public void setMin() {
  String m = maincenter.setMin();
  sidepanel.sub2.field2.setText(String.valueOf(m));
 }
 
 //create timer
 
 public void setSec() {
  String s = maincenter.setSec();
  sidepanel.sub2.field3.setText(String.valueOf(s));
 }
 
 //create position
 
 public void getBallPosition() {
  int pos = maincenter.getBallPosisition();
  sidepanel.sub3.field4.setText(String.valueOf(pos));
 }

 
 //create collision 
 
 public void setCollionLeftBaby() {
  int posX = maincenter.setCollionLeftBaby();
  int posY = maincenter.setCollionLeftBaby();
  if (posX + posY > maincenter.baby3X && posX + posY < maincenter.baby3Y) {
	  counter1++;
	  maincenter.speedX =-maincenter.speedX;
      sidepanel.sub3.field1.setText(String.valueOf(counter1));
  }
 }

 // create collision
 
 public void setCollionRightBaby() {
  int bounceX = maincenter.setCollionRightBaby();
  int bounceY = maincenter.setCollionRightBaby();
  if (bounceX+bounceY < maincenter.baby4X && bounceX+bounceY < maincenter.baby4Y) {
	 counter2+=1;
     maincenter.speedX =-maincenter.speedX;
     sidepanel.sub3.field2.setText(String.valueOf(counter2));
   
  }
 }

 //set up the main method of Menu from BarPanel()
 
 public void menu() {
  panel4 = new JPanel();
  panel4.add(bar);
  container.add(panel4, BorderLayout.NORTH);
 }

 //set up the main method of  center panel from CenterPanel()
 
 public void centerPanel() {
  panel1 = new JPanel();
  panel1.setPreferredSize(new Dimension(dimD, dimH));
  //set border 
  panel1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5));
  panel1.add(maincenter);
  container.add(panel1, BorderLayout.LINE_START);
 }

 // set up of the main south panel from SouthPanel()
 
 public void southPanel() {
  panel2 = new JPanel();
  panel2.add(southpanel);
  container.add(panel2, BorderLayout.SOUTH);
  southpanel.button2.addActionListener((ActionEvent ae) -> {
   timer.start();
  });
 
  //slide the slider to increase the speed
  
  southpanel.slider.addChangeListener((ChangeListener) -> {
   int speed = southpanel.slider.getValue();
   if (speed > maincenter.speedX) {
    maincenter.speedX += 5;
   }
  });

 }

 // set up of the main side panel from SidePanel()//
 
 public void sidePanel() {
  panel3 = new JPanel();
  panel3.setPreferredSize(new Dimension(220, 550));
  panel3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
  panel3.add(sidepanel);
  container.add(panel3, BorderLayout.EAST);

 }



}


