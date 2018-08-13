import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * The CarCompany class is used to buy and rent cars from a car company. This class has twenty attributes.
 * @author 16033148, Keyur Khadka
 * @version 9th April 2017
 */


public class CarCompany implements ActionListener
{
    private JFrame frame;
    
    private JTextField txtPrice;
    private JTextField txtYear;
    private JTextField txtMileage;
    private JTextField txtDescription;
    private JTextField txtAdminFee;
    private JTextField txtDailyRate;
    private JTextField txtCustomerName;
    private JTextField txtRentalDate;
    private JTextField txtReturnDate;
    private JTextField txtNumberOfDays;
    private JTextField txtCarNumber;
    
    private JButton btnCarToBuy;
    private JButton btnCarToRent;
    private JButton btnBuyCar;
    private JButton btnRentCar;
    private JButton btnReturnCar;
    private JButton btnDisplayAll;
    private JButton btnClear;
    
    private ArrayList <Car> list;
    
    /**
     * Constructor with no parameter. All the components for the GUI is created here.
     */
    public CarCompany()
    {
        frame = new JFrame("Car Company");
        
        list = new ArrayList<>();
        
        JLabel lblPrice = new JLabel("Price: ");
        lblPrice.setBounds(0,0,150,30);
        frame.add(lblPrice);
        
        txtPrice = new JTextField();
        txtPrice.setBounds(0,30,150,30);
        frame.add(txtPrice);
        
        JLabel lblYear = new JLabel("Year: ");
        lblYear.setBounds(150,0,150,30);
        frame.add(lblYear);
        
        txtYear = new JTextField();
        txtYear.setBounds(150,30,150,30);
        frame.add(txtYear);
        
        JLabel lblMileage = new JLabel("Mileage: ");
        lblMileage.setBounds(300,0,150,30);
        frame.add(lblMileage);
        
        txtMileage = new JTextField();
        txtMileage.setBounds(300,30,150,30);
        frame.add(txtMileage);
        
        btnCarToBuy = new JButton("Add Car To Buy");
        btnCarToBuy.addActionListener(this);
        btnCarToBuy.setBounds(450,30,150,30);
        frame.add(btnCarToBuy);
        
        JLabel lblDescription = new JLabel("Description: ");
        lblDescription.setBounds(0,60,150,30);
        frame.add(lblDescription);
        
        txtDescription = new JTextField();
        txtDescription.setBounds(0,90,150,30);
        frame.add(txtDescription);
        
        JLabel lblAdminFee = new JLabel("Admin Fee: ");
        lblAdminFee.setBounds(150,60,150,30);
        frame.add(lblAdminFee);
        
        txtAdminFee = new JTextField();
        txtAdminFee.setBounds(150,90,150,30);
        frame.add(txtAdminFee);
        
        JLabel lblDailyRate = new JLabel("Daily Rate: ");
        lblDailyRate.setBounds(300,60,150,30);
        frame.add(lblDailyRate);
        
        txtDailyRate = new JTextField();
        txtDailyRate.setBounds(300,90,150,30);
        frame.add(txtDailyRate);
        
        btnCarToRent = new JButton("Add Car To Rent");
        btnCarToRent.addActionListener(this);
        btnCarToRent.setBounds(450,90,150,30);
        frame.add(btnCarToRent);
        
        JLabel lblCustomerName = new JLabel("Customer Name: ");
        lblCustomerName.setBounds(0,120,150,30);
        frame.add(lblCustomerName);
        
        txtCustomerName = new JTextField();
        txtCustomerName.setBounds(0,150,150,30);
        frame.add(txtCustomerName);
        
        JLabel lblRentalDate = new JLabel("Rental Date: ");
        lblRentalDate.setBounds(150,120,150,30);
        frame.add(lblRentalDate);
        
        txtRentalDate = new JTextField();
        txtRentalDate.setBounds(150,150,150,30);
        frame.add(txtRentalDate);
        
        JLabel lblReturnDate = new JLabel("Return Date: ");
        lblReturnDate.setBounds(300,120,150,30);
        frame.add(lblReturnDate);
        
        txtReturnDate = new JTextField();
        txtReturnDate.setBounds(300,150,150,30);
        frame.add(txtReturnDate);
        
        JLabel lblNumberOfDays = new JLabel("Number Of Days: ");
        lblNumberOfDays.setBounds(450,120,150,30);
        frame.add(lblNumberOfDays);
        
        txtNumberOfDays = new JTextField();
        txtNumberOfDays.setBounds(450,150,150,30);
        frame.add(txtNumberOfDays);
        
        JLabel lblCarNumber = new JLabel("Car Number: ");
        lblCarNumber.setBounds(0,180,150,30);
        frame.add(lblCarNumber);
        
        txtCarNumber = new JTextField();
        txtCarNumber.setBounds(0,220,150,30);
        frame.add(txtCarNumber);
        
        btnBuyCar = new JButton("Buy Car");
        btnBuyCar.addActionListener(this);
        btnBuyCar.setBounds(150,220,150,30);
        frame.add(btnBuyCar);
        
        btnRentCar = new JButton("Rent Car");
        btnRentCar.addActionListener(this);
        btnRentCar.setBounds(300,220,150,30);
        frame.add(btnRentCar);
        
        btnReturnCar = new JButton("Return Car");
        btnReturnCar.addActionListener(this);
        btnReturnCar.setBounds(450,220,150,30);
        frame.add(btnReturnCar);
        
        btnDisplayAll = new JButton("Display All");
        btnDisplayAll.addActionListener(this);
        btnDisplayAll.setBounds(0,280,300,30);
        frame.add(btnDisplayAll);
        
        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        btnClear.setBounds(300,280,300,30);
        frame.add(btnClear);
        
        frame.setLayout(null);
        frame.setSize(650,400);
        frame.setVisible(true);
    }
   
