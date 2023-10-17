package main;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * A class to test the various geometry classes.
 * 
 * @author Will Otterbein
 * @version 2023-1
 */
public class GeometryDriver {
    
    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat dcfmt = new DecimalFormat("#.###");
        
        // Sphere stuff
        Sphere sphere = getSphere(sc);
        System.out.println("Sphere surface area: " 
                + dcfmt.format(sphere.surfaceArea()));
        System.out.println("Sphere volume: " 
                + dcfmt.format(sphere.volume()));
        
        // Cube stuff
        Cube cube = getCube(sc);
        System.out.println("Cube surface area: " 
                + dcfmt.format(cube.surfaceArea()));
        System.out.println("Cube volume: " 
                + dcfmt.format(cube.volume()));
        System.out.println("Cube face diagonal: " 
                + dcfmt.format(cube.faceDiagonal()));
        System.out.println("Cube space diagonal: " 
                + dcfmt.format(cube.spaceDiagonal()));
        
        // Cone stuff
        Cone cone = getCone(sc);
        System.out.println("Cone volume: " 
                + dcfmt.format(cone.volume()));
        System.out.println("Cone slant height: " 
                + dcfmt.format(cone.slantHeight()));
        System.out.println("Cone surface area: " 
                + dcfmt.format(cone.surfaceArea()));
        
        sc.close();
    }
    
    /**
     * Creates a sphere.
     * 
     * @param sc sc
     * @return sphere with scanned attributes
     */
    public static Sphere getSphere(Scanner sc) {
        System.out.println("Enter the radius for a sphere: ");
        double sRad = sc.nextDouble();
        System.out.println("Enter the x coordinate for a sphere: ");
        double sX = sc.nextDouble();
        System.out.println("Enter the y coordinate for a sphere: ");
        double sY = sc.nextDouble();
        System.out.println("Enter the z coordinate for a sphere: ");
        double sZ = sc.nextDouble();
        
        Sphere sphere = new Sphere(sX, sY, sZ, sRad);
        
        return sphere;
    }
    
    /**
     * Creates a cube.
     * 
     * @param sc sc
     * @return cube with scanned attributes
     */
    public static Cube getCube(Scanner sc) {
        System.out.println("Enter the edge length for a cube: ");
        double el = sc.nextDouble();
        System.out.println("Enter the center x coordinate for a cube: ");
        double cuX = sc.nextDouble();
        System.out.println("Enter the center y coordinate for a cube: ");
        double cuY = sc.nextDouble();
        System.out.println("Enter the center z coordinate for a cube: ");
        double cuZ = sc.nextDouble();
        
        Cube cube = new Cube(cuX, cuY, cuZ, el);
        
        return cube;
    }
    
    /**
     * Creates a cone.
     * 
     * @param sc sc
     * @return cone with scanned attributes
     */
    public static Cone getCone(Scanner sc) {
        System.out.println("Enter the radius for a cone: ");
        double r = sc.nextDouble();
        System.out.println("Enter the height for a cone: ");
        double h = sc.nextDouble();
        
        Cone cone = new Cone(r, h);
        
        return cone;
    }
}
