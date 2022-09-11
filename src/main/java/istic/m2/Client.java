package istic.m2;

public class Client {

    private Notifier notifier;

    public void process(String message) {
        notifier.send(message);
    }

    public void setDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

}
