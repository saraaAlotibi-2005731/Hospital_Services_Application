
package hospital_services_application;

public class NotificationsScreen {
    
    ICommand command;
    
    public void SetCommand(ICommand command){
        this.command=command;
    }
    
    public void ClickOnNotifications(){
        command.execute();
    }
}
