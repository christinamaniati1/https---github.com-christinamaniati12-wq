/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballsV2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Owner
 */
public class GameStateAndAction {
   
  
    
    private static String collisionType="none";
    private static boolean endSignal;
    
    private static boolean isSpeedChanged1 = false;
    private static boolean isSpeedChanged2 = false;
    private static boolean isSpeedChanged3 = false;
    private static boolean isSpeedChanged4 = false;
    private static boolean isSpeedChanged5 = false;
    
    private static int sliderAngle1;
    private static int sliderAngle2;
    private static int sliderAngle3;
    private static int sliderAngle4;
    private static int sliderAngle5;
    
    private static int sliderMass1;
    private static int sliderMass2;
    private static int sliderMass3;
    private static int sliderMass4;
    private static int sliderMass5;
    
    private static int sliderRadius1;
    private static int sliderRadius2;
    private static int sliderRadius3;
    private static int sliderRadius4;
    private static int sliderRadius5;
    
    private static float speed1;
    private static float speed2;
    private static float speed3;
    private static float speed4;
    private static float speed5;
    
    private static BufferedWriter writer = null;
    private static frmMain frame;
    private static JPanel panel;
    private static Long timeInMillis = 1L;
    private static boolean isTimerEnabled = false;
    private static ArrayList<Ball> balls;
    private static boolean isCollide=false;
    //private static boolean displayMsg=false;
    
    public static void initialize(){
        timeInMillis = 0l;
        try {
            writer = new BufferedWriter(new FileWriter(new File("CollionMonitor.csv")));
            writer.append("Time(in milliseconds)"
                    + ",Ball Name,Ball X-coordinate,Ball Y-coordinate, Ball Radius ,Ball Angle,"
                    + "Ball X-Velocity, Ball Y-Velocity,"
                    + "Collision Type\n");
                    
                   
        } catch (Exception ex) {
        }
    }

    /**
     * @return the balls
     */
    public static ArrayList<Ball> getBalls() {
        return balls;
    }

    /**
     * @param aBalls the balls to set
     */
    public static void setBalls(ArrayList<Ball> aBalls) {
        balls = aBalls;
    }

    /**
     * @return the frame
     */
    public static frmMain getFrame() {
        return frame;
    }

    /**
     * @param aFrame the frame to set
     */
    public static void setFrame(frmMain aFrame) {
        frame = aFrame;
    }

    /**
     * @return the panel
     */
    public static JPanel getPanel() {
        return panel;
    }

    /**
     * @param aPanel the panel to set
     */
    public static void setPanel(JPanel aPanel) {
        panel = aPanel;
    }

    /**
     * @return the isTimerEnabled
     */
    public static boolean isIsTimerEnabled() {
        return isTimerEnabled;
    }

    /**
     * @param aIsTimerEnabled the isTimerEnabled to set
     */
    public static void setIsTimerEnabled(boolean aIsTimerEnabled) {
        isTimerEnabled = aIsTimerEnabled;
    }

    /**
     * @return the collisionType
     */
    public static String getCollisionType() {
        return collisionType;
    }

    /**
     * @param aCollisionType the collisionType to set
     */
    public static void setCollisionType(String aCollisionType) {
        collisionType = aCollisionType;
    }

    /**
     * @return the isSpeedChanged3
     */
    public static boolean isIsSpeedChanged3() {
        return isSpeedChanged3;
    }

    /**
     * @param aIsSpeedChanged3 the isSpeedChanged3 to set
     */
    public static void setIsSpeedChanged3(boolean aIsSpeedChanged3) {
        isSpeedChanged3 = aIsSpeedChanged3;
    }

    /**
     * @return the isSpeedChanged4
     */
    public static boolean isIsSpeedChanged4() {
        return isSpeedChanged4;
    }

    /**
     * @param aIsSpeedChanged4 the isSpeedChanged4 to set
     */
    public static void setIsSpeedChanged4(boolean aIsSpeedChanged4) {
        isSpeedChanged4 = aIsSpeedChanged4;
    }

    /**
     * @return the isSpeedChanged5
     */
    public static boolean isIsSpeedChanged5() {
        return isSpeedChanged5;
    }

    /**
     * @param aIsSpeedChanged5 the isSpeedChanged5 to set
     */
    public static void setIsSpeedChanged5(boolean aIsSpeedChanged5) {
        isSpeedChanged5 = aIsSpeedChanged5;
    }

