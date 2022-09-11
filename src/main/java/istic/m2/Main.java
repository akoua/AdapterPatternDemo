package istic.m2;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        Notifier notifier = new BasicNotifier();
        notifier.send("Email!");

//        notifier = new SmsDecoratorNotifier(notifier);
//        notifier.send("Sms!");

        notifier = new FacebookDecoratorNotifier(notifier);
        notifier.send("Facebook!");

        System.out.println("\n<-------------------------------->\n");

        //we want to notify by email, facebook and also sms at the same time
        Notifier notifier2 = new BasicNotifier();
        client.setDecorator(notifier2);
        notifier2 = new SmsDecoratorNotifier(notifier2);
        client.setDecorator(notifier2);
        notifier2 = new FacebookDecoratorNotifier(notifier2);
        client.setDecorator(notifier2);
        notifier2.send("Server is down!!!!");
    }
}
