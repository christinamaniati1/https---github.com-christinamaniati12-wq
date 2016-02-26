/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballsV2;

import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author AKN
 */
public class Ball {

    /**
     * Moves the ball to the next position, reversing direction if it hits one
     * of the edges
     */
  
    private Color color;
    private String name;
    private double speedMultiplier;
    private int radius;
    private double x;
    private double y;
    private double dx;
    private double dy;
    private float angle; 
    //Mass of an Object Ranging from 1 to 10(Default:1)
    private int mass;
   
    
    

    Ball() {
    
    }

    
   
    public void move(Rectangle2D bounds) {
     if(this.speedMultiplier!=0){    
        int breadth = (int)bounds.getWidth();
        int height =(int) bounds.getHeight();
          
            this.setX(this.getX()+this.getDx()*Math.cos(Math.toRadians(getAngle())));
            this.setY(this.getY()+this.getDy()*Math.sin(Math.toRadians(getAngle())));
           if (this.getX() < 0) {
                this.setX(0);
                this.setDx(-this.getDx());
                
             }
            if (this.getY() < 0) {
                this.setY(0);
                this.setDy(-this.getDy());
                
            }
             if ((this.getX() > breadth-this.getRadius()*2)) {
               this.setDx(-this.getDx());
               this.setX(this.getX()+this.getDx());
             }
             if ((this.getY() > height - this.getRadius()*2)) {
                this.setDy(-this.getDy());
                this.setY(this.getY()+this.getDy());
             }
      }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ball other = (Ball) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

   

    public double getSpeedMultiplier() {
        return speedMultiplier;
    }

    public void setSpeedMultiplier(double speedMultiplier) {
        this.speedMultiplier = speedMultiplier; 
    }
    public void adjustDxDy(){
        this.setDx(speedMultiplier);
        this.setDy(speedMultiplier);
    }

    /**
     * Gets the shape of the ball at its current position.
     *
     * @return
     */
    public Ellipse2D getShape() {
       Ellipse2D ellipse =new Ellipse2D.Double(getX(), getY(), getRadius()*2, getRadius()*2);
       
       return ellipse;
    }

    /**
     * @return the c
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param c the c to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the tag
     */
    public String getName() {
        return name;
    }

    /**
     * @param tag the tag to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the dx
     */
    public double getDx() {
        return dx;
    }

    /**
     * @param dx the dx to set
     */
    public void setDx(double dx) {
        this.dx = dx;
    }

    /**
     * @return the dy
     */
    public double getDy() {
        return dy;
    }

    /**
     * @param dy the dy to set
     */
    public void setDy(double dy) {
        this.dy = dy;
    }

    /**
     * @return the angle
     */
    public float getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(float angle) {
        this.angle = angle;
    }

    /**
     * @return the mass
     */
    public int getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(int mass) {
        this.mass = mass;
    }

   

   

   

}