    /**
     * @return the sliderAngle3
     */
    public static int getSliderAngle3() {
        return sliderAngle3;
    }

    /**
     * @param aSliderAngle3 the sliderAngle3 to set
     */
    public static void setSliderAngle3(int aSliderAngle3) {
        sliderAngle3 = aSliderAngle3;
    }

    /**
     * @return the sliderAngle4
     */
    public static int getSliderAngle4() {
        return sliderAngle4;
    }

    /**
     * @param aSliderAngle4 the sliderAngle4 to set
     */
    public static void setSliderAngle4(int aSliderAngle4) {
        sliderAngle4 = aSliderAngle4;
    }

    /**
     * @return the sliderAngle5
     */
    public static int getSliderAngle5() {
        return sliderAngle5;
    }

    /**
     * @param aSliderAngle5 the sliderAngle5 to set
     */
    public static void setSliderAngle5(int aSliderAngle5) {
        sliderAngle5 = aSliderAngle5;
    }

    /**
     * @return the sliderMass3
     */
    public static int getSliderMass3() {
        return sliderMass3;
    }

    /**
     * @param aSliderMass3 the sliderMass3 to set
     */
    public static void setSliderMass3(int aSliderMass3) {
        sliderMass3 = aSliderMass3;
    }

    /**
     * @return the sliderMass4
     */
    public static int getSliderMass4() {
        return sliderMass4;
    }

    /**
     * @param aSliderMass4 the sliderMass4 to set
     */
    public static void setSliderMass4(int aSliderMass4) {
        sliderMass4 = aSliderMass4;
    }

    /**
     * @return the sliderMass5
     */
    public static int getSliderMass5() {
        return sliderMass5;
    }

    /**
     * @param aSliderMass5 the sliderMass5 to set
     */
    public static void setSliderMass5(int aSliderMass5) {
        sliderMass5 = aSliderMass5;
    }

    /**
     * @return the sliderRadius3
     */
    public static int getSliderRadius3() {
        return sliderRadius3;
    }

    /**
     * @param aSliderRadius3 the sliderRadius3 to set
     */
    public static void setSliderRadius3(int aSliderRadius3) {
        sliderRadius3 = aSliderRadius3;
    }

    /**
     * @return the sliderRadius4
     */
    public static int getSliderRadius4() {
        return sliderRadius4;
    }

    /**
     * @param aSliderRadius4 the sliderRadius4 to set
     */
    public static void setSliderRadius4(int aSliderRadius4) {
        sliderRadius4 = aSliderRadius4;
    }

    /**
     * @return the sliderRadius5
     */
    public static int getSliderRadius5() {
        return sliderRadius5;
    }

    /**
     * @param aSliderRadius5 the sliderRadius5 to set
     */
    public static void setSliderRadius5(int aSliderRadius5) {
        sliderRadius5 = aSliderRadius5;
    }

    /**
     * @return the speed3
     */
    public static float getSpeed3() {
        return speed3;
    }

    /**
     * @param aSpeed3 the speed3 to set
     */
    public static void setSpeed3(float aSpeed3) {
        speed3 = aSpeed3;
    }

    /**
     * @return the speed4
     */
    public static float getSpeed4() {
        return speed4;
    }

    /**
     * @param aSpeed4 the speed4 to set
     */
    public static void setSpeed4(float aSpeed4) {
        speed4 = aSpeed4;
    }

    /**
     * @return the speed5
     */
    public static float getSpeed5() {
        return speed5;
    }

    /**
     * @param aSpeed5 the speed5 to set
     */
    public static void setSpeed5(float aSpeed5) {
        speed5 = aSpeed5;
    }

  
   


    /**
     * @return the writer
     */
    public static BufferedWriter getWriter() {
        return writer;
    }

    /**
     * @param aWriter the writer to set
     */
    public static void setWriter(BufferedWriter aWriter) {
        writer = aWriter;
    }

    /**
     * @return the isSpeedChanged
     */
    public static boolean isIsSpeedChanged1() {
        return isSpeedChanged1;
    }

    /**
     * @param aIsSpeedChanged the isSpeedChanged to set
     */
    public static void setIsSpeedChanged1(boolean aIsSpeedChanged1) {
        isSpeedChanged1 = aIsSpeedChanged1;
    }

