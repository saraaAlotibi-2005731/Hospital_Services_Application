package hospital_services_application;

import java.util.Scanner;

public class Hospital_Services_Application {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Scanner rr = new Scanner(System.in);

        String appointment_info[] = new String[3];
        String appointment_online[] = new String[3];

        appointment_info[0] = "0: Dr Saraa A-lOtabi, 15-2-2023 9 AM , The cost 150 Rs";
        appointment_info[1] = "1: Dr Shomokh Saad, 15-2-2023 11 AM , The cost 150 Rs";
        appointment_info[2] = "2: Dr Dana Ahmed,15-2-2023 2 PM , The cost 150 Rs";

        appointment_online[0] = "0: Dr Waed Al-Amri, 15-2-2023 9 AM , The cost 150 Rs";
        appointment_online[1] = "1: Dr Ruba Bakhet, 15-2-2023 10 AM , The cost 150 Rs";
        appointment_online[2] = "2: Dr Razan Saud, 15-2-2023 5 PM , The cost 150 Rs";

        System.out.println("-------- Hospital services ---------\n - Online Consultaion Appointment\n"
                + " - Appointment At hospital \n "
                + "-\n"
                + "------------------------------------");
        System.out.println("Select your services from the menu: ");
        String choice = r.nextLine();

        if (choice.equalsIgnoreCase("Online Consultaion Appointment")) {
            System.out.println("----------------Online consultation INFO------------");
            for (int i = 0; i < appointment_online.length; i++) {
                System.out.println(appointment_online[i]);

            }
            System.out.println("---------------------------------------------------");

        } else if (choice.equalsIgnoreCase("Appointment At hospital")) {
            System.out.println("--------------Appointment At hospital INFO-------------");
            for (int i = 0; i < appointment_info.length; i++) {
                System.out.println(appointment_info[i]);

            }
            System.out.println("--------------------------------------------------------");
        }
        System.out.print("select from the menu: ");
        int num = rr.nextInt();

        System.out.print("Enter your total cost: ");
        int cost = rr.nextInt();
        while (cost != 150) {
            System.out.println("payment method fail!! Try again.. ");
            System.out.print("Enter your total cost: ");
            cost = rr.nextInt();
        }

        ApooinentmentSelection s1 = new ApooinentmentSelection();

        Appointment a = s1.selection(choice, num, cost);
        Appointment a2 = s1.selection(choice, num, cost);
        if (a instanceof OnlineConsultaionAppointment) {

            a.cost(cost);
            a.reservationInfo();
        } else if (a2 instanceof AppointmentAtHospital) {

            a2.cost(cost);
            a2.reservationInfo();

        }

    }
}
