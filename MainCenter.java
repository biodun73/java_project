/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public final class MainCenter extends JPanel {
 private final Border innerBorder;
 private final Border outerBorder;
 private final JLabel pictureLabel;
 ImageIcon image, image2, image3
 , image4, image5, image6, image7;
 int ballX;
 int ballY;
 int moveX=10;
 int moveY=10;
 int widthX = 530;
 int heightY = 370;
 int baby1X = 90;
 int baby1Y = 200;
 int baby2X = 400;
 int baby2Y = 200;
 int baby3X = 20;
 int baby3Y = 200;
 int baby4X = 480;
 int baby4Y = 200;
 int ballR = 20;
 int babyR = 25;
 int speedX=10;
 int speedY=10;
 Random randomX,randomY;
 DecimalFormat format, format1, format2;
 public MainCenter() {
  setLayout(new BorderLayout());
  setBackground(Color.white);
  // create inner border for panel
  innerBorder = BorderFactory.createLoweredBevelBorder();
  // create outer border for panel
  outerBorder = BorderFactory.createRaisedBevelBorder();
  // dimension for the layout panel
  pictureLabel = new JLabel();
  pictureLabel.setPreferredSize(new Dimension(560, 415));
  pictureLabel.setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
  add(pictureLabel, BorderLayout.WEST);
  randomX = new Random();
  randomY = new Random();
  this.ballX = randomX.nextInt(5) + 140;
  this.ballY = randomY.nextInt(5) + 200;
  format = new DecimalFormat("##.###");
  format1 = new DecimalFormat("##.###");
  format2 = new DecimalFormat("##.###");
  init();
 }
 public void init() {
 
  image = new ImageIcon("images/white.jpg");

  image2 = new ImageIcon("images/bricks2.jpg");

  image3 = new ImageIcon("images/baby3.png");

  image4 = new ImageIcon("images/baby1.png");

  image5 = new ImageIcon("images/baby2.png");

  image6 = new ImageIcon("images/baby4.png");

  image7 = new ImageIcon("images/ball.png");

 }

 @Override
 public void paintComponent(Graphics graphic) {
  for (int i = 0; i < 13; i++) {
   for (int j = 0; j < 16; j++) {
    super.paintComponents(graphic);
    Graphics2D g2d = (Graphics2D) graphic.create();
    g2d.drawImage(image.getImage(), j * 36, i * 34, 34, 32, this);
    g2d.drawImage(image2.getImage(), 250, 10, 50, 407, this);
    g2d.drawImage(image3.getImage(), this.baby3X, this.baby3Y, 50, 50, this);
    g2d.drawImage(image4.getImage(), this.baby1X, this.baby1Y, 50, 50, this);
    g2d.drawImage(image5.getImage(), this.baby2X, this.baby2Y, 50, 50, this);
    g2d.drawImage(image6.getImage(), this.baby4X, this.baby4Y, 50, 50, this);
    g2d.drawImage(image7.getImage(), this.ballX, this.ballY, 20, 20, this);
    g2d.dispose();
   }

  }

 }

 // create horizontal movement between the 2 babies
 
 public void moveBabyBall() {
  baby3VerticalMove();
  baby4VerticalMove();
  bounceOff();

 }
 //create position of ball 
 
 public int getBallPosisition() {
  int pos = 0;
  int xpos = this.ballX / 32;
  int ypos = this.ballY / 32;

  pos = xpos + (ypos * 16) + 1;
  return pos;
 }
 
 //create collision of ball and left baby
 
 public int setCollionLeftBaby() {
  int posX = this.ballX - this.baby3X;
  int posY = this.ballY - this.baby3Y;
  return  (int) Math.sqrt(Math.pow(posX, 2) + Math.pow(posY, 2));

 }
 
 //create collision of ball and right baby
 
 public int setCollionRightBaby() {
  int bounceX = this.ballX-this.baby4X;
  int bounceY = this.ballY-this.baby4Y;
  return (int) Math.sqrt(Math.pow(bounceX, 2) + Math.pow(bounceY, 2));

 }
 
 //set the hour 
 
 public String setHour() {
  double time = System.currentTimeMillis() / 1000;
  double h =time/3600;
  return format.format(h);
 }
 
 //set the minute
 
 public String setMin() {
  double time = System.currentTimeMillis()/1000;
  double min= time/60;
  return format1.format(min);
 }

 //set the second
 
 public String setSec() {
  double time = System.currentTimeMillis()/1000;
  double sec=(time / 1000) % 60;
  return format2.format(sec);
 }
 
 //create the ball to bounce off 
 
 public void bounceOff() {

  if (this.ballX > this.baby2X || this.ballX  < this.baby1X+50) {
   //this.speedX = this.speedX;
   if (this.ballX > this.widthX || this.ballX < 10) {
    this.speedX = -this.speedX;
   }
   if (this.ballY > this.heightY + 10 || this.ballY < 10) {
    this.speedY = -this.speedY;
   }
   //this.ballX += this.speedX;
   this.ballY += this.speedY;
  }
  this.ballX += this.speedX;
 }

 //vertical movement of left baby
 
 public void baby3VerticalMove() {
  // baby3 vertical movement
  if (this.baby3Y > 350 || this.baby3Y < 10) {
   this.moveY = -this.moveY;
  }
  this.baby3Y += this.moveY;
 }

 //vertical movement of right baby
 
 public void baby4VerticalMove() {
  // baby4 vertical movement
  if (this.baby4Y > 360 || this.baby4Y < 0) {
   this.moveY = -this.moveY;
  }
  this.baby4Y += this.moveY;
 }

 //create method move
 
public int move(int posXY ) {
	
	return posXY ;
	
}

}
