
package hospital_services_application;

public class TurnOnNotifications implements ICommand{

    Notifications notifications;

    public TurnOnNotifications(Notifications notifications) {
        super();
        this.notifications = notifications;
    }

    @Override
    public void execute() {
        notifications.turnOn();
    }
    
}