    /**
     * Accessor Method to get the car number. Exception handling is done by try/catch statement. 
     * The methods return type is void and access modifier is public.
     * This method checks if user input number is inside array index. If yes, carNumber is returned else error message pops up. 
     * -1 is returned at last.
     */
    public int getCarNumber()
    {
        int carNumber = -1;
        try {
            carNumber = Integer.parseInt(txtCarNumber.getText());
            if(carNumber > -1 && carNumber < list.size()) {
                return carNumber;
            } 
            else {
                JOptionPane.showMessageDialog(frame, "Invalid car number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid car number", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }
    
    /**
     * Method to add car to buy. Exception handling is done by try/catch statement.
     * The methods return type is void and access modifier is public.
     * This method checks if description, price, year and mileage are empty or 0. 
     * If not, object of CarToBuy is added to arraylist else error message pops up.
     */
    public void addCarToBuy()
    {
        try {
            String description = txtDescription.getText();
            int price = Integer.parseInt(txtPrice.getText());
            int year = Integer.parseInt(txtYear.getText());
            int mileage = Integer.parseInt(txtMileage.getText());
            if(price > 0 && year > 0 && mileage > 0 && !description.isEmpty()) {
                list.add(new CarToBuy(description, price, year, mileage));
                JOptionPane.showMessageDialog(frame, "Car successfully added for buying", "Car Added", JOptionPane.INFORMATION_MESSAGE);
            } 
            else {
                JOptionPane.showMessageDialog(frame, "Invalid input because Integer is 0 or less and/or string is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (Exception e) {
           JOptionPane.showMessageDialog(frame, "Please enter appropriate required values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Method to add car to rent. Exception handling is done by try/catch statement.
     * The methods return type is void and access modifier is public.
     * This method checks if description, adminFee and dailyRate are empty or 0.
     * If not, object of CarToRent is added to arraylist else error message pops up.
     */
    public void addCarToRent()
    {
        try {
            String description = txtDescription.getText();
            int adminFee = Integer.parseInt(txtAdminFee.getText());
            int dailyRate = Integer.parseInt(txtDailyRate.getText());
            if(!description.isEmpty() && adminFee > 0 && dailyRate > 0) {
                list.add(new CarToRent(description, adminFee, dailyRate));
                JOptionPane.showMessageDialog(frame, "Car successfully added for renting", "Car Added", JOptionPane.INFORMATION_MESSAGE);
            } 
            else {
                JOptionPane.showMessageDialog(frame, "Invalid input because Integer is 0 or less and/or string is empty", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Please enter appropriate required values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Method to buy the car. Exception handling is done by try/catch statement.
     * The methods return type is void and access modifier is public.
     * This method checks if carNumber is within array range or not. 
     * If yes, it again checks if carNumber is an instance of CarToBuy. If yes, type casting is done and buy method from CarToBuy is called.
     * Else error message pops up.
     */
    public void buyCar()
    {
        try {
            if(getCarNumber() > -1) {
                String customerName = txtCustomerName.getText();
                if(!customerName.isEmpty()) {
                    if(list.get(getCarNumber()) instanceof CarToBuy) {
                        CarToBuy carToBuyObj = (CarToBuy) list.get(getCarNumber());
                        carToBuyObj.buy(customerName);
                    }
                    else {
                        JOptionPane.showMessageDialog(frame, "There is no car for buying", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Cannot buy car because input is not as required", "Error", JOptionPane.ERROR_MESSAGE);
                }
           }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Please enter appropriate required values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Method to rent the car. Exception handling is done by try/catch statement.
     * The methods return type is void and access modifier is public.
     * This method checks if carNumber is within array range or not.
     * If yes, it checks if customerName, rentalDate, returnDate and numberOfDays are empty or 0. 
     * If yes, it again checks if carNumber is an instance of CarToRent. If yes, type casting is done and rentCar method from CarToRent is called.
     * Else error message pops up.
     */
    public void rentCar()
    {
        try {
            if(getCarNumber() > -1) {
                String customerName = txtCustomerName.getText();
                String rentalDate = txtRentalDate.getText();
                String returnDate = txtReturnDate.getText();
                int numberOfDays = Integer.parseInt(txtNumberOfDays.getText());
                if(!customerName.isEmpty() && !rentalDate.isEmpty() && !returnDate.isEmpty() && numberOfDays > 0) {
                    if(list.get(getCarNumber()) instanceof CarToRent) {
                        CarToRent carToRentObj = (CarToRent) list.get(getCarNumber());
                        carToRentObj.rentCar(customerName, rentalDate, returnDate, numberOfDays);
                    } 
                    else {
                        JOptionPane.showMessageDialog(frame, "There is no car for renting", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Unable to rent car because input is not as required", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Please enter appropriate required values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Method to return the car. Exception handling is done by try/catch statement.
     * The methods return type is void and access modifier is public.
     * This method initializes carNumber equal to array range. 
     * If carNumber is not equal to -1, it checks if carNumber is an instance of CarToRent.
     * If yes, type casting is done and returnCar method from CarToRent is called.
     * Else error message pops up.
     */
    public void returnCar()
    {
        try {
            int carNumber = getCarNumber();
            if(carNumber > -1) {
                if(list.get(carNumber) instanceof CarToRent) {
                    CarToRent carToRentOb = (CarToRent) list.get(carNumber);
                    carToRentOb.returnCar();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Cannot return car because the car has not been rented", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Please enter appropriate required values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    /**
     * Method to display all the details of the car. 
     * The methods return type is void and access modifier is public.
     */
    public void displayAll()
    {
        for (Car c: list) {
            System.out.println("Car Number: " +list.indexOf(c)); 
            if(c instanceof CarToBuy) {
                CarToBuy carToBuy = (CarToBuy) c;
                carToBuy.display();
            } 
            else if(c instanceof CarToRent) {
                CarToRent carToRent = (CarToRent) c;
                carToRent.display();
            }
        }
    }
    
    /**
     * Method to clear all the texts from the textfield.
     * The methods return type is void and access modifier is public.
     */
    public void clear()
    {
        txtPrice.setText("");
        txtYear.setText("");
        txtMileage.setText("");
        txtDescription.setText("");
        txtAdminFee.setText("");
        txtDailyRate.setText("");
        txtCustomerName.setText("");
        txtRentalDate.setText("");
        txtReturnDate.setText("");
        txtNumberOfDays.setText("");
        txtCarNumber.setText("");
    }
    
    /**
     * Method to override the method from Interface ActionListener class.
     * The methods return type is void and access modifier is public.
     * This method checks which button triggered the event. When a button triggers an event, the method corresponding to the button is called.
     */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource() == btnCarToBuy) {
           addCarToBuy();
       } 
       else if (e.getSource() == btnCarToRent) {
           addCarToRent();
       } 
       else if (e.getSource() == btnBuyCar) {
           buyCar();
       } 
       else if (e.getSource() == btnRentCar) {
           rentCar();
       } 
       else if (e.getSource() == btnReturnCar) {
           returnCar();
       } 
       else if (e.getSource() == btnDisplayAll) {
           displayAll();
       } 
       else if (e.getSource() == btnClear) {
           clear();
       }
    }
    
    /**
     * This is the main method. Constructor is called in this main method.
     */
    public static void main(String[] args)
    {
        new CarCompany();
    }
}