    /**
     * @return the isSpeedChanged2
     */
    public static boolean isIsSpeedChanged2() {
        return isSpeedChanged2;
    }

    /**
     * @param aIsSpeedChanged2 the isSpeedChanged2 to set
     */
    public static void setIsSpeedChanged2(boolean aIsSpeedChanged2) {
        isSpeedChanged2 = aIsSpeedChanged2;
    }

    /**
     * @return the sliderAngle1
     */
    public static int getSliderAngle1() {
        return sliderAngle1;
    }

    /**
     * @param aSliderAngle1 the sliderAngle1 to set
     */
    public static void setSliderAngle1(int aSliderAngle1) {
        sliderAngle1 = aSliderAngle1;
    }

    /**
     * @return the sliderAngle2
     */
    public static int getSliderAngle2() {
        return sliderAngle2;
    }

    /**
     * @param aSliderAngle2 the sliderAngle2 to set
     */
    public static void setSliderAngle2(int aSliderAngle2) {
        sliderAngle2 = aSliderAngle2;
    }

    /**
     * @return the sliderMass1
     */
    public static int getSliderMass1() {
        return sliderMass1;
    }

    /**
     * @param aSliderMass1 the sliderMass1 to set
     */
    public static void setSliderMass1(int aSliderMass1) {
        sliderMass1 = aSliderMass1;
    }

    /**
     * @return the sliderMass2
     */
    public static int getSliderMass2() {
        return sliderMass2;
    }

    /**
     * @param aSliderMass2 the sliderMass2 to set
     */
    public static void setSliderMass2(int aSliderMass2) {
        sliderMass2 = aSliderMass2;
    }

    /**
     * @return the sliderRadius1
     */
    public static int getSliderRadius1() {
        return sliderRadius1;
    }

    /**
     * @param aSliderRadius1 the sliderRadius1 to set
     */
    public static void setSliderRadius1(int aSliderRadius1) {
        sliderRadius1 = aSliderRadius1;
    }

    /**
     * @return the sliderRadius2
     */
    public static int getSliderRadius2() {
        return sliderRadius2;
    }

    /**
     * @param aSliderRadius2 the sliderRadius2 to set
     */
    public static void setSliderRadius2(int aSliderRadius2) {
        sliderRadius2 = aSliderRadius2;
    }

    /**
     * @return the speed1
     */
    public static float getSpeed1() {
        return speed1;
    }

    /**
     * @param aSpeed1 the speed1 to set
     */
    public static void setSpeed1(float aSpeed1) {
        speed1 = aSpeed1;
    }

    /**
     * @return the speed2
     */
    public static float getSpeed2() {
        return speed2;
    }

    /**
     * @param aSpeed2 the speed2 to set
     */
    public static void setSpeed2(float aSpeed2) {
        speed2 = aSpeed2;
    }

    /**
     * @return the endSignal
     */
    public static boolean isEndSignal() {
        return endSignal;
    }

    /**
     * @param aEndSignal the endSignal to set
     */
    public static void setEndSignal(boolean aEndSignal) {
        endSignal = aEndSignal;
    }

    
   

    public static void checkAndHandleCollision(Ball ball) {
         
         
        for (Ball tmpBall : getBalls()) {
            if (ball.getX() == tmpBall.getX() && ball.getY() == tmpBall.getY()) {
                //displayMsg=false;
                continue;
                
            } //excluding same ball
            double xDiff = tmpBall.getX()-ball.getX();
            double yDiff =tmpBall.getY()-ball.getY();
            double sumRadius = tmpBall.getRadius()+ball.getRadius();
            double sqrRadius = sumRadius*sumRadius;
            double distSqr = (xDiff*xDiff)+(yDiff*yDiff);
           
           
                      
            if ((distSqr <=sqrRadius) && (GameStateAndAction.getCollisionType().equals("inelastic") || GameStateAndAction.getCollisionType().equals("elastic"))) {
                 
                  
                 collideBalls(ball,tmpBall,GameStateAndAction.getCollisionType());
            
            }else{
                //displayMsg=false;
                 
                
            }
        }
    }

