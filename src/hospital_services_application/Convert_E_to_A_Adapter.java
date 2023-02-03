package hospital_services_application;

import static hospital_services_application.Hospital_Services_Application_facade.notivication;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Convert_E_to_A_Adapter implements Arabic {
public Appointment Appointment;
   public String choice = "";
            
    @Override
    public String Print_Arabic() throws FileNotFoundException {
        
        System.out.println("Converting process ...");
        
        Scanner r = new Scanner(System.in);
        ArrayList at_hospital = Database.get_arabic_appointment_info();
        ArrayList Online = Database.get_arabic_appointment_online();
        
        do {

            System.out.println("-------- خدمات المستشفى---------\n 1- مواعيد الاستشارة عبر الإنترنت\n"
                    + " 2- مواعيد في المستشفى \n "
                    + " 3- تفعيل الإشعارات \n "
                    + "------------------------------------");

            System.out.println("ادخل الخدمه التي تريدها :");
            int c = r.nextInt();

            if (c == 2) {
                
                choice = "Appointment At hospital";
                System.out.println("--------------تفاصيل المواعيد المتاحة في المستشفى-------------");

                for (int i = 0; i < at_hospital.size(); i++) {

                    System.out.println(at_hospital.get(i));
                }

                System.out.println("--------------------------------------------------------");
                at_hospital.clear();
            }
            
            else if (c == 1) {
                
                choice = "Online Consultaion Appointment";
                System.out.println("----------------تفاصيل مواعيد الاستشارة عبر الإنترنت------------");
                for (int i = 0; i < Online.size(); i++) {

                    System.out.println(Online.get(i));
                }

                System.out.println("---------------------------------------------------");
                Online.clear();
            }
            
            else{ notificationOn();
              System.out.println("إشعارات تطبيق خدمات المستشفى قيد التشغيل ");
               
            }

        } while ((!(choice.equals("Online Consultaion Appointment")) && !(choice.equals("Appointment At hospital"))));

        return choice;
    }
        @Override
    public void Print_Arabic_reservation(Appointment a) throws FileNotFoundException{
            
        System.out.println("شكرا لك  :) ");
        System.out.println("--------------معلومات الحجز------------------------------");
        System.out.println("رقم الموعد: " +a.getAppointmentID() + " أضيف إلى ملف التعريف الخاص بك");
        System.out.println("نوع الموعد: " + a.getType());
        System.out.println("تكلفة الموعد = " + a.getCost());
        System.out.println("------------------------------------------------------------");
    }
    
    @Override
    public void print_Arabic_cost(int cost) {
        
        int price = 150;
        
        if (cost == price) {
            
            System.out.println("تمت طريقة الدفع بنجاح بمبلغ "+cost+"  ريال \n");

        } 
    }
}