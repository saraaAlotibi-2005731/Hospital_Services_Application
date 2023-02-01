package hospital_services_application;




import java.io.*;
import java.util.*;

public class Database {
    
    private static Database DB;
    private static ArrayList appointment_info = new ArrayList();
    private static ArrayList appointment_online = new ArrayList();
    private static ArrayList arabic_appointment_info = new ArrayList();
    private static ArrayList arabic_appointment_online = new ArrayList();
    private static File info = new File("appointment_info.txt");
    private static File online = new File("appointment_online.txt");
    private static File arabic_info = new File("arabic_appointment_info.txt");
    private static File arabic_online = new File("‏‏arabic_appointment_online.txt");
    
    private Database() {}

    public static ArrayList get_appointment_info() throws FileNotFoundException {
        
        if(DB == null){
            
            DB = new Database();
    	}
	
        if (!info.exists()) {
            
            System.out.println("appointment_info.txt file is not found, Please try again.");
            System.exit(0);
        }
        
        Scanner reader = new Scanner(info);
        
        while (reader.hasNext()) {
            
            appointment_info.add(reader.nextLine());
        }
        
	return DB.appointment_info;
    }
    
    public static ArrayList get_appointment_online() throws FileNotFoundException {
        
        if(DB == null){
            
            DB = new Database();
    	}
	
        if (!online.exists()) {
            
            System.out.println("appointment_online.txt file is not found, Please try again.");
            System.exit(0);
        }
        
        Scanner reader = new Scanner(online);
        
        while (reader.hasNext()) {
            
            appointment_online.add(reader.nextLine());
        }
        
	return DB.appointment_online;
    }
    
    public static ArrayList get_arabic_appointment_info() throws FileNotFoundException {
        
        if(DB == null){
            
            DB = new Database();
    	}
	
        if (!arabic_info.exists()) {
            
            System.out.println("arabic_appointment_info.txt file is not found, Please try again.");
            System.exit(0);
        }
        
        Scanner reader = new Scanner(arabic_info);
        
        while (reader.hasNext()) {
            
            arabic_appointment_info.add(reader.nextLine());
        }
        
	return DB.arabic_appointment_info;
    }
    
    public static ArrayList get_arabic_appointment_online() throws FileNotFoundException {

        if (DB == null) {

            DB = new Database();
        }

        if (!arabic_online.exists()) {

            System.out.println("appointment_online.txt file is not found, Please try again.");
            System.exit(0);
        }

        Scanner reader = new Scanner(arabic_online);

        while (reader.hasNext()) {

            arabic_appointment_online.add(reader.nextLine());
        }

        return DB.arabic_appointment_online;
    }
}
