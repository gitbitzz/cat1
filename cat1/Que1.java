import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        
        customer.enterName("John Doe");
        customer.enterDOB(new Date(1990, 5, 15));
        customer.enterAddress("123 Main Street, City");
        customer.enterRegistrationDate(new Date(2022, 1, 1));
        customer.enterNationality("USA");
        
        // Accessing customer information
        String name = customer.getName();
        Date dob = customer.getDOB();
        String address = customer.getAddress();
        Date registrationDate = customer.getRegistrationDate();
        String nationality = customer.getNationality();
        
        // Displaying customer information
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Address: " + address);
        System.out.println("Registration Date: " + registrationDate);
        System.out.println("Nationality: " + nationality);
    }
}
