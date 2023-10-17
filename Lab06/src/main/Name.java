package main;

/**
 * A class to represent someones name.
 * 
 * @author Will Otterbein.
 * @version 2023-1
 */
public class Name {
    /** The first name. */
    private String firstName; 
    
    /** The middle name. */
    private String middleName; 
    
    /** The last name. */
    private String lastName;
    
    /**
     * Constructor sets the firstName, middleName, lastName.
     * 
     * @param fName fName
     * @param mName mName
     * @param lName lName
     */
    public Name(String fName, String mName, String lName) {
    	if (!fName.isBlank() && !fName.isEmpty())
            setFirstName(fName);
    	else
    		firstName = "JANE";
    	if (!mName.isBlank() && !mName.isEmpty())
            setMiddleName(mName);
    	else
    		middleName = "OLIVE";
    	if (!lName.isBlank() && !lName.isEmpty())
            setLastName(lName);
    	else
    		lastName = "DOE";
    }
    
    /**
     * Gets the firstName.
     * 
     * @return firstName.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the firstName.
     * 
     * @param newString is the new String
     */
    public void setFirstName(String newString) {
    	if (!newString.isEmpty() && !newString.isBlank()) {
    		String name = newString.toLowerCase();
    		String firstLetter = name.substring(0, 1).toUpperCase();
    		firstName = firstLetter + name.substring(1);
    	}
    }
    
    /**
     * Gets the middleName.
     * 
     * @return middleName.
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * Sets the middleName.
     * 
     * @param newString is the new String
     */
    public void setMiddleName(String newString) {
    	if (!newString.isEmpty() && !newString.isBlank()) {
    		String name = newString.toLowerCase();
    		String firstLetter = name.substring(0, 1);
    		middleName = firstLetter + name.substring(1);
    	}
    }
    
    /**
     * Gets the lastName.
     * 
     * @return lastName.
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Sets the lastName.
     * 
     * @param newString is the new String
     */
    public void setLastName(String newString) {
    	if (!newString.isEmpty() && !newString.isBlank()) {
    		String name = newString.toLowerCase();
    		String firstLetter = name.substring(0, 1);
    		lastName = firstLetter + name.substring(1);
    	}
    }
    
    /**
     * Calculates and returns the length of the name.
     * 
     * @return length
     */
    public int nameLength() {
        int length = firstName.length() 
                + middleName.length() + lastName.length();
        return length;
    }
    
    /**
     * Returns three capital initials.
     * 
     * @return initials
     */
    public String initials() {
        String initials = firstName.substring(0, 1).toUpperCase()
               + middleName.substring(0, 1).toUpperCase()
               + lastName.substring(0, 1).toUpperCase();
        return initials;
    }
    
    /**
     * Returns the char at index n.
     * 
     * @param n index
     * @return ourChar char at index n
     */
    public char getCharAt(int n) {
    	char ourChar= '@';
    	if (n >= 0 && n < this.toString().length()) {
    		ourChar = this.toString().charAt(n);
    	}
        return ourChar;
    }
    
    /**
     * Returns a formatted name.
     * 
     * @return fmt formatted string
     */
    public String formatName() {
        String fmt = firstName + ", " + middleName + ", " + lastName;
        return fmt;
    }
    
    /**
     * Determines if a string is the same as the first name.
     * 
     * @param str the string to compare
     * @return isSame are they the same
     */
    public boolean isSameFirstName(String str) {
        boolean isSame = firstName.equals(str); 
        return isSame;
    }
    
    /**
     * Sees if two name objects are trued.
     * 
     * @param name the name to be compared
     * @return boolean
     */
    public boolean isSameName(Name name) {
        boolean isSame = true;
        if (!this.firstName.equals(name.firstName)
                && !this.middleName.equals(name.middleName) 
                && !this.lastName.equals(name.lastName)) {
            isSame = false;
        }
        return isSame;
    }
    
    /**
     * Returns the String which represents the full name.
     * 
     * @return returns the concatenated names.
     */
    public String toString() {
        return (firstName + " " + middleName + " " + lastName);
    }
}