    private static void collideBalls(Ball ball1,Ball ball2, String collisionType) {
      

      double dx = ball1.getX()- ball2.getX();
      double dy = ball1.getY()- ball2.getY();

      double collisionAngle = Math.atan2(dy, dx);

      double speed1 = Math.sqrt((ball1.getDx() * ball1.getDx()) + (ball1.getDy()*ball1.getDy()));
      double speed2 = Math.sqrt((ball2.getDx() * ball2.getDx()) + (ball2.getDy()*ball2.getDy()));    
      
     
      double direction1 = Math.atan2(ball1.getDy(), ball1.getDx());
      double direction2 = Math.atan2(ball2.getDy(), ball2.getDx());
      

      double velocityx_1 = speed1 * Math.cos(direction1 - collisionAngle);
      double velocityy_1 = speed1 * Math.sin(direction1 - collisionAngle);
      double velocityx_2 = speed2 * Math.cos(direction2 - collisionAngle);
      double velocityy_2 = speed2 * Math.sin(direction2 - collisionAngle);
      double final_velocityx_1=0;
      double final_velocityx_2=0;
      double final_velocityy_1=0;
      double final_velocityy_2=0;
              
      if(collisionType.equals("inelastic")){
          //double collisionPointX = ((ball1.getX()* ball2.getRadius()) + (ball2.getX() * ball1.getRadius()))  / (ball1.getRadius() + ball2.getRadius());
          //double collisionPointY = ((ball1.getY() * ball2.getRadius()) + (ball2.getY() * ball1.getRadius())) / (ball1.getRadius() + ball2.getRadius());
          //String collX=String.format("0.2%f",collisionPointX);
          //String collY=String.format("0.2%f",collisionPointY);
                
          final_velocityx_1 = (ball1.getMass() * ball1.getDx() + ball2.getMass() * ball2.getDx()) / (ball1.getMass() + ball2.getMass());
          final_velocityx_2 = (ball1.getMass() * ball1.getDx() + ball2.getMass() * ball2.getDx()) / (ball1.getMass() + ball2.getMass());
          final_velocityy_1 = (ball1.getMass() * ball1.getDy() + ball2.getMass() * ball2.getDy()) / (ball1.getMass() + ball2.getMass());
          final_velocityy_2 = (ball1.getMass() * ball1.getDy() + ball2.getMass() * ball2.getDy()) / (ball1.getMass() + ball2.getMass());
          /*if(displayMsg==false){
              JOptionPane.showMessageDialog(null,"Collision occurred between object at \nlocation P("+collX+","+collY+")New Balls Velocity(x): "+final_velocityx_1 +"Velocity(y): "+final_velocityy_1 ,"Collision Detected", JOptionPane.INFORMATION_MESSAGE);
              displayMsg=true;
          }*/
          
      }else if(collisionType.equals("elastic")){
         final_velocityx_1 = ((ball1.getMass() - ball2.getMass())* velocityx_1+ (ball2.getMass()+ball2.getMass())*velocityx_2)/(ball1.getMass()+ball2.getMass());
         final_velocityx_2 = ((ball1.getMass() + ball1.getMass())* velocityx_1+ (ball2.getMass()-ball1.getMass())*velocityx_2)/(ball1.getMass()+ball2.getMass());   
         final_velocityy_1 = velocityy_1;
         final_velocityy_2 = velocityy_2;  
      }
     
      
      
      ball1.setDx(Math.cos(collisionAngle) * final_velocityx_1 + Math.cos(collisionAngle + Math.PI/2) * final_velocityy_1);
      ball1.setDy(Math.sin(collisionAngle) * final_velocityx_1 + Math.sin(collisionAngle + Math.PI/2) * final_velocityy_1);
      ball2.setDx(Math.cos(collisionAngle) * final_velocityx_2 +Math.cos(collisionAngle + Math.PI/2) * final_velocityy_2);
      ball2.setDy(Math.sin(collisionAngle) * final_velocityx_2 +Math.sin(collisionAngle + Math.PI/2) * final_velocityy_2);
      if(ball1.getName().equals("Ball1") ){
          
          getFrame().setJTextFieldBall1VelX(final_velocityx_1);
          getFrame().setJTextFieldBall1VelY(final_velocityy_1);
         
      }else if (ball1.getName().equals("Ball2")){
          getFrame().setJTextFieldBall2VelX(final_velocityx_1);
          getFrame().setJTextFieldBall2VelY(final_velocityy_1);
      }
      else if (ball1.getName().equals("Ball3")){
          getFrame().setJTextFieldBall3VelX(final_velocityx_1);
          getFrame().setJTextFieldBall3VelY(final_velocityy_1);
      }else if (ball1.getName().equals("Ball4")){
          getFrame().setJTextFieldBall4VelX(final_velocityx_1);
          getFrame().setJTextFieldBall4VelY(final_velocityy_1);
      }else{
          getFrame().setJTextFieldBall5VelX(final_velocityx_1);
          getFrame().setJTextFieldBall5VelY(final_velocityy_1);
      }
      
      if(ball2.getName().equals("Ball1") ){
          getFrame().setJTextFieldBall1VelX(final_velocityx_2);
          getFrame().setJTextFieldBall1VelY(final_velocityy_2);
      }else if (ball1.getName().equals("Ball2")){
          getFrame().setJTextFieldBall2VelX(final_velocityx_2);
          getFrame().setJTextFieldBall2VelY(final_velocityy_2);
      }else if (ball1.getName().equals("Ball3")){
          getFrame().setJTextFieldBall3VelX(final_velocityx_2);
          getFrame().setJTextFieldBall3VelY(final_velocityy_2);
      }else if (ball1.getName().equals("Ball4")){
          getFrame().setJTextFieldBall4VelX(final_velocityx_2);
          getFrame().setJTextFieldBall4VelY(final_velocityy_2);
      }else{
          getFrame().setJTextFieldBall5VelX(final_velocityx_2);
          getFrame().setJTextFieldBall5VelY(final_velocityy_2);
      }
      String str1 = ""; 
      str1 = str1 + timeInMillis + "";
      str1 = str1 + ","+ball1.getName()+"," + String.format("%.02f", ball1.getX()) + "," + String.format("%.02f", ball1.getY()) + "," + String.format("%d", ball1.getRadius()) 
                                    + "," + String.format("%.02f", ball1.getAngle()) + "," 
                                    + String.format("%.02f", ball1.getDx())+","+String.format("%.02f", ball1.getDy())+","+collisionType+"\n";
        try {
            getWriter().append(str1);
        } catch (IOException ex) {
            Logger.getLogger(GameStateAndAction.class.getName()).log(Level.SEVERE, null, ex);
        }
      String str2 = ""; 
      str2 = str2 + timeInMillis + "";
      str2 = str2 + ","+ball2.getName()+"," + String.format("%.02f", ball2.getX()) + "," + String.format("%.02f", ball2.getY()) + "," + String.format("%d", ball2.getRadius()) 
                                    + "," + String.format("%.02f", ball2.getAngle()) + "," 
                                    + String.format("%.02f", ball2.getDx())+","+String.format("%.02f", ball2.getDy())+","+collisionType+"\n";
       try {
            getWriter().append(str2);
        } catch (IOException ex) {
            Logger.getLogger(GameStateAndAction.class.getName()).log(Level.SEVERE, null, ex);
        }
       resetTimer();
       ball1.setX(ball1.getX()+ball1.getDx());
       ball1.setY(ball1.getY()+ball1.getDy());
       ball2.setX(ball2.getX()+ball2.getDx());
       ball2.setY(ball2.getY()+ball2.getDy());
   
    }
    public static void runGame() {

        while (isEndSignal() != true) {
            
            timeInMillis = timeInMillis + Calendar.getInstance().get(Calendar.MILLISECOND);
            Graphics2D g = (Graphics2D) getPanel().getGraphics();
            

            for (Ball b : getBalls()) {
                try {
                    String str = ""; 
                    str = str + timeInMillis + "";
                    switch (b.getName()) {
                        case "Ball1":
                            b.setAngle(getSliderAngle1());
                            b.setMass(getSliderMass1());
                            b.setRadius(getSliderRadius1());
                            str = str + ",Ball1," + String.format("%.02f", b.getX()) + "," + String.format("%.02f", b.getY()) + "," + String.format("%d", b.getRadius()) 
                                    + "," + String.format("%.02f", b.getAngle()) + "," + String.format("%.02f", b.getDx())+","+String.format("%.02f", b.getDy())+",\"\",\"\",\"\"\n";
                            getWriter().append(str);
                            if (isIsSpeedChanged1() == true) {
                                try {
                                    b.setSpeedMultiplier(getSpeed1());
                                    b.adjustDxDy();
                                } catch (Exception ex) {
                                    b.setSpeedMultiplier(0.01f);
                                }
                                setIsSpeedChanged1(false);
                            }
                            
                            break;
                        case "Ball2":
                            b.setAngle(getSliderAngle2());
                            b.setMass(getSliderMass2());
                            b.setRadius(getSliderRadius2());
                            str = str + ",Ball2," + String.format("%.02f", b.getX()) + "," + String.format("%.02f", b.getY()) + "," + String.format("%d", b.getRadius()) 
                                    + "," + String.format("%.02f", b.getAngle()) + "," + String.format("%.02f", b.getDx())+","+String.format("%.02f", b.getDy())+",\"\",\"\",\"\"\n";
                            getWriter().append(str);
                            if (isIsSpeedChanged2() == true) {
                                try {
                                    b.setSpeedMultiplier(getSpeed2());
                                    b.adjustDxDy();
                                } catch (Exception ex) {
                                    b.setSpeedMultiplier(0.01f);
                                }
                                setIsSpeedChanged2(false);
                            }
                           
                            break;
                        case "Ball3":
                            b.setAngle(getSliderAngle3());
                            b.setMass(getSliderMass3());
                            b.setRadius(getSliderRadius3());
                            str = str + ",Ball3," + String.format("%.02f", b.getX()) + "," + String.format("%.02f", b.getY()) + "," + String.format("%d", b.getRadius()) 
                                    + "," + String.format("%.02f", b.getAngle()) + "," + String.format("%.02f", b.getDx())+","+String.format("%.02f", b.getDy())+",\"\",\"\",\"\"\n";
                            getWriter().append(str);
                            if (isIsSpeedChanged3() == true) {
                                try {
                                    b.setSpeedMultiplier(getSpeed3());
                                    b.adjustDxDy();
                                } catch (Exception ex) {
                                    b.setSpeedMultiplier(0.01f);
                                }
                                setIsSpeedChanged3(false);
                            }
                           
                            break;
                        case "Ball4":
                            b.setAngle(getSliderAngle4());
                            b.setMass(getSliderMass4());
                            b.setRadius(getSliderRadius4());
                            str = str + ",Ball4," + String.format("%.02f", b.getX()) + "," + String.format("%.02f", b.getY()) + "," + String.format("%d", b.getRadius()) 
                                    + "," + String.format("%.02f", b.getAngle()) + "," + String.format("%.02f", b.getDx())+","+String.format("%.02f", b.getDy())+",\"\",\"\",\"\"\n";
                            getWriter().append(str);
                            if (isIsSpeedChanged4() == true) {
                                try {
                                    b.setSpeedMultiplier(getSpeed4());
                                    b.adjustDxDy();
                                } catch (Exception ex) {
                                    b.setSpeedMultiplier(0.01f);
                                }
                                setIsSpeedChanged4(false);
                            }
                           
                            break;
                        case "Ball5":
                            b.setAngle(getSliderAngle5());
                            b.setMass(getSliderMass5());
                            b.setRadius(getSliderRadius5());
                            str = str + ",Ball5," + String.format("%.02f", b.getX()) + "," + String.format("%.02f", b.getY()) + "," + String.format("%d", b.getRadius()) 
                                    + "," + String.format("%.02f", b.getAngle()) + "," + String.format("%.02f", b.getDx())+","+String.format("%.02f", b.getDy())+",\"\",\"\",\"\"\n";
                            getWriter().append(str);
                            if (isIsSpeedChanged5() == true) {
                                try {
                                    b.setSpeedMultiplier(getSpeed5());
                                    b.adjustDxDy();
                                } catch (Exception ex) {
                                    b.setSpeedMultiplier(0.01f);
                                }
                                setIsSpeedChanged5(false);
                            }
                            
                            break;
                    }
                } catch (Exception ex) {
                   
                }
                checkAndHandleCollision(b);
                g.setColor(b.getColor());
                g.fill(b.getShape());
                g.draw(b.getShape());
                b.move(getPanel().getBounds());
                getPanel().repaint();
               
            }
           
            
            try {
                
            } catch (Exception ex) {
            }
        }
    }

    public static void resetTimer() {
        timeInMillis = 1L;
        setIsTimerEnabled(false);
    }

}
