package hospital_services_application;

import java.io.FileNotFoundException;

public interface Arabic {
    
    public String Print_Arabic() throws FileNotFoundException; 
    public void Print_Arabic_reservation(Appointment a) throws FileNotFoundException;
    public void print_Arabic_cost(int cost);
}
