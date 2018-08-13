
/**
 * CarToBuy is a subclass of parent class Car.
 * 
 * @author 16033148, Keyur Khadka 
 * @version 29th December 2016
 */
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class CarToBuy extends Car
{
    private int price;
    private int registrationYear;
    private int mileage;
    private boolean sold;
    private JFrame frame;
    /**
     * Constructor with four parameters.
     */
    public CarToBuy(String description, int price, int registrationYear, int mileage)
    {
        super(description);
        this.price = price;
        this.registrationYear = registrationYear;
        this.mileage = mileage;
        sold = false;
    }

    /**
     * Setter/Mutator (method)
     * Method: setPrice
     * Parameter: price of type int
     * Return type: void
     * Access modifier: public
     */
    public void setPrice(int price)
    {
        if (sold == true) {
            JOptionPane.showMessageDialog(frame, "The car has already been sold", "Sorry", JOptionPane.ERROR_MESSAGE);
        }
        else {
            this.price = price;
        }
    }
    
    /**
     * Method to buy the car with one parameter.
     */
    public void buy(String customersName)
    {
        if (sold == true) {
            JOptionPane.showMessageDialog(frame, "The car has already been sold", "Sorry", JOptionPane.ERROR_MESSAGE);
        }
        else {
            super.setCustomersName(customersName);
            sold = true;
            JOptionPane.showMessageDialog(frame, "Car has been successfully bought", "Car Bought", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getPrice
     * Return type: int
     * Access modifier: public
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getRegistrationYear
     * Return type: int
     * Access modifier: public
     */
    public int getRegistrationYear()
    {
        return registrationYear;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getMileage
     * Return type: int
     * Access modifier: public
     */
    public int getMileage()
    {
        return mileage;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: isSold
     * Return type: boolean
     * Access modifier: public
     */
    public boolean isSold()
    {
        return sold;
    }
    
    /**
     * Method to display the details of the car.
     */
    public void display()
    {
        super.display();
        if (sold == false) {
            System.out.println("Price: " +price+ "\nRegistration Year: " +registrationYear+ "\nMileage: " +mileage);
        }
        System.out.println("\n");
    }
    
}
