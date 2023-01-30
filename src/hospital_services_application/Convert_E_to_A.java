 
package hospital_services_application;

import java.util.Scanner;

public class Convert_E_to_A   implements Arabic  {

 

    @Override
    public String Print_Arabic() {
        System.out.println("Converting process ...");
         Scanner r = new Scanner(System.in);
              String appointment[] = new String[3];
        String appointmentOnline[] = new String[3];
        appointment[0] = "0 : دكتورة سراء العتيبي ،15-2-2023 ،9 مساء ، السعر =150 ريال";
        appointment[1] = "1 : دكتورة شموخ سعد،15-2-2023 ،6 مساء ، السعر =150 ريال";
        appointment[2] = "2: دكتورة دانه احمد ،15-2-2023 ،6 مساء ، السعر =150 ريال";

        appointmentOnline[0] = " 0: دكتورة وعد العمري ،15-2-2023 ،8 مساء ، السعر =150 ريال";
        appointmentOnline[1] = " 1: دكتورة رزان المالكي ،15-2-2023 ،7 مساء ، السعر =150 ريال";
        appointmentOnline[2] = "2: دكتورة ربى الزهراني  ،15-2-2023 ،6 مساء ، السعر =150 ريال";
                   System.out.println("-------- خدمات المستشفى---------\n 1- مواعيد الاستشارة عبر الإنترنت\n"
                + " 2- مواعيد في المستشفى \n "
                + "------------------------------------");
            System.out.println("ادخل الخدمه التي تريدها :");
            String c = r.nextLine();
           // if(c.equals("مواعيد في المستشفى")){c="Appointment At hospital";}else if(c.equals("مواعيد الاستشارة عبر الإنترنت")){c="Online Consultaion Appointment";}
            if(c.equals("Appointment At hospital")){System.out.println("--------------تفاصيل المواعيد المتاحة في المستشفى-------------");
            for (int i = 0; i < appointment.length; i++) {
                System.out.println(appointment[i]);
            }
            System.out.println("--------------------------------------------------------");}
            else if(c.equals("Online Consultaion Appointment")){System.out.println("----------------تفاصيل مواعيد الاستشارة عبر الإنترنت------------");
            for (int i = 0; i < appointmentOnline.length; i++) {
                System.out.println(appointmentOnline[i]);
            }
            System.out.println("---------------------------------------------------");}   
return c;
   }
    
}
