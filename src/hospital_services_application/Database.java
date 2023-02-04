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
    private static File arabic_online = new File("arabic_appointment_online.txt");
    
    private Database() {}

    public static Database getDB(){
        
        if(DB == null){
            
            DB = new Database();
    	}
        
        return DB;
    } 
    public ArrayList get_appointment_info() throws FileNotFoundException {
        
            if (!info.exists()) {

                System.out.println("appointment_info.txt file is not found, Please try again.");
                System.exit(0);
            }

            Scanner reader = new Scanner(info);

            while (reader.hasNext()) {

                appointment_info.add(reader.nextLine());
            }
    	
	return appointment_info;
    }
    
    public ArrayList get_appointment_online() throws FileNotFoundException {
        
            if (!online.exists()) {

                System.out.println("appointment_online.txt file is not found, Please try again.");
                System.exit(0);
            }

            Scanner reader = new Scanner(online);

            while (reader.hasNext()) {

                appointment_online.add(reader.nextLine());
            }
	
        return appointment_online;
    }
    
    public ArrayList get_arabic_appointment_info() throws FileNotFoundException {
        
        if (!arabic_info.exists()) {
            
            System.out.println("arabic_appointment_info.txt file is not found, Please try again.");
            System.exit(0);
        }
        
        Scanner reader = new Scanner(arabic_info);
        
        while (reader.hasNext()) {
            
            arabic_appointment_info.add(reader.nextLine());
        }
        
	return arabic_appointment_info;
    }
    
    public ArrayList get_arabic_appointment_online() throws FileNotFoundException {

        if (!arabic_online.exists()) {

            System.out.println("arabic_appointment_online.txt file is not found, Please try again.");
            System.exit(0);
        }

        Scanner reader = new Scanner(arabic_online);

        while (reader.hasNext()) {
            
            arabic_appointment_online.add(reader.nextLine());
        }
        
        return arabic_appointment_online;
    }
}