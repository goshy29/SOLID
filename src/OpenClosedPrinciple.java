public class OpenClosedPrinciple {
    //This principle states that “software entities (classes, modules, functions, etc.)
    // should be open for extension, but closed for modification” which means you should
    // be able to extend a class behavior, without modifying it.
}

    // BAD PRACTICE !!
class NotificationServiceOCP{
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}

    // GOOD PRACTICE !!
interface NotificationServiceOCPInterface{
    public void sendOTP(String medium);
    public void sendTransactionNotification(String medium);
}
class EmailNotification implements NotificationServiceOCPInterface{
    public void sendOTP(String medium){
        // write Logic using JavaEmail api
    }
    public void sendTransactionNotification(String medium){
    }
}
class MobileNotification implements NotificationServiceOCPInterface{
    public void sendOTP(String medium){
// write Logic using Twilio SMS API
    }
    public void sendTransactionNotification(String medium){
    }
}
class WhatsAppNotification implements NotificationServiceOCPInterface{
    public void sendOTP(String medium){
// write Logic using whatsapp API
    }
    public void sendTransactionNotification(String medium){
    }
}
