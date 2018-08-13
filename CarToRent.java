
/**
 * CarToRent is a subclass of the parent class Car.
 * 
 * @author 16033148, Keyur Khadka
 * @version 29th December 2016
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class CarToRent extends Car
{
    private String rentalDate;
    private String returnDate;
    private int adminFee;
    private int numberOfDays;
    private int dailyRate;
    private int totalAccumulated;
    private boolean onLoan;
    private JFrame frame;
    
    /**
     * Constructor with three parameters.
     */
    public CarToRent(String description, int adminFee, int dailyRate)
    {
        super(description);
        this.adminFee = adminFee;
        this.dailyRate = dailyRate;
        rentalDate = "";
        returnDate = "";
        numberOfDays = 0;
        totalAccumulated = 0;
        onLoan = false;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getRentalDate
     * Return type: String
     * Access modifier: public
     */
    public String getRentalDate()
    {
        return rentalDate;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getReturnDate
     * Return type: String
     * Access modifier: public
     */
    public String getReturnDate()
    {
        return returnDate;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getAdminFee
     * Return type: int
     * Access modifier: public
     */
    public int getAdminFee()
    {
        return adminFee;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getNumberOfDays
     * Return type: int
     * Access modifier: public
     */
    public int getNumberOfDays()
    {
        return numberOfDays;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getDailyRate
     * Return type: int
     * Access modifier: public
     */
    public int getDailyRate()
    {
        return dailyRate;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getTotalAccumulated
     * Return type: int
     * Access modifier: public
     */
    public int getTotalAccumulated()
    {
        return totalAccumulated;
    }
    
    /**
     * Getter/Accessor (method)
     * Method: getOnLoan
     * Return type: boolean
     * Access modifier: public
     */
    public boolean isOnLoan()
    {
        return onLoan;
    }
    
    /**
     * Setter/Mutator (method)
     * Method: setDailyRate
     * Parameter: dailyRate of type int
     * Return type: void
     * Access modifier: public
     */
    public void setDailyRate(int dailyRate)
    {
        this.dailyRate = dailyRate;
    }
    
    /**
     * Setter/Mutator (method)
     * Method: setAdminFee
     * Parameter: adminFee of type int
     * Return type: void
     * Access modifier: public
     */
    public void setAdminFee(int adminFee)
    {
        this.adminFee = adminFee;
    }
    
    /**
     * Method to rent the car with three parameters.
     */
    public void rentCar(String customersName, String rentalDate, String returnDate, int numberOfDays)
    {
        if (onLoan == true) {
            JOptionPane.showMessageDialog(frame, "The car has already been rented", "Sorry", JOptionPane.ERROR_MESSAGE);
        }
        else {
            super.setCustomersName(customersName);
            this.rentalDate = rentalDate;
            this.returnDate = returnDate;
            this.numberOfDays = numberOfDays;
            onLoan = true;
            totalAccumulated = totalAccumulated + ((dailyRate * numberOfDays) + adminFee);
            JOptionPane.showMessageDialog(frame, "Car has been successfully rented", "Car Rented", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     * Method to return the car.
     */
    public void returnCar()
    {
        if(onLoan == true) {
            super.setCustomersName("");
            numberOfDays = 0;
            rentalDate = "";
            returnDate = "";
            onLoan = false;
            JOptionPane.showMessageDialog(frame, "Car has been successfully returned", "Car Returned", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(frame, "You cannot return the car because you have not rented the car yet.", "Sorry", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Method to print the description and total accumulated.
     */
    public void printDescription()
    {
        System.out.println(super.getDescription() + "\nTotal Accumulated = " +totalAccumulated);
    }
    
    /**
     * Method to display the details of the car.
     */
    public void display()
    {
        super.display();
        System.out.println("Admin fee: " +adminFee+ "\nDaily rate: " +dailyRate);
        if(onLoan == true) {
            System.out.println("Rental Date: " +rentalDate+ "\nReturn Date: " +returnDate+ "\nNumber of days: " +numberOfDays);
        }
        System.out.println("\n");
    }
    
}