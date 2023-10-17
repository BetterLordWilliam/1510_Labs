package main;

/**
 * Class to test the name object.
 * 
 * @author Will Otterbein
 * @version 2023-1
 */
public class NameDriver {
    
    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Name willOtterbein = new Name("will", "jordan", "otterbein");
        Name jeanDoe =  new Name ("jean", "harold", "doe");
        
        // Test the name length
        System.out.println("Name length: " + willOtterbein.nameLength());
        
        // Test the capitalized initials
        System.out.println("Capitalized initials: " + willOtterbein.initials());
        
        // Test the charAtN
        int one = 1;
        int two = 2;
        int three = 3;
        
        System.out.println("String at n: " + willOtterbein.getCharAt(one));
        System.out.println("String at n: " + willOtterbein.getCharAt(two));
        System.out.println("String at n: " + willOtterbein.getCharAt(three));
        
        // Test the formattedName
        System.out.println("Formatted name: " + willOtterbein.formatName());
        
        // Test the isFirstName
        String test = "will";
        
        System.out.println("Is " + test + " the same as the first name: " 
                + willOtterbein.isSameFirstName(test));
        
        // Test the isSameName
        System.out.println("Is " + jeanDoe + " the same as the other name: " 
                + willOtterbein.isSameName(jeanDoe));
    }
}
