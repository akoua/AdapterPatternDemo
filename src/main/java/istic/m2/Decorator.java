package istic.m2;

public abstract class Decorator implements Notifier {

    protected Notifier notifier;

    public Decorator(Notifier notifier) {
        super();
        this.notifier = notifier;
    }

    public abstract void send(String message);
}
