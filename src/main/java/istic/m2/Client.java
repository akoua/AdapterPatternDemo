package istic.m2;

public class Client {

    private Notifier notifier;
    private NewInterface notifier2;

    public void process(String message) {
        notifier.send(message);
        //notifier2.newSend(message);
    }

    public void setDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

}
