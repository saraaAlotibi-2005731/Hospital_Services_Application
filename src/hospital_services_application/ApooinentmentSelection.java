package hospital_services_application;

public class ApooinentmentSelection {

    public static Appointment selection(String s, int price, int num) {
        Appointment apo;

        if (s.equalsIgnoreCase("Online consultaion Appointment")) {
            return apo = new OnlineConsultaionAppointment(s, price, num);

        } else if (s.equalsIgnoreCase("Appointment At hospital")) {
            return apo = new AppointmentAtHospital(s, price, num);
        }
        return null;
    }

}
