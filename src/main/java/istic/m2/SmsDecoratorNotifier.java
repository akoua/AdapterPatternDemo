package istic.m2;

/**
 * La carte de credit permet de faire office du compte en banque
 */
public class SmsDecoratorNotifier extends Decorator {

    public SmsDecoratorNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("--------SmsDecoratorNotifier----------");
        notifier.send(message);
        System.out.println("Sms notification: " + message);
        System.out.println("---------------------------------------");
    }

}
