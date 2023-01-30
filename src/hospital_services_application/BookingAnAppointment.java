package hospital_services_application;

public class BookingAnAppointment {

    public static Appointment selection(String s, int appointmentID,int price) {
        Appointment apo;

        if (s.equalsIgnoreCase("Online consultaion Appointment")) {
            return apo = new OnlineConsultaionAppointment(s,appointmentID,price);

        } else if (s.equalsIgnoreCase("Appointment At hospital")) {
            return apo = new AppointmentAtHospital(s, appointmentID, price);
        }
        return null;
    }

}
