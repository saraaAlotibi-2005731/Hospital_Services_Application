package hospital_services_application;

public class TurnOffNotifications implements ICommand{
    
    Notifications notifications;

    public TurnOffNotifications(Notifications notifications) {
        
        super();
        this.notifications = notifications;
    }

    @Override
    public void execute() {
        
        notifications.turnOff();
    }
}