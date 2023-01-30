package hospital_services_application;



public class ApooinentmentSelection {

    public static Appointment selection(String s, int num, int price) {
        
        Appointment apo;

        if (s.equalsIgnoreCase("Online consultaion Appointment")) {
            
            return apo = new OnlineConsultaionAppointment(s, num, price);

        } else if (s.equalsIgnoreCase("Appointment At hospital")) {
            
            return apo = new AppointmentAtHospital(s, num, price);
        }
        
        return null;
    }
}
