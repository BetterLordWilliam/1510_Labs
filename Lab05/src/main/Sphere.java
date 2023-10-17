package main;

/**
 * Class to represent a sphere.
 * 
 * @author Will Otterbein
 * @version 2023-1
 */
public class Sphere {
    /** X coordinate. */
    private double xCoord;
    
    /** Y coordinate. */
    private double yCoord;
    
    /** Z coordinate. */
    private double zCoord;
    
    /** Radius. */
    private double radius;
    
    /**
     * Constructor assigns xCoord, yCoord, zCoord and radius.
     * 
     * @param x x
     * @param y y
     * @param z z
     * @param r r
     */
    public Sphere(double x, double y, double z, double r) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
        radius = r;
    }
    
    /**
     * Gets X.
     * 
     * @return xCoord
     */
    public double getX() {
        return xCoord;
    }
    
    /**
     * Sets X.
     * 
     * @param x x
     */
    public void setX(double x) {
        xCoord = x;
    }
    
    /**
     * Gets Y.
     * 
     * @return yCoord
     */
    public double getY() {
        return yCoord;
    }
    
    /**
     * Sets Y.
     * 
     * @param y y
     */
    public void setY(double y) {
        yCoord = y;
    }
    
    /**
     * Gets Z.
     * 
     * @return zCoord
     */
    public double getZ() {
        return zCoord;
    }
    
    /**
     * Sets Z.
     * 
     * @param z z
     */
    public void setZ(double z) {
        zCoord = z;
    }
    
    /**
     * Gets radius.
     * 
     * @return radius.
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Sets radius.
     * 
     * @param r r
     */
    public void setRadius(double r) {
        radius = r;
    }
    
    /**
     * Calculates and returns the surface area of a sphere.
     * 
     * @return sa, 4 * pi * r^2
     */
    public double surfaceArea() {
        double sa = 4 * Math.PI * Math.pow(radius, 2);
        return sa;
    }
    
    /**
     * Calculates and returns the volume of a sphere.
     * 
     * @return vol, 4/3 * pi * r^3
     */
    public double volume() {
        double vol = ((double) 4/3) * Math.PI * Math.pow(radius, 3);
        return vol;
    }
    
    /**
     * Returns a string which represents the sphere object.
     * 
     * @return objectString
     */
    public String toString() {
        String objectString = "X: " + xCoord + ", Y: " + yCoord + ", Z: " + zCoord
               + ", volume: " + volume() + ", surface area: " + surfaceArea();
        return objectString;
    }
}
