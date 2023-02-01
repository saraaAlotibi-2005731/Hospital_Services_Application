package hospital_services_application;

 


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Convert_E_to_A implements Arabic  {

    String choice;
            
    @Override
    public String Print_Arabic() throws FileNotFoundException {
        
        System.out.println("Converting process ...");
        
        Scanner r = new Scanner(System.in);
        ArrayList at_hospital = Database.get_arabic_appointment_info();
        ArrayList Online = Database.get_arabic_appointment_info();
        
        do {
            
            System.out.println("-------- خدمات المستشفى---------\n 1- مواعيد الاستشارة عبر الإنترنت\n"
                + " 2- مواعيد في المستشفى \n "
                + "------------------------------------");

            System.out.println("ادخل الخدمه التي تريدها :");
            choice = r.nextLine();
        
            // if(c.equals("مواعيد في المستشفى")){c="Appointment At hospital";}else if(c.equals("مواعيد الاستشارة عبر الإنترنت")){c="Online Consultaion Appointment";}
            if(choice.equals("Appointment At hospital")){
                
                System.out.println("--------------تفاصيل المواعيد المتاحة في المستشفى-------------");
                
                for (int i = 0; i < at_hospital.size(); i++) {

                    System.out.println(at_hospital.get(i));
                }
                
                System.out.println("--------------------------------------------------------");
            }
            
            else if(choice.equals("Online Consultaion Appointment")){
                
                System.out.println("----------------تفاصيل مواعيد الاستشارة عبر الإنترنت------------");
                for (int i = 0; i < Online.size(); i++) {
                    
                    System.out.println(Online.get(i));
                }
                
                System.out.println("---------------------------------------------------");
            }
            
        }while ((!(choice.equals("Online Consultaion Appointment")) && !(choice.equals("Appointment At hospital"))));
        
        return choice;
    }
}
