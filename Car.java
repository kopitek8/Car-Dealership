
/**
 * This is a parent class Car which has two attributes.
 * 
 * @author 16033148, Keyur Khadka
 * @version 29th December 2016
 */
public class Car
{
    private String description;
    private String customersName;
    
    /**
     * Constructor with one parameter. 
     */
    public Car(String description)
    {
        this.description = description;
        customersName = "";
    }
    
    /**
     * Setter/Mutator (method)
     * Method: setCustomersName
     * Parameter: customersName of type String
     * Return type: void
     * Access modifier: public
     */
    public void setCustomersName(String customersName)
    {
        this.customersName = customersName;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getDescription
     * Return type: String
     * Access modifier: public
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getCustomersName
     * Return type: String
     * Access modifier: public
     */
    public String getCustomersName()
    {
        return customersName;
    }
    
    /**
     * Method to display description and customer's name.
     */
    public void display()
    {
        System.out.println("Description: " +description);
        if(!customersName.equals("")) {
            System.out.println("Customer Name: " +customersName);
        }
    }
}
