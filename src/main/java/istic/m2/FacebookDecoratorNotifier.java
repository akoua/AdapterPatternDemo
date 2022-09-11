package istic.m2;

/**
 * La carte de credit permet de faire office du compte en banque
 */
public class FacebookDecoratorNotifier extends Decorator {

    public FacebookDecoratorNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.println("--------FacebookDecoratorNotifier----------");
        notifier.send(message);
        System.out.println("Facebook notification: " + message);
        System.out.println("---------------------------------------");
    }

}
