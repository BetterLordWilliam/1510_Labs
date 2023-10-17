package main;

/**
 * Class to represent the geometric shape of a cube.
 * 
 * @author Will Otterbein
 * @version 2023-1
 */
public class Cube {
    /** X coordinate. */
    private double xCoord;
    
    /** Y coordinate. */
    private double yCoord;
    
    /** Z coordinate. */
    private double zCoord;
    
    /** Edge length. */
    private double edgeLength;
    
    /**
     * Constructs a sphere with the given attributes.
     * 
     * @param x x
     * @param y y
     * @param z z
     * @param el el
     */
    public Cube(double x, double y, double z, double el) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
        edgeLength = el;
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
     * Gets edgeLength.
     * 
     * @return edgeLength.
     */
    public double getEdgeLength() {
        return edgeLength;
    }
    
    /**
     * Sets edgeLength.
     * 
     * @param el el
     */
    public void setEdgeLength(double el) {
        edgeLength = el;
    }
    
    /**
     * Calculates and returns the surface area of the cube.
     * 
     * @return sa
     */
    public double surfaceArea() {
        double sa = 6 * Math.pow(edgeLength, 2);
        return sa;
    }
    
    /**
     * Calculates and returns the volume of the cube.
     * 
     * @return vol
     */
    public double volume() {
        double vol = Math.pow(edgeLength, 3);
        return vol;
    }
    
    /**
     * Calculates and returns the faceDiagonal of the cube.
     * 
     * @return fd
     */
    public double faceDiagonal() {
        double fd = Math.sqrt(2) * edgeLength;
        return fd;
    }
    
    /**
     * Calculates and returns the spaceDiagonal of the cube.
     * 
     * @return sd
     */
    public double spaceDiagonal() {
        double sd = Math.sqrt(3) * edgeLength;
        return sd;
    }
    
    /**
     * Returns a string which represents the cube.
     * 
     * @return objectString
     */
    public String toString() {
        String objectString = "";
        return objectString;
    }
}

