package main;

/**
 * Class to represent a geometric cone.
 * 
 * @author Will Otterbein
 * @version 2023-1
 */
public class Cone {
    /** Radius. */
    private double radius;
    
    /** Height. */
    private double height;
    
    /**
     * Constructor assigns radius and height values.
     * 
     * @param r radius
     * @param h height
     */
    public Cone(double r, double h) {
        radius = r;
        height = h;
    }
    
    /**
     * Get radius.
     * 
     * @return radius
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Set radius.
     * 
     * @param r radius
     */
    public void setRadius(double r) {
        radius = r;
    }
    
    /**
     * Get height.
     * 
     * @return height
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Set height.
     * 
     * @param h heigth
     */
    public void setHeight(double h) {
        height = h;
    }
    
    /**
     * Calculates and returns the volume of the cone.
     * 
     * @return vol
     */
    public double volume() {
        double vol = ((double) 1/3) * Math.PI * Math.pow(radius, 2) * height;
        return vol;
    }
    
    /**
     * Calculates and returns the slant height of the cone.
     * 
     * @return sh
     */
    public double slantHeight() {
        double sh = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return sh;
    }
    
    /**
     * Calculates and returns the surface area of the cone.
     * 
     * @return sa
     */
    public double surfaceArea() {
        double sa = (Math.PI * Math.pow(radius, 2)) 
                + (Math.PI * radius) 
                * (Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
        return sa;
    }
    
    /**
     * Returns a string which represents the cone.
     * 
     * @return objectString
     */
    public String toString() {
        String objectString = "Radius: " + radius + ", Height: " + height 
                + ", volume: " + volume() + ", slant height: " + slantHeight() 
                + ", surface area: " + surfaceArea();
        return objectString;    
    }
}
