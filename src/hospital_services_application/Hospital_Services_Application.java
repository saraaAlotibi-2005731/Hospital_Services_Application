package hospital_services_application;

import java.io.FileNotFoundException;
import java.util.*;

public class Hospital_Services_Application {

    public static void main(String[] args) throws FileNotFoundException {
        theMinu();

        
    }

    public static void theMinu() throws FileNotFoundException {
        Scanner r = new Scanner(System.in);
        Scanner rr = new Scanner(System.in);
        ArrayList Online = Database.get_appointment_online();
        ArrayList at_hospital = Database.get_appointment_info();

        String choice;
        int appointmentID = -1;
        int cost = 0;
        String second_choice = "";

        do {
            System.out.println("-------- Hospital services ---------\n - Online Consultaion Appointment\n"
                    + " - Appointment At hospital\n"
                    + " - Convert the language into Arabic\n"
                    + "------------------------------------");

            System.out.println("Select your services from the menu: ");
            choice = r.nextLine();

            if (choice.equalsIgnoreCase("Online Consultaion Appointment")) {
                OnlineConsultationINFO(Online);  

            } //----------------------------------------------------------------------------------
            else if (choice.equalsIgnoreCase("Convert the language into Arabic")) {

                Convert_E_to_A translator = new Convert_E_to_A();
                second_choice = translator.Print_Arabic();

                do {

                    System.out.print("اختر من القائمة: ");
                    appointmentID = rr.nextInt();

                } while (appointmentID < 0 || appointmentID > 2);

                System.out.print("أدخل التكلفة الإجمالية: ");
                cost = rr.nextInt();

                while (cost != 150) {

                    System.out.println("طريقة الدفع فشلت !! حاول مرة أخرى ...");
                    System.out.print("أدخل التكلفة الإجمالية:");
                    cost = rr.nextInt();
                }
            }

        } while ((!(choice.equalsIgnoreCase("Online Consultaion Appointment")) && !(choice.equalsIgnoreCase("Appointment At hospital")) && !(choice.equalsIgnoreCase("Convert the language into Arabic"))));

        if (!choice.equalsIgnoreCase("Convert the language into Arabic")) {

            do {

                System.out.print("select from the menu: ");
                appointmentID = rr.nextInt();

            } while (appointmentID < 0 || appointmentID > 2);

            System.out.print("Enter your total cost: ");
            cost = rr.nextInt();

            while (cost != 150) {

                System.out.println("payment method fail!! Try again.. ");
                System.out.print("Enter your total cost: ");
                cost = rr.nextInt();
            }
        }

        if (choice.equalsIgnoreCase("Convert the language into Arabic")) {

            choice = second_choice;
        }

        BookingAnAppointment s1 = new BookingAnAppointment();
        Appointment a = s1.selection(choice, appointmentID, cost);
        Appointment a2 = s1.selection(choice, appointmentID, cost);

        if (a instanceof OnlineConsultaionAppointment) {

            a.cost(cost);
            a.reservationInfo();
        } else if (a2 instanceof AppointmentAtHospital) {

            a2.cost(cost);
            a2.reservationInfo();
        }

    }

    public static void OnlineConsultationINFO(ArrayList Online) {
        System.out.println("----------------Online consultation INFO------------");
        for (int i = 0; i < Online.size(); i++) {

            System.out.println(Online.get(i));
        }

        System.out.println("---------------------------------------------------");

    }
}
