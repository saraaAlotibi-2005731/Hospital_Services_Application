package hospital_services_application;



public abstract class Appointment {

    private int appointmentID;
    private int price;
    private String type;

    public Appointment(String Type, int appointmentID, int price) {
        
        this.appointmentID = appointmentID;
        this.price = price;
        this.type = Type;
    }

    public void reservationInfo() {
        
        System.out.println("Thank you :) ");
        System.out.println("--------------RESERVATION INFO------------------------------");
        System.out.println("The apoointment number " + appointmentID + " has added to your profile");
        System.out.println("The Type of the appointment: " + type);
        System.out.println("The cost of the appoentment = " + price);
        System.out.println("------------------------------------------------------------");
    }

    public void cost(int costt) {
        
        int w = 150;
        
        if (costt == w) {
            
            System.out.println("The payment moethod has done successfully with 150 Rs \n");

        } else {
            
            System.out.println("The payment method fail");
        }
    }
}
